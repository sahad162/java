import java.util.Scanner;
class person{
String name;
String address;
String gender;
int age;
Scanner sc=new Scanner(System.in);
person()
{
System.out.println("Enter the Name:");
name=sc.next();
System.out.println("Enter the Address:");
address=sc.next();
System.out.println("Enter the gender:");
gender=sc.next();
System.out.println("Enter the Age:");
age=sc.nextInt();
}
}

class employee extends person
{
int empid;
String cname;
String quali;
int salary;

employee()
{
super();
System.out.println("Enter the employee id:");
empid=sc.nextInt();
System.out.println("Enter the company name:");
cname=sc.next();
System.out.println("Enter the Qualification of employee:");
quali=sc.next();
System.out.println("Enter the salary:");
salary=sc.nextInt();
}
}

public class teach extends employee
{
int teachid;
String depart;
String sub;

teach()
{
super();
System.out.println("Enter the teacher id:");
teachid=sc.nextInt();
System.out.println("Enter the Department:");
depart=sc.next();
System.out.println("Enter the subject:");
sub=sc.next();
}

void display()
{
System.out.println("**********************************");
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Gender:"+gender);
System.out.println("Age:"+age);
System.out.println("Employee id:"+empid);
System.out.println("Company name:"+cname);
System.out.println("Qualification:"+quali);
System.out.println("Salary:"+salary);
System.out.println("Teacher id:"+teachid);
System.out.println("Department:"+depart);
System.out.println("Subject:"+sub);
System.out.println("**********************************");

}

public static void main(String[] teach)
{
Scanner mc=new Scanner(System.in);
System.out.println("how many teachers details want you to enter:");
int x=mc.nextInt();
teach[] arr=new teach[x];

for(int i=0;i<=x;i++)
{
arr[i]=new teach();
arr[i].display();
}
}
}








