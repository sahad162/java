import java.util.Scanner;
public class Product
{
 int pcode,prize;
 String pname;
 
public Product(int cd,int pr,String nm)
{
pcode=cd;
prize=pr;
pname=nm;
}

void display()
{
 System.out.println("--------------------");
 System.out.println("Product code:"+pcode);
 System.out.println("Product name:"+pname);
 System.out.println("Product prize:"+prize);
 System.out.println("--------------------");
}

void compare(Product p2,Product p3)
{
 if (prize <p2.prize && prize <p3.prize)
{ 
 System.out.format("%s is least prize",pname);
}
else if(prize >p2.prize && p2.prize< p3.prize)
{
 System.out.format("%s is least prize",p2.pname);
}
else
{
System.out.format("%s is least prize",p3.pname);
}
}
 
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the product code:");
 int pcode1=sc.nextInt();
 System.out.println("Enter the product name:");
 String pname1=sc.next();
 System.out.println("Enter the product prize:");
 int prize1=sc.nextInt();
 Product p1=new Product(pcode1,prize1,pname1);
 p1.display();

 System.out.println("Enter the product code:");
 int pcode2=sc.nextInt();
 System.out.println("Enter the product name:");
 String pname2=sc.next();
 System.out.println("Enter the product prize:");
 int prize2=sc.nextInt();
 Product p2=new Product(pcode2,prize2,pname2);
 p2.display();

 System.out.println("Enter the product code:");
 int pcode3=sc.nextInt();
 System.out.println("Enter the product name:");
 String pname3=sc.next();
 System.out.println("Enter the product prize:");
 int prize3=sc.nextInt();
 Product p3=new Product(pcode3,prize3,pname3);
 p3.display();
 p1.compare(p2,p3);
 
}
}
