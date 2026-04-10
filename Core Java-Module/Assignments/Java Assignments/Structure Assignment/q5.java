class HR{
     int id;
    String name;
    double salary;
    double commission;

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
    void setCommission(double dd)
    {
        this.commission=dd;
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

    double getCommission()
    {
        return this.commission;
    }


   void display()
{
    System.out.println("id: " + this.id);
    System.out.println("name: " + this.name);
    System.out.println("salary: " + this.salary);
    System.out.println("commission: " + this.commission);
}
}






public class q5 {
    
     public static void main(String[] args) {
        HR H1;//reference
        H1=new HR();

        H1.setId(1);
        H1.setName("Snehal");
        H1.setSalary(600000);
        H1.setCommission(4000);



        H1.getId();
        H1.getName();
        H1.getSalary();
        H1.getCommission();

        H1.display();
    }
    
}
