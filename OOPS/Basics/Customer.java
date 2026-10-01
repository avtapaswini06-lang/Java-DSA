public class Customer {
    int id;
    String name;
    String mobileno;
    String email;
    public Customer(int id,String name,String mobileno,String email)
    {
        this.id=id;
        this.name=name;
        this.mobileno=mobileno;
        this.email=email;
    }
    public void DisplayDetails()
    {
       System.out.println(id);
       System.out.println(name);
       System.out.println(mobileno);
       System.out.println(email);
    }
}
