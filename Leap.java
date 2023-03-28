import java.util.Scanner;
class Leap{
public static void main(String[]  arg)
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the starting year:");
int y1=sc.nextInt();
System.out.println("Enter the end year:");
int y2=sc.nextInt();
System.out.println("Leap years are:");

for(i=y1;i<=y2;i++)
{
 if(i%4==0 && i%100!=0 || i%400==0)
{
 System.out.println(i);
}
} 

}
}
