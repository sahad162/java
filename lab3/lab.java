import java.util.Scanner;
class shape
{
    void area()
    {
        System.out.println("area of shapes");
    }
}

class rectangle extends shape
{
    double l,b;
    Scanner sc=new Scanner(System.in);
    rectangle()
    {
        System.out.println("Enter the length and breadth of rectangle");
        l=sc.nextDouble();
        b=sc.nextDouble();
    }
    void area()
    {
        System.out.println("Area of rectangle:"+l*b);
    }
}

class square extends shape
{
    double x;
    Scanner s=new Scanner(System.in);
    square()
    {
        System.out.println("Enter the side of square");
        x=s.nextDouble();
    }
    void area()
    {
        System.out.println("Area of rectangle:"+ x*x);
    }
}

class circle extends shape
{
    double r;
    Scanner c=new Scanner(System.in);
    circle()
    {
        System.out.println("Enter the radius of circle");
        r=c.nextDouble();
    }
    void area()
    {
        System.out.println("Area of circle:"+3.14*r*r);
    }
}
public class lab {
    public static void main(String[] shape)
    {
        rectangle ob1=new rectangle();
        ob1.area();
        square ob2=new square();
        ob2.area();
        circle ob3=new circle();
        ob3.area();
    }
}
