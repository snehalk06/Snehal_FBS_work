class Admin{
    int id;
    String name;
    double salary;
    double allowance;

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
    void setAllowance(double dd)
    {
        this .allowance=dd;
    }


    int getId()
    {
        return this.id;
    }

    String getName()
    {
        return this.name;
    }
    double  getSalary()
    {
        return this.salary;

    }

    double getAllowance()
    {
        return this.allowance;
    }


   void display()
{
    System.out.println("id: " + this.id);
    System.out.println("name: " + this.name);
    System.out.println("salary: " + this.salary);
    System.out.println("allowance: " + this.allowance);
}

}





public class q4 {
    public static void main(String[] args) {
        Admin A1;//reference
        A1=new Admin();

        A1.setId(1);
        A1.setName("Snehal");
        A1.setSalary(600000);
        A1.setAllowance(4000);



        A1.getId();
        A1.getName();
        A1.getSalary();
        A1.getAllowance();

        A1.display();
    }


    
}
