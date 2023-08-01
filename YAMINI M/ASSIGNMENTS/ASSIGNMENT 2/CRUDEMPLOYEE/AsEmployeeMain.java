import java.util.Scanner;

class AsEmployeeMain{
    private static Employee[] employees = new Employee[10];
    private static int noOfEmployees = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;
        do{
            System.out.print("\n1. CREATE EMPLOYEE DETAILS");
            System.out.print("\n2. UPDATE EMPLOYEE DETAILS");
            System.out.print("\n3. DELETE EMPLOYEE DETAILS");
            System.out.print("\n4. DISPLAY EMPLOYEE DETAILS");
            System.out.println("\n5. EXIT");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    createEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    displayEmployee();
                    break;
                case 5 :
                    System.out.print("\nTerminating)");
            }
        }
        while(choice!=5);
    }

    private static Employee findEmployee(int id){
        for(Employee e : employees){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }

    private static void createEmployee(){
        System.out.println("\nEnter employee name : ");
        String name = sc.next();
        System.out.println("\nEnter employee designation : ");
        String designation = sc.next();
        System.out.println("\nEnter employee salary : ");
        long salary = sc.nextLong();
	System.out.print("\nEnter employee department : ");
        String department = sc.next();
        if(noOfEmployees<10){
            employees[noOfEmployees++] = new Employee(name,salary,designation);
            System.out.println("\nEmployee created");
        }
        else{
            System.out.println("\nCant create more than 10 employee");
        }

    }

    private static void updateEmployee(){
        System.out.print("Enter employee id : ");
        int id = sc.nextInt();
        Employee employee = findEmployee(id);
        if(employee!=null){
            System.out.print("\n1. Update name");
            System.out.print("\n2. Update salary");
            System.out.println("\n3. Update designation");
	    System.out.println("\n4. Update department");
            int c = sc.nextInt();
            switch (c){
                case 1 :
                    System.out.println("\nEnter name : ");
                    employee.setName(sc.next());
                    break;
                case 2 :
                    System.out.println("\nEnter salary : ");
                    employee.setSalary(sc.nextLong());
                    break;
                case 3 :
                    System.out.println("\nEnter designation : ");
                    employee.setDesignation(sc.next());
                    break;
		case 4 :
                    System.out.println("\nEnter department : ");
                    employee.setDesignation(sc.next());
                    break;
            }
        }
        else{
            System.out.println("\nNo employee exists with id : "+id);
        }
    }

    private static void deleteEmployee(){
        System.out.println("\nEnter employee id : ");
        int id = sc.nextInt();
        Employee employee = findEmployee(id);
        int index = 0;
        if(employee!=null){
            Employee[] newEmployeeList = new Employee[10];
            for(Employee e : employees){
                if(e!=null && e.getId()!=id) newEmployeeList[index++] = e;
            }
            noOfEmployees--;
            employees = newEmployeeList;
            System.out.println("\nDeleted employee");
        }
        else{
            System.out.print("\nNo employee with id : "+id);
        }
    }

    private static void displayEmployee(){
        System.out.println("\n1.Display employee by id");
        System.out.println("\n2.Display all");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("\nEnter employee id : ");
                int id = sc.nextInt();
                Employee e = findEmployee(id);
                System.out.println(e);
                break;
            case 2:
                for(Employee employee : employees){
                    if(employee!=null) System.out.println(employee);
                }
        }
    }
}