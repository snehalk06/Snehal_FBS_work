class Date{
    int day,month,year;
    

    void setDay(int d)
    {
        this.day=d;

    }
    void setMonth(int M)
    {
        this.month=M;
    }
    void setYear(int y)
    {
        this.year=y;
    }

    int getDay()
    {
        return this.day;
    }

    int getMonth()
    {
        return this.month;
    
    }
    int getYear()
    {
        return this.year;
    }

    void display()
    {
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }

    

}

public class q1
{
    public static void main(String[] args) {
        Date d1,d2;


        d1=new Date();
        
        d2=new Date();

        d1.setDay(1);
        d1.setMonth(2);
        d1.setYear(2025);




        d2.setDay(10);
        d2.setMonth(4);
        d2.setYear(2026);


        d1.getDay();
        d1.getMonth();
        d1.getYear();


        d2.getDay();
        d2.getMonth();
        d2.getYear();


        d1.display();
        d2.display();






    }
}