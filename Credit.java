final class Credit extends Course
{
    private final int credit;

    public Credit(String name, int credit)
    {
        super(name);
        this.credit = credit;
        System.out.println(super.getName() + ": " + this.credit + " credits");
    }
}