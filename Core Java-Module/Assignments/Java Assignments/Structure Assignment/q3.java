class Employee{
    int id;
    String name;
    double salary;


    void setId(int i)
    {
        this.id=i;
    }
    void setName(String str)
    {
        this.name=str;
    }
    void setSalary(double d)
    {
        this.salary=d;
    }


    int getId()
    {
        return this.id;
    }

    String  getName()
    {
        return this.name;
    }

    double getSalary()
    {
        return this.salary;
    }

    void display()
    {
        System.out.println("id: "+this.id +"name: "+this.name +"salary: "+this.salary);
    }
}
public class q3{
    public static void main(String[] args) {
        Employee E1;
        E1=new Employee();
        E1.setId(1);
        E1.setName("Snehal");
        E1.setSalary(600000);


        E1.getId();
        E1.getName();
        E1.getSalary();

        E1.display();

    }
}