import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
interface shop
{
float calculate();
void display();
}

class details implements shop
{
int p_id,quant;
float pri;
String name;
Scanner sc=new Scanner(System.in);
details()
{
System.out.println("Enter product id:");
p_id=sc.nextInt();
System.out.println("Product name:");
name=sc.next();
System.out.println("Enter quantity:");
quant=sc.nextInt();
System.out.println("Enter price:");
pri=sc.nextFloat();
}
public void display()
{
System.out.println(String.format("%d\t\t%s\t%d\t\t%.2f\t%.2f",p_id,name,quant,pri,pri*quant));
}
public float calculate()
{
float tot=pri*quant;
return tot;
}
}

public class bill{
public static void main(String[] shop)
{
Scanner mc=new Scanner(System.in);
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now= LocalDateTime.now();
System.out.println("Enter the Order number:");
int or=mc.nextInt();
System.out.println("Enter how many products details do you want to enter:");
int n=mc.nextInt();
details[] arr=new details[n];
float s=0;
//bill details 
for(int i=0;i<n;i++)
{
arr[i] =new details();
s=s+arr[i].calculate();
}
//bill display
System.out.println("---------------------------");
System.out.println("Date="+dtf.format(now));
System.out.println("Order Id="+or);
System.out.println("Product id\tName\tquantity\tprice\tTotal");
for(int i=0;i<n;i++)
{
arr[i].display();
}
System.out.println("\t\t\t\t\tnet amount=Rs"+s);
}
}
