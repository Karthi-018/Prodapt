import java.util.*;
public class MainClass {
    private static CRUDAssignment[] employees = new CRUDAssignment[10];
    private static final int Max_Employee=10;

    private static int empcount=0;
    public MainClass()
    {
        employees = new CRUDAssignment[Max_Employee];
        empcount=0;

    }
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        do{
            System.out.print("1. CREATE \n");
            System.out.print("2. UPDATE \n");
            System.out.print("3. SEARCH \n");
            System.out.print("4. DISPLAY \n");
            System.out.print("5. DELETE \n");
            System.out.println("6. EXIT \n");
            choice = sc.nextInt();
            System.out.println("Enter Employee Id:");
            int empid=sc.nextInt();
            System.out.println("Enter Employee Name");
            String empName=sc.next();
            System.out.println("Enter Employee Salary");
            long salary=sc.nextLong();
            switch (choice){
                case 1 :

                    createEmployee(empid,empName,salary);
                    break;
                case 2:
                    updateEmployee(empid,empName,salary);
                    break;
                case 3:
                    SearchEmployee(empid);
                    break;
                case 4:
                    displayEmployee();
                    break;
                case 5:
                    deleteEmployee(empid);
                    break;
                case 6 :
                    System.out.print("EXIT");
            }
        }
        while(choice!=6);
    }
    public static void createEmployee(int id, String name, long salary) {
        if (empcount < Max_Employee) {
            CRUDAssignment employee = new CRUDAssignment(id, name, salary);
            employees[empcount] = employee;
            empcount++;
            System.out.println("Employee Created Successfully");
        } else {
            System.out.println("Maximum Employees Hired");
        }
    }
    public static void displayEmployee()
    {
        System.out.println("Employee Details");
        for(int i=0;i<empcount;i++)
        {
            System.out.println(employees[i]);
        }
    }
    public static CRUDAssignment SearchEmployee(int id)
    {
        for(int i=0;i<empcount;i++)
        {
            if(employees[i].getId()==id)
            {
                return employees[i];
            }
        }
        return null;
    }
    public static void updateEmployee(int id, String name, long salary)
    {
        for(int i=0;i<empcount;i++)
        {
            if(employees[i].getId()==id)
            {
                employees[id].setName(name);
                employees[id].setSalary(salary);
                return;
            }
        }
        System.out.println("Employee id"+id+" not found");
    }
    public static void deleteEmployee(int id)
    {
        for(int i=0;i<empcount;i++)
        {
            if(employees[i].getId()==id)
            {
                for(int j=i;j<empcount-1;j++)
                {
                    employees[j]=employees[j+1];
                }
                empcount--;
                System.out.println("Employee Deleted Successfully");
                return;
            }
        }

    }


}



