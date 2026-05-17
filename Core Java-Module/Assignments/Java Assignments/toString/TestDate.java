class Date{
    int day,month,year;

    Date(){
        this.day=1;
        this.month=1;
        this.year=2025;

    }

     Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
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

   public String toString()
    {
        return this.day+"/"+this.month+"/"+this.year;
    }

    

}

public class TestDate
{
    public static void main(String[] args) {
        Date d1,d2;


        d1=new Date();
        
        d2=new Date(1,2,2004);

        d1.setDay(1);
        d1.setMonth(2);
        d1.setYear(2025);


        d1.getDay();
        d1.getMonth();
        d1.getYear();


       System.out.println(d1.toString());
       System.out.println(d2.toString());






    }
}