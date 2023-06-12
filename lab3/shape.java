import java.util.Scanner;
interface sha
{
void area();
void perimeter();
}

class rectangle implements sha
{
double l,b;
Scanner sc=new Scanner(System.in);
rectangle()
{
System.out.println("Enter the length and breadth of rectangle");
l=sc.nextDouble();
b=sc.nextDouble();
}
public void area()
{
System.out.println("Area of rectangle is:"+l*b);
}

public void perimeter()
{
double res=2*(l+b);
System.out.println("perimeter of rectangle is:"+res);
}
}

class circle implements sha
{
double r;
Scanner mc=new Scanner(System.in);
circle()
{
System.out.println("Enter the radius");
r=mc.nextDouble();
}
public void area()
{
System.out.println("Area of circle is:"+ 3.14*r*r);
}

public void perimeter()
{
double res=2*3.14*r;
System.out.println("perimeter of rectangle is:"+res);
}
}

public class shape
{
public static void main(String[] shape)
{
Scanner s=new Scanner(System.in);
System.out.println("Shapes\n1.rectangle\n2.circle");
System.out.println("Enter the option");
int ch=s.nextInt();

switch(ch)
{
case 1:
rectangle ob1=new rectangle();
ob1.area();
ob1.perimeter();
break;
 
case 2:
circle ob2=new circle();
ob2.area();
ob2.perimeter();
break;
}
}
}



