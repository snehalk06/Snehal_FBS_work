class Time{
    int hr,min,sec;

    //constructor
    Time(int h,int m,int s )
    {
        this.hr=h;
        this.min=m;
        this.sec=s;

    }
    //Add two Time Objects
    void add(Time t){

        int s=this.sec+t.sec;
        int m=this.min+t.min+s/60;
        int h=this.hr+t.hr+m/60;

        s = s%60;
        m = m%60;
        h = h%24;

        display(h,m,s);

    }
    //Add Seconds
    void add(int seconds)
    {
        int s=this.sec+seconds;
        int m=this.min+s/60;
        int h=this.hr+m/60;

        s=s%60;
        m=m%60;
        h=h%24;

        display(h,m,s);
    }

    //Add minuntes
    void addMinutes(int minutes)
    {
        int m=this.min+minutes;
        int h=this.hr+m/60;

        m=m%60;
        h=h%24;

        display(h,m,this.sec);


    }
      
    void addHours(int hours){
        int h=(this.hr+hours)%24;
        display(h,min,sec);
    }
     void display(int h, int m, int s) {
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }

}


public class TestTimeAddition {
    public static void main(String[] args) {
        Time t1=new Time(10,20,30);
        Time t2=new Time(5,50,40);
        System.out.println("Add time objects: ");
        t1.add(t2);

        System.out.println("Add seconds: ");
        t1.add(500);

        System.out.println("Add minutes");
        t1.addMinutes(125);

        System.out.println("Add hours: ");
        t1.addHours(5);
    }

    
}
