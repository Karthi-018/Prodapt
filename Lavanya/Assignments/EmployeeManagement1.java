import java.util.Scanner;
public class EmployeeManagement1 {
    private static final int MAX_EMPLOYEES = 50;
    private Employee[] employees;
    private int nextEmployeeId;
    public EmployeeManagement1() {
        employees = new Employee[MAX_EMPLOYEES];
        nextEmployeeId = 1;
    }
    public void createEmployee(String name, int salary) {
        if (nextEmployeeId <= MAX_EMPLOYEES) {
            Employee newEmployee = new Employee(nextEmployeeId++, name,salary);
            employees[nextEmployeeId - 2] = newEmployee;
            System.out.println("Employee created successfully!");
        } else {
            System.out.println("Cannot create more employees. Maximum limit reached.");
        }
    }
    public void updateEmployee(int id, String name, int salary) {
        for (int i = 0; i < nextEmployeeId - 1; i++) {
            if (employees[i].getId() == id) {
                employees[i].updateEmployee(name, salary);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }
    public void searchEmployee(int id) {
        for (int i = 0; i < nextEmployeeId - 1; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Employee found: " + employees[i]);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }
    public void displayAllEmployees() {
        if (nextEmployeeId == 1) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee List:");
            for (int i = 0; i < nextEmployeeId - 1; i++) {
                System.out.println(employees[i]);
            }
        }
    }
    public void deleteEmployee(int id) {
        for (int i = 0; i < nextEmployeeId - 1; i++) {
            if (employees[i].getId() == id) {
                for (int j = i; j < nextEmployeeId - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                nextEmployeeId--;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement1 empManagement = new EmployeeManagement1();

        while (true) {
            System.out.println("\n Employee Details :");
            System.out.println("1. Create Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    int salary = scanner.nextInt();
                    scanner.nextLine();
                    empManagement.createEmployee(name, salary);
                    break;
                case 2:
                    System.out.print("Enter employee ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter updated name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter updated salary: ");
                    int updatedsalary = scanner.nextInt();
                    empManagement.updateEmployee(idToUpdate, updatedName, updatedsalary);
                    break;
                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int idToSearch = scanner.nextInt();
                    empManagement.searchEmployee(idToSearch);
                    break;
                case 4:
                    empManagement.displayAllEmployees();
                    break;
                case 5:
                    System.out.print("Enter employee ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    empManagement.deleteEmployee(idToDelete);
                    break;
                case 6:
                    System.out.println("Exiting..");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}