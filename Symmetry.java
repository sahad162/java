import java.util.Scanner;
class Symmetry
{
    public static void main(String[] arg)
    {
        int i,j,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row of the matrix:");
        int r=sc.nextInt();
        System.out.print("Enter the column of matrix:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];

        if(r==c)
        {
            System.out.println("Enter the elements into the matrix: ");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
System.out.println("the symmetry matrix is:");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(a[j][i] +" ");
                }
                System.out.println(" ");
            }

            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++) {
                    if (a[i][j] != a[j][i]) {
                        flag = 1;
                        break;
                    }
                }}

                    if (flag==0)
                    {
                        System.out.println("matrix is  symmetry");
                    }
                    if (flag==1) {
                        System.out.println("matrix is not symmetry");
                    }

        }

        else
        {
            System.out.println("The matrix is not symmetry");
        }
    }
}
