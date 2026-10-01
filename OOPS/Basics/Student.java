class Student
{
    int id;
    String name;
    String department;
    double per;
    public Student(int id,String name,String department,double percentage)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.per=percentage;
    }
    public void listenToClass()
    {
        System.out.println("Student is listeninh the class.");
    }
    public void takeNotes()
    {
        System.out.println("Student is taking notes from the lesson.");
    }
    public void doAssignment()
    {
        System.out.println("Student is doing assignment by understanding");
    }
    public void displayDetails()
    {
       System.out.println(id);
       System.out.println(name);
       System.out.println(department);
       System.out.println(per);
    }
    public static void main(String[] args)
    {
        Student s1=new Student(101,"raja","CSE",95);
        Student s2=new Student(102,"hari","CSE",97);
        s1.displayDetails();
        s2.displayDetails();
        s2.doAssignment();
    }
}