import java.util.ArrayList;

class Student 
{
    private String name;
    private double grade;
    private ArrayList<Course> enroll;
    
    public Student(String name, ArrayList<Course> enroll)
    {
        this.name = name;
        this.enroll = enroll;
        this.changeGrade(enroll);
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getGrade() 
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    public boolean enroll(Course course)
    {
        if(this.getGrade() >= 2.5)
        {
            enroll.add(course);

            return true;
        } else System.out.println("Cannot enroll " + course.getName() + " because your GPA is " + this.grade + "\n");

        return false;
    }

    public ArrayList<Course> getEnroll()
    {
        return enroll;
    }

    public void update()
    {
        double sum = 0;

        for(Course c: enroll)
        {
            sum += c.getGrade();
        }

        this.setGrade(sum / enroll.size());
    }

    public void changeGrade(Course course, double grade)
    {
        course.setGrade(grade);
        this.update();
    }

    public void changeGrade(ArrayList<Course> enroll)
    {
        for(Course c: enroll)
        {
            this.changeGrade(c, 0);
        }
    }

    public void tostring()
    {
        for(Course c: this.enroll)
        {
            c.tostring();
        }
        
        System.out.println(this.name + ": " + this.grade + "\n");
    }

    public boolean pass()
    {
        boolean check = false;
        ArrayList<Course> temp = new ArrayList<>();

        for(Course c: this.enroll)
        {
            if(c.getGrade() < 1) 
            {
                System.out.println("Sorry, " + c.getName() + " not pass the requirement");
                temp.add(c);
                check = true;
            }
        }

        this.enroll = temp;

        if(check) 
        {
            this.changeGrade(this.enroll);

            return false;
        }

        return true;
    }

    public String toString()
    {
        return this.getName() + ": " + this.getGrade();
    }
}