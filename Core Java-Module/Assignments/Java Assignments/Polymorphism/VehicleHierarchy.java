class Vehicle{
    int vehicleNumber;
    int  model;
    String companyName;
    int noofWheels;
    double price;

    public Vehicle()
    {
        this.vehicleNumber=2444;
        this.model=2008;
        this.companyName="SuzukiAccess";
        this.noofWheels=2;
        this.price=100000;
    }
    public Vehicle(int vehicleNumber,int model,String companyName,int noofWheels,double price){
        this.vehicleNumber=vehicleNumber;
        this.model=model;
        this.companyName=companyName;
        this.noofWheels=noofWheels;
        this.price=price;
    }

        void display()
        {
            System.out.println("Vechicleno:"+this.vehicleNumber);
            System.out.println("model:"+this.model);
            System.out.println("companyName:"+this.companyName);
            System.out.println("noofWheels:"+this.noofWheels);
            System.out.println("price:"+this.price);
        }
}

class Bike extends Vehicle{
    int noofstands;
    int noofHelmets;
    String bikeCategory;

    public Bike(){
        super();
        this.noofstands=2;
        this.noofHelmets=2;
        this.bikeCategory="not given";
    }
    public Bike(int vehicleNumber,int model,String companyName,int noofWheels,double price,int noofstands,int noofHelmets,String bikeCategory){
        super(vehicleNumber, model, companyName, noofWheels, price);
        this.noofstands=noofstands;
        this.noofHelmets=noofHelmets;
        this.bikeCategory=bikeCategory;

    }
    void display()
    {
        super.display();
        System.out.println("noofstands:"+this.noofstands);
        System.out.println("noofHelmets:"+this.noofHelmets);
        System.out.println("bikeCategory:"+this.bikeCategory);
    }
}

class Car extends Vehicle{
    String hasPowerSteering;
    String driveMode;
    int parkingAssitSensors;

 
public Car()
{
    super();
    this.hasPowerSteering="Yes";
    this.driveMode="Auto";
    this.parkingAssitSensors=1;

}

public Car(int vehicleNumber,int model,String companyName,int noofWheels,double price,String hasPowerSteering,String driveMode,int parkingAssitSensors){
    super(vehicleNumber, model, companyName, noofWheels, price);
    this.hasPowerSteering=hasPowerSteering;
    this.driveMode=driveMode;
    this.parkingAssitSensors=parkingAssitSensors;
}

void display()
{
    super.display();
    System.out.println("hasPowerSteering:"+this.hasPowerSteering);
    System.out.println("driveMode:"+this.driveMode);
    System.out.println("parkingAssitSensors:"+this.parkingAssitSensors);
}
}
class Bus extends Vehicle
{
    int passengerCapacity;
    int standingCapacity;



    public Bus()
    {
        super();
        this.passengerCapacity=40;
        this.standingCapacity=10;
    }
    public Bus(int vehicleNumber,int model,String companyName,int noofWheels,double price,int passengerCapacity,int standingCapacity){
        super(vehicleNumber, model, companyName, noofWheels, price);
        this.passengerCapacity=passengerCapacity;
     
        this.standingCapacity=standingCapacity;
    }

    void display(){
        super.display();
        System.out.println("passengerCapacity:"+this.passengerCapacity);
        System.out.println("standingCapacity:"+this.passengerCapacity);
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v=new Bike(1646,2008,"and",2,8978677,2,2,"abc");
        v.display();


        v= new Car(2444,2004,"sdk",4,893489,"abc","pqr",2);
        v.display();
        
        
        v=new Bus(7834,6387,"dhdj",8,500000,40,10);
        v.display();


    
    
    }


    
}
