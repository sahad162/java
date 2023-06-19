import java.util.Scanner;
class publisher{

String pub;
Scanner sc=new Scanner(System.in);
publisher()
{
System.out.println("Enter the name of publisher:"); 
pub=sc.next();
}
}

class book extends publisher
{
String book;
book()
{
super();
System.out.println("Enter the name of book:"); 
book=sc.next();
}
}

public class literature extends book
{
String litfic;
literature ()
{
super();
System.out.println("Enter literature or fiction:"); 
litfic=sc.next();
}

void display()
{
System.out.println("**************************");
System.out.println("Publisher:"+pub);
System.out.println("Book:"+book);
System.out.println("literature or fiction:"+litfic);
System.out.println("**************************");
}

public static void main(String[] lit)
{
literature ob1=new literature();
ob1.display();
}
}
