class PlacedStudent{
    int frn;
    String studentName, companyName, designation;
    int distanceCovered;

     PlacedStudent() {

        this.frn=37;
        this.studentName="pratik";
        this.companyName="Tcs";
        this.designation="Software develeoper";
    }

    public PlacedStudent(int frn, String studentName, String companyName, String designation, int distanceCovered) {
        this.frn = frn;
        this.studentName = studentName;
        this.companyName = companyName;
        this.designation = designation;
        this.distanceCovered = distanceCovered;
    }
     







    

    void setFrn(int i)
    {
        this.frn=i;
    }

    void setStudentName(String name)
    {
        this.studentName=name;
    }

    void setdistanceCovered(int d)
    {
        this.distanceCovered=d;
    }

    void setCompanyName(String cname)
    {
        this.companyName=cname;
    }

    void setDesignation(String des)
    {
        this.designation=des;
    }

    int getFrn()
    {
        return this.frn;
    }

    String getStudentName()
    {
        return this.studentName;
    }

    int getdistancecovered()
    {
        return this.distanceCovered;
    }

    String getCompanyName()
    {
        return this.companyName;
    }

    String getDesignation()
    {
        return this.designation;
    }

    void display()
    {
        System.out.println("FRN : " + this.frn);
        System.out.println("Name : " + this.studentName);
        System.out.println("Distance Covered : " + this.distanceCovered);
        System.out.println("Company Name : " + this.companyName);
        System.out.println("Designation : " + this.designation);
    }
}

public class TestPlceStu{
    public static void main(String[] args) {

        PlacedStudent S1,S2;
        S1=new PlacedStudent();

        S2=new PlacedStudent(1,"pratik","Tcs","Software developer",3);

        S1.setFrn(18);
        S1.setStudentName("Snehal");
        S1.setdistanceCovered(2);
        S1.setCompanyName("TCS");
        S1.setDesignation("Software Engineer");

        
        S1.getFrn();
        S1.getStudentName();
        S1.getdistancecovered();
        S1.getCompanyName();
        S1.getDesignation();    
        S1.display();
        S2.display();
    }
}