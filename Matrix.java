
import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of row of matrix 1:");
int p=sc.nextInt();
System.out.println("Enter the no of coloumn of matrix 1:");
int q=sc.nextInt();
System.out.println("Enter the no of row of matrix 2:");
int m=sc.nextInt();
System.out.println("Enter the no of coloumn of matrix 2:");
int n=sc.nextInt();

int a[][]=new int[p][q];
int b[][]=new int[m][n];
int c[][]=new int[m][n];

if(p==m && q==n)
{
System.out.println("Enter the elements for the matrix 1");

for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
a[i][j]=sc.nextInt();
}}

System.out.println("The matrix 1 is:");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

System.out.println("Enter the elements for the matrix 2");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}}

System.out.println("The matrix 2 is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}

for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
{
 c[i][j]=a[i][j]+b[i][j];
}
 }

System.out.println("The addition matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(c[i][j]+ " ");
}
System.out.println("");
}
}
else
{
System.out.println("Addition not possible");
}
}
}

