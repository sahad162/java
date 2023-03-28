import java.util.Scanner;

class Complex
{
public static void main(String[] args)
{

int r1,r2,im1,im2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of first number");
r1=sc.nextInt();
System.out.println("Enter the imaginery part of first number");
im1=sc.nextInt();
System.out.println("Enter the real part of second number");
r2=sc.nextInt();
System.out.println("Enter the real part of first number");
im2=sc.nextInt();

int add_real=r1+r2;
int add_img=im1+im2;

System.out.println(add_real+"+i"+""+add_img);

}
}
