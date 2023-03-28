import java.util.Scanner;

class Symmetry
{
public static void main(String[] arg)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row of matrix:");
int m=sc.nextInt();
System.out.println("Enter the column of matrix:");
int n=sc.nextInt();
int a[][]=new int[m][n];
if(m==n)
{
System.out.println("Enter the elements into the matrix");

for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
{
 a[i][j]=sc.nextInt();
}
 }

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j] == a[j][i])
{
return true;
}
else
{
break;
}
 }
  }

else
{
System.out.println("it is not symmetry");
}

}
}
