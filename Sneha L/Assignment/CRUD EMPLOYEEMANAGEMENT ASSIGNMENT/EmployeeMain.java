
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement[] emparr = new EmployeeManagement[10];
        int choice;
        do {
            System.out.println("Options:");
            System.out.println("1. Create Employee Details");
            System.out.println("2. Update Employee Details");
            System.out.println("3. Search Employee Details");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Delete Employee Details");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (EmployeeManagement.size >= emparr.length) {
                        System.out.println("Limit Reached");
                    }
                    else {
                        System.out.println("Enter Employee Id:");
                        int id = sc.nextInt();
                        boolean idExists = false;
                        for (int i = 0; i < EmployeeManagement.size; i++) {
                            if (id == emparr[i].eid) {
                                idExists = true;
                                break;
                            }
                        }
                        if (idExists) {
                            System.out.println("Employee with the same id already exists");
                        }
                        else {
                            System.out.println("Enter Employee Name");
                            String name = sc.next();
                            System.out.println("Enter Employee Designation");
                            String designation = sc.next();
                            System.out.println("Enter Employee Salary");
                            double salary = sc.nextDouble();
                            EmployeeManagement emp = new EmployeeManagement(id, name, designation, salary);
                            emparr[EmployeeManagement.size] = emp;
                            EmployeeManagement.size++;
                            System.out.println("Employee details added");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter Employee id to update ");
                    int updateId = sc.nextInt();
                    System.out.println("Enter Updated Name");
                    String updateName = sc.next();
                    System.out.println("Enter Updated Designation");
                    String updateDesignation = sc.next();
                    System.out.println("Enter Updated Salary");
                    double updatesal = sc.nextDouble();
                    EmployeeManagement.updateDetails(emparr, updateId, updateName, updateDesignation, updatesal);
                    break;

                case 3:
                    System.out.println("Enter Employee Id to Search");
                    int searchId = sc.nextInt();
                    EmployeeManagement.searchDetails(emparr, searchId);
                    break;

                case 4:
                    System.out.println("Enter Employee Id to display");
                    EmployeeManagement.displayDetails(emparr);
                    break;

                case 5:
                    System.out.println("Enter Employee Id to delete");
                    int deleteId = sc.nextInt();
                    EmployeeManagement.deleteDetails(emparr, deleteId);
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}