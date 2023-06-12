import java.util.Scanner;
interface student
{
void student();
}

interface sports
{
void sports();
}

class result implements student,sports
{
String name;
String sport;
Scanner sc =new Scanner(System.in);
result()
{
System.out.println("Enter the name of Student:");
name=sc.next();
System.out.println("Enter the Sport:");
sport=sc.next();
}
public void student()
{
System.out.println("Name of Student:"+name);
}
public void sports()
{
System.out.println("sport:"+sport);
}

}

public class academic
{
public static void main(String[] academic)
{
result ob1=new result();
ob1.student();
ob1.sports();
}

}
