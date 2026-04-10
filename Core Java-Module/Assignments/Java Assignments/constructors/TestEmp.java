class Employee{
    int id;
    String name;
    double salary;




    Employee(){
        this.id=2;
        this.name="Abc";
        this.salary=20000;
    }
    

    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }


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
        System.out.println("id :  "  + this.id);
        System.out.println("name : " + this.name);
        System.out.println("salary : " + this.salary);
    }
}
public class TestEmp{
    public static void main(String[] args) {
        Employee E1,E2 ;
     
        E1=new Employee();

        E2=new Employee(1,"Sanchit",40000);

        E1.setId(1);
        E1.setName("Snehal");
        E1.setSalary(600000);


        E1.getId();
        E1.getName();
        E1.getSalary();

        E1.display();
        E2.display();

    }
}