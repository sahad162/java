import java.util.Arrays;
import java.util.Scanner;
class Sort
{
public static void main(String[] arg)
{
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
String a[]=new String[n];

System.out.println("Enter the strings:");
while(i<n)
{
a[i]=sc.next();
i++;
}

System.out.println("The strings are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
Arrays.sort(a);
System.out.println("The Sorted strings are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}


}
}
