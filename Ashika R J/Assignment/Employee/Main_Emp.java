import java.util.*;

    public class Main_Emp {
        static Scanner sc = new Scanner(System.in);
        static Service employeeService = new Service();

        static void yourOption()
        {

            System.out.println("****** Welcome to EMS ******");
            System.out.println("Enter OPTION: ");
            System.out.println("1 - CREATE");
            System.out.println("2 - UPDATE");
            System.out.println("3 - SEARCH");
            System.out.println("4 - DISPLAY All");
            System.out.println("5 - DELETE");
            System.out.println("6 - EXIT");
            int option = sc.nextInt();
            switch yourOption(option);
        }

        static void switch yourOption(int option)
        {

            switch (option)
            {
                case 1 :
                    System.out.println("CREATE");
                    System.out.println("Enter the Employee ID");
                    int id = sc.nextInt();
                    System.out.println("Enter the Employee Name");
                    String name = sc.next();
                    System.out.println("Enter the Employee Department ");
                    String dept = sc.next();
                    System.out.println("Enter the Employee Salary");
                    double sal = sc.nextDouble();
                    CRUD_Emp newEmpList[] = employeeService.create_emp(new CRUD_Emp(id,name,dept,sal));
                    for (int i =0;i<newEmpList.length;i++)
                        System.out.println(newEmpList[i]);
                        yourOption(); 
                        break;
                case 2 :
                    System.out.println("UPDATING DETAILS");
                    int updateEid = sc.nextInt();
                    CRUD_Emp updateEmp = employeeService.search_emp(updateEid);
                    if(updateEmp != null)
                    {
                        System.out.println("Enter your Choice");
                        System.out.println("1 - UPDATE Name");
                        System.out.println("2- UPDATE Department");
                        System.out.println("3 - UPDATE salary");
                        int updateOption = sc.nextInt();
                        switch (updateOption)
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
                    yourOption();
                    break;
                case 3 :
                    System.out.println("Searching Employee Details");
                    System.out.println("Enter the Employee ID to Search");
                    int eid = sc.nextInt();
                    CRUD_Emp emp = employeeService.search_emp(eid);
                    if(emp != null)
                    {
                        System.out.println(emp);
                    }
                    else {
                        System.out.println("Employee Not Found");
                    }
                    yourOption();
                    break;
                case 4 :
                    System.out.println("All Employee Details");
                    CRUD_Emp empList[] = employeeService.employeeList();
                    for(int i =0;i<empList.length;i++)
                    {
                        System.out.println(empList[i]);
                    }
                    yourOption();
		    break;
                case 5 :
                    System.out.println("DELETE");
                    System.out.println("Enter employee id to delete");
                    int eeid=sc.nextInt();

                    employeeService.delete_emp(eeid);
                    yourOption();
                    break;
                case 6 : System.exit(0);
                default: System.out.println("Invalid!!!");
                System.exit(0);
            }
        }

        public static void main(String[] args) {

            employeeService.get_e_arr();
            yourOption();


        }
    }