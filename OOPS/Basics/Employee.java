public class Employee {
    int id;
    String name;
    String department;
    double sal;
    public Employee(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.sal=salary;
    }
    public void listenToClass()
    {
        System.out.println("Employee is listening to the class.");
    }
    public void takeNotes()
    {
        System.out.println("Employee is taking notes from the lesson.");
    }
    public void doAssignment()
    {
        System.out.println("Employee is doing assignment by understanding");
    }
    public void displayDetails()
    {
       System.out.println(id);
       System.out.println(name);
       System.out.println(department);
       System.out.println(sal);
    }
    public static void main(String[] args)
    {
        Employee e1=new Employee(101,"raja","Sales",50000);
        Employee e2=new Employee(102,"hari","Finance",100000);
        e1.displayDetails();
        e2.displayDetails();
        e2.doAssignment();
    }
}
