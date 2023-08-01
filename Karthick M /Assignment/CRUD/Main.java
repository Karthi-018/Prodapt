import java.util.*;

    public class Main_Emp {
        static Scanner sc = new Scanner(System.in);
        static Service employeeService = new Service();

        static void userChoice()
        {

            System.out.println("*** Welcome to Employee Management System ***");
            System.out.println("Enter your choice");
            System.out.println("1 -> Create New Employee");
            System.out.println("2 -> Update Employee Details");
            System.out.println("3 -> Search Employee Details");
            System.out.println("4 -> Display All Employee Details");
            System.out.println("5 -> Delete Employee Detail");
            System.out.println("6 -> Exit");
            int choice = sc.nextInt();
            switchUserChoice(choice);
        }

        static void switchUserChoice(int choice)
        {

            switch (choice)
            {
                case 1 :
                    System.out.println("Creating Employee Details");
                    System.out.println("Enter the Employee ID");
                    int id = sc.nextInt();
                    System.out.println("Enter the Employee Name");
                    String name = sc.next();
                    System.out.println("Enter the Employee Department ");
                    String dept = sc.next();
                    System.out.println("Enter the Employee Salary");
                    double sal = sc.nextDouble();
                    CRUD_Employee newEmpList[] = employeeService.create_emp(new CRUD_Employee(id,name,dept,sal));
                    for (int i =0;i<newEmpList.length;i++)
                    {
                        System.out.println(newEmpList[i]);
                    }
                    userChoice(); 
                    break;
                case 2 :
                    System.out.println("Updating the Employee Details");
                    int updateEid = sc.nextInt();
                    CRUD_Employee updateEmp = employeeService.search_emp(updateEid);
                    if(updateEmp != null)
                    {
                        System.out.println("Enter your Choice");
                        System.out.println("1 -> Update Name");
                        System.out.println("2-> Update Department");
                        System.out.println("3 -> Update salary");
                        int updateChoice = sc.nextInt();
                        switch (updateChoice)
                        {
                            case 1 :
                                System.out.println("Enter Employee Name to update");
                                updateEmp.setName(sc.next());
                                break;
                            case 2 :
                                System.out.println("Enter the Employee Department to update");
                                updateEmp.setDept(sc.next());
                                break;
                            case 3 :
                                System.out.println("Enter the Employee Salary to update ");
                                updateEmp.setSal(sc.nextInt());
                                break;
                        }

                        System.out.println(updateEmp);
                    }
                    userChoice();
                    break;
                case 3 :
                    System.out.println("Searching Employee Details");
                    System.out.println("Enter the Employee ID to Search");
                    int eid = sc.nextInt();
                    CRUD_Employee emp = employeeService.search_emp(eid);
                    if(emp != null)
                    {
                        System.out.println(emp);
                    }
                    else {
                        System.out.println("Employee Not Found");
                    }
                    userChoice(); 
                    break;
                case 4 :
                    System.out.println("All Employee Details");
                    CRUD_Employee empList[] = employeeService.employeeList();
                    for(int i =0;i<empList.length;i++)
                    {
                        System.out.println(empList[i]);
                    }
                    userChoice();
                    break;
                case 5 :
                    System.out.println("Deleting Employee Details");
                    System.out.println("Enter employee id to delete");
                    int eeid=sc.nextInt();
                    employeeService.delete_emp(eeid);
                    userChoice();
                    break;
                case 6 : System.exit(0);
                default: System.out.println("Invalid Choice");
                System.exit(0);
            }
        }

        public static void main(String[] args) {

            employeeService.get_e_arr();
            userChoice();


        }
    }