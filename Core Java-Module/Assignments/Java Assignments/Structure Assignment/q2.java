class Student{
    String name;
    int frn,distanceCovered;

    void setName(String str)
    {
        this.name=str;
    }

    void setFrn(int i)
    {
        this.frn=i;
    }

    void setdistanceCovered(int d)
    {
        this.distanceCovered=d;
    }

    String getName()
    {
        return this.name;
    }

    int getFrn()
    {
        return this.frn;
    }

    int getdistancecovered()
    {
        return this.distanceCovered;
    }

    void display()
    {
        System.out.println("Name :  "  + this.name);
        System.out.println("FRN : " + this.frn);
        System.out.println("Distance Covered : " + this.distanceCovered);
    }
}

public class q2{
    public static void main(String[] args) {

        Student S1;
        S1=new Student();

        S1.setName("Snehal");
        S1.setFrn(18);
        S1.setdistanceCovered(2);

    
    S1.getName();
    S1.getFrn();
    S1.getdistancecovered();



        S1.display();
    }
}