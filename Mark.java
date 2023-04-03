import java.util.Scanner;
class Mark
{
public static void main(String[] arg)
{
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println(" how many marks of subject want to enter:");
int n=sc.nextInt();

int a[]=new int[n];
String b[]=new String[n];

System.out.println("Enter the total mark of each subject:");
int total=sc.nextInt();

while(i<n)
{
System.out.println("Enter the subject name:");
b[i]=sc.next();
System.out.println("Enter the mark of the subject:");
a[i]=sc.nextInt();
if(a[i]<=total)
{
a[i]=a[i];
i++;
}
else
{
System.out.println("mark is denied");
}
}


for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
