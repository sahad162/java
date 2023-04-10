import java.util.Scanner;
import java.util.Arrays;
class So
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String name=sc.next();
char arr[]=name.toCharArray();
Arrays.sort(arr);
String a=new String(arr);
System.out.println("The String is:"+name);
System.out.println("The String is:"+a);
}
}
