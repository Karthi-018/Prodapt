import java.util.Scanner;

public class MainClass
{
    static Scanner sc = new Scanner(System.in);
    static EmployeeService es = new EmployeeService();

    static void choice()
    {
        System.out.println("Welcome to Employee Management System");
        System.out.println("Select option to be performed");
        System.out.println("1.Create new employee\n2.Update employee details\n3.Search employee details\n4.Display all employee deatils\n5.Delete employee\n6.Quit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        userchoice(choice);
    }
    static void userchoice(int choice)
    {
        switch (choice)
        {
            case 1 :
                System.out.println("Enter employee details...");
                System.out.println("Enter employee id :");
                int id = sc.nextInt();
                System.out.println("Enter employee name :");
                String name = sc.next();
                System.out.println("Enter employee designation :");
                String des = sc.next();
                System.out.println("Enter employee salary :");
                double sal = sc.nextDouble();
                Employee newEmpList[] = es.createEmp(new Employee(id,name,des,sal));
                for(int i=0;i<newEmpList.length;i++)
                {
                    System.out.println(newEmpList[i]);
                }
                choice();
                break;

            case 2 :
                System.out.println("Update employee details...");
                System.out.println("Enter employee id :");
                int updateid = sc.nextInt();
                Employee updateEmployee = es.isEmployee(updateid);
                if(updateEmployee != null)
                {
                    System.out.println("choose the option to update...");
                    System.out.println("1.Update name\n2.Update designation\n3.Update salary");
                    int option = sc.nextInt();
                    switch (option)
                    {
                        case 1 :
                            System.out.println("Enter name :");
                            updateEmployee.setEname(sc.next());
                            break;
                        case 2 :
                            System.out.println("Enter designation:");
                            updateEmployee.setEdes(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter salary:");
                            updateEmployee.setEsal(sc.nextDouble());
                            break;
                    }
                    System.out.println(updateEmployee);
                }
                
                choice();
                break;

            case 3 :
                System.out.println("Searching Employee...");
                System.out.println("Enter employee id : ");
                int eid = sc.nextInt();
                Employee emp = es.isEmployee(eid);
                if(emp != null)
                {
                    System.out.println(emp);
                }
                else{
                    System.out.println("Employee not found!!!");
                }
                choice();
                break;
            case 4 :
                System.out.println("All employee details");
                Employee empList[] = es.dispEmp();
                for(int i = 0;i<empList.length;i++)
                {
                    System.out.println(empList[i]);
                }
                choice();
                break;
            case 5 :
                System.out.println("Deleting Employee...");
                System.out.println("Enter employee id : ");
                int deleteId = sc.nextInt();
                es.delete(deleteId);
                choice();
                break;
            case 6 : 
                System.exit(0);
            default :
                System.out.println("Invalid option");
        }
    }
    public static void main(String a[])
    {
        es.firstTenData();
        choice();
    }
}