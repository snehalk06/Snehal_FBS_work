class Shape{
    double  area;

    //Triangle area
    void Calculatearea(Triangle t1)
    {
        area=0.5*t1.base*t1.height;
        System.out.println("Area of triangle : "+area);

    }
     void Calculatearea(Rectangle R1)
    {
        area=R1.length*R1.breadth;
        System.out.println("Area of Rectangle : "+area);

    }
     void Calculatearea(Circle c1)
    {
        area=c1.radius*c1.radius;
        System.out.println("Area area of circle : "+area);

    }


}
class Triangle{
    double base,height;

    Triangle(double b,double h)
    {
        this.base=b;
        this.height=h;
    }



}
class Rectangle{
    double length,breadth;

    public Rectangle(double l,double b) {
        this.length=l;
        this.breadth=b;
    }
    
}
class Circle{
    double  radius;

    public Circle(double r) {
        this.radius=r;
    }

    
}

public class TestCalcuateArea {

    public static void main(String[] args) {
        Shape s1;
        s1=new Shape();
        Triangle t1;
        t1=new Triangle(12,24.5);
        Rectangle R1=new Rectangle(12, 78);
        Circle c1=new Circle(16);
        s1.Calculatearea(t1);
        s1.Calculatearea(R1);
        s1.Calculatearea(c1);
        
    }


    
}
