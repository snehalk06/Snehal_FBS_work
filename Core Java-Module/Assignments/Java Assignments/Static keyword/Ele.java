class ElectricityBill
{
    static double rateperUnit;
    String CustomerName;
    int counstomerid;
    double units;

    public ElectricityBill(String customerName,int Customerid,double units)
    {
        this.CustomerName=customerName;
        this.counstomerid=Customerid;
        this.units=units;
    }

    static void updateRate(double newRate)
    {
        rateperUnit=newRate;
    
    }
    double calculateBill()
    {
        return units*rateperUnit;
    }
    void displayBill(){

        System.out.println("Customer Name: "+this.CustomerName);
        System.out.println("Customer Id: "+this.counstomerid);
        System.out.println("Toatal Units: "+this.units);
        System.out.println("Rate per units:"+ElectricityBill.rateperUnit);
        System.out.println("Total Bill: "+calculateBill());
    }

}
public class Ele{
    public static void main(String[] args) {
        ElectricityBill e1=new ElectricityBill("Snehal",1, 106);
        ElectricityBill e2=new ElectricityBill("Sanchit", 2, 118);
        e1.displayBill();
        e2.displayBill();

         System.out.println("------After Rate Update------");
         ElectricityBill.updateRate(8);
         e1.displayBill();
         e2.displayBill();


    }
}