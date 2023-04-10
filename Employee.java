import java.util.Scanner;
class Employee
{
int num,sal;
String name;
Scanner sc=new Scanner(System.in);
Employee()
 {
  System.out.println("Enter the Employee number:");
   num=sc.nextInt();
  System.out.println("Enter the Employee name:");
  name=sc.next();
  System.out.println("Enter the Employee salary:");
   sal=sc.nextInt();
 }
 
 void display()
{ 
  System.out.println("------------Employee----------------");
  System.out.println("Enter the Employee number:"+num);
  System.out.println("Enter the Employee name:"+name);
  System.out.println("Enter the Employee salary:"+sal);
  System.out.println("----------------------------------------");
}

static void search(Employee emp[],int no)
{
for( int i=0;i<emp.length;i++)
{
if(emp[i].num==no)
{
System.out.println("The employee is present in the array");
break;
}
else
{
System.out.println("The employee is not present in the array");
break;
}
}
}

 
public static void main(String[] arg)
{
int i;
System.out.println("How many employees details want to enter");
Scanner mc=new Scanner(System.in);
int n=mc.nextInt();
Employee emp[]=new Employee[n];

for(i=0;i<n;i++)
{
emp[i]=new Employee();
emp[i].display();
}

System.out.println("Enter the employee id to find");
int no=mc.nextInt();
search(emp,no);
 
}
}
