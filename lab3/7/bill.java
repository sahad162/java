import java.util.Scanner;
interface shop
{
int calculate();
void display();
}

class details implements shop
{
int p_id,quant,pri,ord;
String name,date;
Scanner sc=new Scanner(System.in);
details()
{
System.out.println("Enter product id:");
p_id=sc.nextInt();
System.out.println("Enter order number:");
ord=sc.nextInt();
System.out.println("Enter quantity:");
quant=sc.nextInt();
System.out.println("Enter name:");
name=sc.next();
System.out.println("Enter price:");
pri=sc.nextInt();
System.out.println("Enter date:");
date=sc.next();
}
public void display()
{
System.out.println("product id:"+p_id);
System.out.println("order number:"+ord);
System.out.println("quantity:"+quant);
System.out.println("name of product:"+name);
System.out.println("product price:"+pri);
System.out.println("Date:"+date);
System.out.println("net amount:"+pri*quant);
}
public int calculate()
{
int tot=pri*quant;
return tot;
}
}

public class bill{
public static void main(String[] shop)
{
Scanner mc=new Scanner(System.in);
System.out.println("Enter how many products details do you want to enter:");
int n=mc.nextInt();
details[] arr=new details[n];
int s=0;
for(int i=0;i<n;i++)
{
arr[i] =new details();
arr[i].display();
s=s+arr[i].calculate();
}
System.out.println("Total amount="+s);

}
}
