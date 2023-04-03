import java.util.Scanner;
class Cpu
{
int price;
Cpu(int pr)
{
price=pr;
}
void display()
{
System.out.println("Price of the cpu:"+price);
}
class Processor
{
int core;
String date;
Processor(int cr,String dt)
{
core=cr;
date=dt;
}

void display()
{
System.out.println("Manufacture date:"+date);
System.out.println("No Of Cores:"+core);
}
}

class Ram
{
int size;
String name;

Ram(int sz,String nm)
{
size=sz;
name=nm;
}

void display()
{
System.out.println("Size of the Ram:"+size);
System.out.println("Manufacture name:"+name); 
}
}

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price of cpu:");
int pr=sc.nextInt();
System.out.println("Enter the manufacture date of cpu:");
String date=sc.next();
System.out.println("Enter the no of cores of cpu:");
int cr=sc.nextInt();
System.out.println("Enter the size of ram:");
int ram=sc.nextInt();
System.out.println("Enter the name of manufacturer:");
String nm=sc.next();

Cpu ob1=new Cpu(pr);
ob1.display();
Cpu.Processor ob2=ob1.new Processor(cr,date);
ob2.display();
Cpu.Ram ob3=ob1.new Ram(ram,nm);
ob3.display();
}
}

