import java.util.Scanner;
class Srch
{
public static void main(String[] arg)
{
int i=0,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int arr[]=new int[n];

System.out.println("Enter the elements into the array:");
while(i<n)
{
arr[i]=sc.nextInt();
i++;
}

System.out.println("Enter the element to search:");
int ele=sc.nextInt();

for(i=0;i<n;i++)
{
if(arr[i]==ele)
{
System.out.format("\nThe %s is found in the %d  position in the  array",ele,i);
flag=1;
}
}

if(flag==0)
{
System.out.format("The %s is  not found in the array",ele);
}

}
}
