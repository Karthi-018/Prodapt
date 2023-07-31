import java.util.Scanner;

class Employee {
    String name;
    int id;
    long sal;

    public Employee(String name, int id, long sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + sal;
    }
}

class EmployeeDetails {
    private static Scanner sc = new Scanner(System.in);
    private static Employee[] emparray = new Employee[20];
    private static int empcount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose from menu");
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            int menu_val = sc.nextInt();

            switch (menu_val) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void createEmployee() {
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter salary");
        long sal = sc.nextLong();
        Employee createemp = new Employee(name, id, sal);
        emparray[empcount] = createemp;
        empcount++;
    }

    private static void displayEmployees() {
        for (int i = 0; i < empcount; i++) {
            System.out.println(emparray[i]);
        }
    }

    private static void updateEmployee() {
        System.out.println("Enter id to be updated");
        int empid = sc.nextInt();
        for (int i = 0; i < empcount; i++) {
            if (emparray[i].id == empid) {
                System.out.println("Enter name");
                String ename = sc.next();
                System.out.println("Enter salary");
                long esal = sc.nextLong();
                emparray[i].name = ename;
                emparray[i].sal = esal;
                break;
            }
        }
    }

    private static void deleteEmployee() {
        System.out.println("Enter id to be deleted");
        int eid = sc.nextInt();
        Employee[] tempArray = new Employee[20];
        int tempCount = 0;

        for (int i = 0; i < empcount; i++) {
            if (emparray[i].id != eid) {
                tempArray[tempCount] = emparray[i];
                tempCount++;
            }
        }

        if (tempCount == empcount) {
            System.out.println("Employee ID not found!");
        } else {
            emparray = tempArray;
            empcount = tempCount;
        }
    }

}




/*
    private static void deleteEmployee() {
	int eid=sc.nextInt();
		for(int i=0;i<=empcount;i++)
		{
			if(emparray[i].id==eid)
				{
					emparray[i] = emparray[empcount-1];
					emparray[empcount-1] = null;	
					empcount--;				
				}
			}
	}
*/



/* Arraylist

import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    String name;
    int id;
    long sal;

    public Employee(String name, int id, long sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + sal;
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {

        ArrayList<Employee> emparraylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Choose from menu");
            System.out.println("1.Create");
            System.out.println("2.Display");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            int menu_val = sc.nextInt();

            switch (menu_val) {
                case 1:
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    System.out.println("Enter salary");
                    long sal = sc.nextLong();
                    Employee createemp = new Employee(name, id, sal);
                    emparraylist.add(createemp);
                    break;

                case 2:
                    for (Employee emp : emparraylist) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.println("Enter id to be updated");
                    int empid = sc.nextInt();
                    for (Employee emp : emparraylist) {
                        if (emp.id == empid) {
                            System.out.println("Enter name");
                            String ename = sc.next();
                            System.out.println("Enter salary");
                            long esal = sc.nextLong();
                            emp.name = ename;
                            emp.sal = esal;
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter id to be deleted");
                    int eid = sc.nextInt();
                    for (int i = 0; i < emparraylist.size(); i++) {
                        if (emparraylist.get(i).id == eid) {
                            emparraylist.remove(i);
                            break;
                        }
                    }
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}



*/
	
