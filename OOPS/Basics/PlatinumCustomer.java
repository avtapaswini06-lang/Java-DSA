public class PlatinumCustomer extends Customer{
    double credits;
    public PlatinumCustomer(int id,String name,String mobileno,String email,double credits)
    {
        super(id,name,mobileno,email);
        this.credits=credits;
    }
    public void DisplayDetails()
    {
       System.out.println(id);
       System.out.println(name);
       System.out.println(mobileno);
       System.out.println(email);
       System.out.println(credits);
    }
}