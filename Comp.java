import java.util.Scanner;
class Comp{
int r,im;
Comp(int a,int b)
{
r=a;
im=b;
}
void add(Comp num1)
{
int add_real= r+num1.r;
int add_img= im+num1.im;
System.out.println(add_real+"+i"+add_img);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of first number");
int r1=sc.nextInt();
System.out.println("Enter the imaginery part of first number");
int im1=sc.nextInt();
Comp num1=new Comp(r1,im1);
System.out.println("Enter the real part of second number");
int r2=sc.nextInt();
System.out.println("Enter the real part of second number");
int im2=sc.nextInt();
Comp num2=new Comp(r2,im2);
num2.add(num1);
}
}
