import java.util.Scanner;
class employee {
    int empid;
    String name;
    double salary;
    String address;
    Scanner mc = new Scanner(System.in);

    employee() {
        
        System.out.println("Employee id");
        empid = mc.nextInt();
        System.out.println("name:");
        name = mc.next();
        System.out.println("salary:");
        salary = mc.nextDouble();
        System.out.println("address");
        address = mc.next();


    }
}
public class teacher extends employee {
    String department;
    String subject;

    teacher() {
        super();
        System.out.println("department");
        department = mc.next();
        System.out.println("subject");
        subject = mc.next();
    }

    void display() {
        System.out.println("**************************");
        System.out.println("Emp id:" + empid);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
        System.out.println("Address:" + address);
        System.out.println("Department:" + department);
        System.out.println("Subject:" + subject);
        System.out.println("**************************");

    }

    public static void main(String[] inh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many teachers details do you want to enter:");
        int a = sc.nextInt();
        teacher arr[]=new teacher[a];

        for (int i = 0; i <= a; i++)
        {
            arr[i] = new teacher();
            arr[i].display();

        }


    }
}

