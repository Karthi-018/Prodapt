package org.example;

import org.example.demo.Employee;
import org.example.service.EmployeeService;

import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static EmployeeService employeeService = new EmployeeService();

    static void Choice() {
        System.out.println("EMPLOYEE MANAGEMENT DATABASE");
        System.out.println("ENTER YOUR CHOICE:");
        System.out.println("1.Create New Employee Details");
        System.out.println("2.Update Employee Details");
        System.out.println("3.Search Employee Details");
        System.out.println("4.Display Employee Details");
        System.out.println("5.Delete Employee Details");
        System.out.println("6.Exit");
        int choice = sc.nextInt();
        switchChoice(choice);

    }

    static void switchChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Creating Employee Details---------------");
                System.out.println("Enter Employee ID:");
                int empId = sc.nextInt();
                System.out.println("Enter Employee Name");
                String empName = sc.next();
                System.out.println("Enter Department:");
                String empDept = sc.next();
                System.out.println("Enter Salary");
                int empSal = sc.nextInt();
               employeeService.createEmployee(new Employee(empId, empName, empDept, empSal));
                System.out.println("Employee details created sucessfully");
                Choice();
                break;

            case 2:
                System.out.println("Updating Employee Details---------------");
                int updateid=sc.nextInt();
                Employee updateEmp=employeeService.findEmployee(updateid);
                if(updateEmp!=null)
                {
                    System.out.println("Current Employee Details");
                    System.out.println("Employee Id:"+updateEmp.getEmpId());
                    System.out.println("Employee Name:"+updateEmp.getEmpName());
                    System.out.println("Employee Department:"+updateEmp.getEmpDept());
                    System.out.println("Employee Salary:"+updateEmp.getEmpSal());
                    System.out.println("Enter your Choice to update");
                    System.out.println("1.Enter New Name to update");
                    System.out.println("2.Enter New Department to update");
                    System.out.println("3..Enter New Salary to update");
                    int ch1= sc.nextInt();
                    switch (ch1) {
                        case 1:
                            System.out.println("Enter the Employee Name to Update");
                            updateEmp.setEmpName(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter the Department to Update");
                            updateEmp.setEmpdept(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter the Salary to update ");
                            updateEmp.setEmpSal(sc.nextInt());
                            break;
                    }
                    System.out.println(updateEmp);
                    }
                    Choice();
                break;

            case 3:
                System.out.println("Searching Employee Details-------------------");
                System.out.println("Enter the Employee ID to search");
                int searchid= sc.nextInt();
                Employee emp=employeeService.findEmployee(searchid);
                if(emp!=null)
                {
                    System.out.println(emp);
                }
                else {
                    System.out.println("Employee not found");
                }
                Choice();
                break;

            case 4:
                System.out.println("Display Employee Details----------------");
                System.out.println("1.Display All");
                System.out.println("2.Display");
                int ch= sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter All Employees Details to display");

                        Employee[] empArr1 = employeeService.empArr();
                        for (Employee empi : empArr1) {
                            if (empi != null) {
                                System.out.println(empi);
                            }
                        }
                        Choice();
                        break;
                    case 2:
                        System.out.println("Enter Employee Id to display");
                        int n1 = sc.nextInt();
                        Employee disemp = employeeService.findEmployee(n1);
                        if (disemp != null) {
                            System.out.println(disemp);
                        } else {
                            System.out.println("Employee not found");
                        }
                        break;
                }
                Choice();
                break;

            case 5:
                System.out.println("Deleting Employee Details----------------");
                System.out.println("Enter the Employee Details to delete");
                int deleteId= sc.nextInt();
                employeeService.deteleDetails(deleteId);
                Choice();
                break;

            case 6:
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
                System.exit(0);
                }

        }

    public static void main(String[] args) {
        employeeService.initEmployeeArr();
        Choice();
    }
    }





