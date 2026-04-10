class SalesManager{
    int id;
    String name;
    double salary;
    double incentive;
    double target;

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
    void setIncentive(double dd)
    {
        this.incentive=dd;
    }

    void setTarget(double ddd)
    {
        this.target=ddd;
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

    double getIncentive()
    {
        return this.incentive;
    }
    double getTarget()
    {
        return this.target;
    }


   void display()
{
    System.out.println("id: " + this.id + " name: " + this.name + " salary: " + this.salary + " incentive : " + this.incentive + "target : " +this.target);
}
}


    





public class q6 {
    public static void main(String[] args) {
        SalesManager S1;//reference
        S1=new SalesManager();

        S1.setId(1);
        S1.setName("Snehal");
        S1.setSalary(600000);
        S1.setIncentive(4000);
        S1.setTarget(878900);



        S1.getId();
        S1.getName();
        S1.getSalary();
        S1.getIncentive();
        S1.getTarget();

        S1.display();
    }
    
}
