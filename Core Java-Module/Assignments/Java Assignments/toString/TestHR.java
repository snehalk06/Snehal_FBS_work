class HR{
     int id;
    String name;
    double salary;
    double commission;

    HR() {

        this.id=1;
        this.name="Snehal";
        this.salary=895895;
        this.commission=6794;
    }

     HR(int id, String name, double salary, double commission) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
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

    @Override
    public String toString() {
        return  
    "id: " + this.id+"name: " + this.name+"salary: " + this.salary+"commission: " + this.commission;
}
    }


   



public class TestHR {
    public static void main(String[] args) {
        HR H1,H2;//reference
        H1=new HR();

        H2=new HR(2,"Prarik",6809809,87589);

        H1.setId(1);
        H1.setName("Snehal");
        H1.setSalary(600000);
        H1.setCommission(4000);



        H1.getId();
        H1.getName();
        H1.getSalary();
        H1.getCommission();

        System.out.println(H1.toString());
        System.out.println(H2.toString());
    }

    
}
