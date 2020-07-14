import java.util.ArrayList;
import java.util.Scanner;

class Enrollment
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double grade;
        String name;

        Course java = new Credit("Java", 3);
        Course read = new Credit("Reading", 2);
        Course math = new Credit("Math", 2);
        Course data = new Credit("Data", 3);
        System.out.println();

        ArrayList<Course> sub = new ArrayList<>();
        sub.add(java);
        sub.add(read);
        sub.add(math);

        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enrollment? (press 'q' to quit): ");
        String con = scan.next();

        while(!con.equalsIgnoreCase("q"))
        {
            if(con.equalsIgnoreCase("y"))
            {
                System.out.print("Name: ");
                name = scan.next();

                Student s = new Student(name, sub);
                list.add(s);

                s.tostring();

                for(int i = 0; i < s.getEnroll().size(); i++)
                {
                    Course c = s.getEnroll().get(i);
                    System.out.print(c.getName() + " grade: ");
                    grade = scan.nextDouble();
                    s.changeGrade(c, grade);
                }

                if(s.pass()) 
                {
                    System.out.println("Congrats!");
                    s.enroll(data);
                }
                
                s.tostring();

                System.out.print("Continue? (press 'q' to quit): ");
                con = scan.next();
            } else
            {
                System.out.print("Try again (press 'y' to continue, press 'q' to quit): ");
                con = scan.next();
            }
        }

        for(Student s: list) System.out.println(s.toString());

        scan.close();
    }
}