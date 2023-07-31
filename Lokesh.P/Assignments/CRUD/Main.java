package example.service;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static EmployeeService employeeService =new EmployeeService();
    static void userchoice()
    {
        System.out.println("********* Employee Management System*********");
        System.out.println("Enter your choice");
        System.out.println("1.Create New Employee");
        System.out.println("2.Update Employee Details");
        System.out.println("3.Search Employee Details");
        System.out.println("4.Display Employee Details");
        System.out.println("5.Delete Employee Details");
        System.out.println("6.Exit");
        int choose=sc.nextInt();
        switchUserChoose(choose);
    }
    static void switchUserChoose(int choose)
    {
        switch (choose)
        {
            case 1:
                System.out.println("Creating Employee Information");
                System.out.println("Enter Employee id:");
                int id=sc.nextInt();
                System.out.println("Enter Employee Name:");
                String name =sc.next();
                System.out.println("Enter Employee Salary");
                int salary= sc.nextInt();
                Employee newList[]=employeeService.createEmployee(new Employee(id,name,salary));
                for(int i=0;i< newList.length;i++)
                {
                    System.out.println(newList[i]);
                }
                userchoice();
                break;
            case 2:
                System.out.println("Updating Employee Details");
                int updateEid=sc.nextInt();
                Employee updateEmp=employeeService.findEmployee(updateEid);
                if(updateEmp!=null) {
                    System.out.println("Enter your choice:");
                    System.out.println("1.update Name");
                    System.out.println("2.update salary");
                    int updateChoice = sc.nextInt();
                    switch (updateChoice) {
                        case 1:
                            System.out.println("Enter Employee Name to update");
                            updateEmp.setName(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter Employee Salary to Update");
                            updateEmp.setSalary(sc.nextInt());
                            break;
                    }
                    System.out.println(updateEmp);
                }
                userchoice();
                break;
            case 3:
                System.out.println("Searching Employee Details");
                System.out.println("Enter the EmpId to  Search:");
                int eid=sc.nextInt();
                Employee emp=employeeService.findEmployee(eid);
                if(emp!=null)
                {
                    System.out.println(emp);

                }
                else {
                    System.out.println("Employee Not found");
                }
                userchoice();
                break;
            case 4:
                System.out.println("Enter Employee Details");
                Employee empList[] = employeeService.employees();
                for(int i=0;i<empList.length;i++)
                {
                    System.out.println(empList[i]);
                }
                userchoice();
                break;
            case 5:
                System.out.println("Deleting Employee Details");
                Employee d = employeeService.deleteEmployee();
                userchoice();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("INVALID CHOICE");
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        employeeService.initEmployeeList();
        userchoice();
    }
}
