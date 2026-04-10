class Calculator{


    //Addition
    void add(int a,int b){
       System.out.println("Addition: " +(a+b));
    
    }
    void add(double a,double b)
    {
       System.out.println("Addition: " +(a+b));
    }
   void add(int a,double b)
    {
       System.out.println("Addition: " +(a+b));

    }
    void add(double a,int b)
    {
        System.out.println("Addition: " +(a+b));

    }
    //Sub

    void sub(int  a,int b)
    {
        System.out.println("Substraction: "+(a-b));
    }
    void sub(double a,double b)
    {
        System.out.println("Substraction: "+(a-b));
    }
    void sub(int a,double b)
    {
        System.out.println("Substraction: "+(a-b));
    }
    void sub(double a,int b)
    {
        System.out.println("Substraction: "+(a-b));
    }
    //Multiplication
    void mul(int  a,int b)
    {
        System.out.println("Multiplication: "+(a*b));
    }
    void mul(double a,double b)
    {
        System.out.println("Multiplication: "+(a*b));
    }
    void mul(int a,double b)
    {
        System.out.println("Multiplication: "+(a*b));
    }
    void mul(double a,int b)
    {
        System.out.println("Multiplication: "+(a*b));
    }
    //Division
     void div(int a,int b)
    {
        System.out.println("Division: "+(a/b));
    }
    void div(double  a,double b)
    {
        System.out.println("Division: "+(a/b));
    }
    void div(int  a,double b)
    {
        System.out.println("Division: "+(a/b));
    }
    void div(double a,int b)
    {
        System.out.println("Division: "+(a/b));
    }

}
class TestCalculator {
    public static void main(String[] args) {
        Calculator c1;
        c1=new Calculator();
        c1.add(10,20);
        c1.sub(10.20,7);
        c1.mul(3,78);
        c1.div(35,5.5);

    }
    
}
