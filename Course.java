class Course 
{
    private String name;
    private double grade;
    
    public Course(String name)
    {
        this.name = name;
        this.grade = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    public double getGrade()
    {
        return this.grade;
    }

    public void tostring()
    {
        System.out.println(this.name + ": " + this.grade);
    }
}