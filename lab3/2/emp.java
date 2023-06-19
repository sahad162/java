import java.util.Scanner;

public class emp {
        int empid;
        String name;
        double salary;
        String address;
        Scanner mc = new Scanner(System.in);

        emp(int id,String nm,double sal,String add) {
            empid=id;
            name=nm;
            salary=sal;
            address=add;
        }
    }
    class Teacher extends emp {
        String department;
        String subject;

        Teacher(int empid,String name,double salary,String address,String dept,String sub) {
            super(empid,name,salary,address);
            department = dept;
            subject = sub;
        }

        void display() {
            System.out.println("Emp id:" + empid);
            System.out.println("Name:" + name);
            System.out.println("Salary:" + salary);
            System.out.println("Address:" + address);
            System.out.println("Department:" + department);
            System.out.println("Subject:" + subject);

        }

        public static void main(String[] inh) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many teachers details do you want to enter:");
            int a = sc.nextInt();
            Teacher[] arr=new Teacher[a];
            for (int i = 0; i <= a; i++) {
                System.out.println("Employee id");
                int empid = sc.nextInt();
                System.out.println("name:");
                String name = sc.next();
                System.out.println("salary:");
                double salary = sc.nextDouble();
                System.out.println("address");
                String address = sc.next();
                System.out.println("department:");
                String department = sc.next();
                System.out.println("subject:");
                String subject = sc.next();
                arr[i] = new Teacher(empid,name,salary,address,department,subject);
                arr[i].display();

            }


            }


        }
