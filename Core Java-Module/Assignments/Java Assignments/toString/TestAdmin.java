class Admin{
    int id;
    String name;
    double salary;
    double allowance;

     Admin() {
        this.id=1;
        this.name="pratik";
        this.salary=987854;
        this.allowance=7548;
    }

     Admin(int id, String name, double salary, double allowance) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
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


   public  String  toString()
{
   return "Id:"+this.id+"\nname:"+this.name+"\nsalary:"+this.salary+"\nallowance:"+this.allowance;

}





public class TestAdmin{
    public static void main(String[] args) {
        Admin A1,A2;//reference
        A1=new Admin();


        A2=new Admin(1,"Pratik",89469856,8754);

        A1.setId(1);
        A1.setName("Snehal");
        A1.setSalary(600000);
        A1.setAllowance(4000);



        A1.getId();
        A1.getName();
        A1.getSalary();
        A1.getAllowance();

       System.out.println(A1.toString());
       System.out.println(A2.toString());
    }

}
    
}
