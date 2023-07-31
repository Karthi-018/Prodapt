package ems;

import java.util.Scanner;

public class MainCls {
    Scanner sc = new Scanner(System.in);
    public void selectChoice(){
        System.out.println("Welcome to Energy Management System");
        System.out.println("Select the option");
        System.out.println("1.Create new Employee");
        System.out.println("2.Update the existing employee");
        System.out.println("3.Search");
        System.out.println("4.Display all employee details");
        System.out.println("5.Delete the employee");
        System.out.println("6.Exit");
        int choice = sc.nextInt();
        switchChoice(choice);
    }

    public void switchChoice(int choice){
        ServiceCls service = new ServiceCls();
        service.initiEmpList();
        switch(choice){
            case 1:
                System.out.println("Creating new employee...");
                System.out.println("Enter the id");
                int id = sc.nextInt();
                System.out.println("Enter the name");
                String name = sc.next();
                System.out.println("Enter the salary");
                long sal = sc.nextLong();
                Employee[] newEmpList = service.createEmployee(new Employee(id,name,sal));
                for(int i=0;i<newEmpList.length;i++) {
                    if (newEmpList[i] != null) {
                        System.out.println(newEmpList[i]);
                    }
                }
                selectChoice();
                break;

            case 2:
                System.out.println("Updating Employee...");
                System.out.println("Enter the id to update");
                int updateId = sc.nextInt();

                Employee employee = service.findEmployee(updateId);
                if(employee != null){
                    System.out.println("Select the options");
                    System.out.println("1.change name");
                    System.out.println("2.change salary");
                    int opt = sc.nextInt();
                    switch(opt){
                        case 1:
                            System.out.println("Enter the new name");
                            employee.setEmpName(sc.next());
                            break;

                        case 2:
                            System.out.println("Enter the new salary");
                            employee.setEmpSalary(sc.nextLong());
                            break;
                    }
                    System.out.println(employee);

                }
                else{
                    System.out.println("Id does not exist");
                }
                selectChoice();
                break;

            case 3:
                System.out.println("Searching Employee...");
                System.out.println("Enter the id to search");
                int searchId = sc.nextInt();
                Employee emp = service.findEmployee(searchId);
                if(emp!=null) {
                    System.out.println(emp);
                }
                else{
                    System.out.println("ID not found");
                }
                selectChoice();
                break;

            case 4:
                System.out.println("Displaying Employee details...");
                service.displayEmployee();
                selectChoice();
                break;

            case 5:
                System.out.println("Deleting Employee...");
                System.out.println("Enter the id to delete");
                int deleteId = sc.nextInt();
                Employee deleteEmp = service.findEmployee(deleteId);

                if(deleteEmp!=null){
                    Employee[] deleteList  = service.deleteEmployee(deleteEmp);
                    for(int i=0;i<deleteList.length;i++){
                        if(deleteList[i]!=null) {
                            System.out.println(deleteList[i]);
                        }
                    }
                }
                else{
                    System.out.println("Id does not exist");
                }

                selectChoice();
                break;

            case 6:
                System.exit(0);
                break;
        }

    }

    public static void main(String[] args) {
        MainCls m = new MainCls();
        m.selectChoice();
    }
}
