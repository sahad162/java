import java.util.Scanner;
abstract class shape
{
abstract void area();
}	 	

class rectangle extends shape
{
int l,b;
Scanner sc=new Scanner(System.in);
rectangle()
{
System.out.println("Enter the length and breadth of rectangle");
l=sc.nextInt();
b=sc.nextInt();
}
void area()
{
System.out.println("Area of rectangle:"+l*b);
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
class square extends shape
{
int s;
Scanner v=new Scanner(System.in);
square()
{
System.out.println("Enter the side of square");
s=v.nextInt();
}
void area()
{
System.out.println("Area of square:"+s*s);
}
}
public class abs{
public static void main(String[] shape)
{
rectangle ob1=new rectangle();
ob1.area();
circle ob2=new circle();
ob2.area();
square ob3=new square();
ob3.area();
}
}


