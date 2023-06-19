import java.util.Scanner;
public class over {
    static int area( int l ,int b)
    {
        return l*b;
    }

    static int area(int s)
    {
        return s*s;
    }
    static double area(double r)
    {
        return 3.14*r*r;
    }

    public static void main(String[] shape)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of shapes\n1.Rectangle\n2.square\n3.circle");
        System.out.println("Enter the choice:");
        int ch=sc.nextInt();
        switch (ch){
        case 1:
            System.out.println("Enter the length and breadth of the rectangle:");
            int l=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Area of rectangle:"+area(l,b));
            break;
        case 2:
            System.out.println("Enter the side of square:");
            int s=sc.nextInt();
            System.out.println("Area of Square:"+area(s));
            break;
        case 3:
            System.out.println("Enter the radius of the circle:");
            double r=sc.nextDouble();
            System.out.println("Area of circle:"+area(r));
            break;

    }



    }
}
