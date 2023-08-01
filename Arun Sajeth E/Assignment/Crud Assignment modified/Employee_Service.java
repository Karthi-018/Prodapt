package empman;
import java.util.*;

public class Employee_Service
{
    static int size_Array=0;
    static Scanner s=new Scanner(System.in);
    static Employee[] EmpArray = new Employee[20];
    static Employee[] temp = new Employee[20];
    
    public static void initalArray()
    {
        for(int i=0;i<3;i++)
        {
            create_Employee();
        }
    }
    
    public static Employee idChecking(int Emp_id)
    {
        Employee emp = null;
        for(int i=0;i<size_Array;i++)
        {
            if(EmpArray[i].getId() == Emp_id)
                emp=EmpArray[i];
        }
        return emp;
    }
    
    public static void search_Employee()
    {
        System.out.print("Enter the Employee Id to search:");
        int Emp_id = s.nextInt();
        Employee emp = idChecking(Emp_id);
        if(emp != null)
            System.out.println(emp);
        else
            System.out.println("Employee Id"+Emp_id+"is not found");
    }
    
    public static void create_Employee()
    {
        System.out.print("Enter the Employee ID:");
        int Emp_id = s.nextInt();
        Employee emp = idChecking(Emp_id);
        if(emp == null)
        {
            System.out.print("Enter the Employee Name:");
            String Emp_name = s.next();
            System.out.print("Enter the Employee Department:");
            String Emp_dept = s.next();
            System.out.print("Enter the Employee Salary:");
            int Emp_salary = s.nextInt();
            EmpArray[size_Array] = new Employee(Emp_id,Emp_name,Emp_dept,Emp_salary);
            size_Array+=1;
        }
        else
            System.out.println("Employee Id"+Emp_id+"is already exist");
    }
    
    public static void display_Employee()
    {
        for(int i=0;i<size_Array;i++)
            System.out.println(EmpArray[i]);
    }
    
    public static void update_Employee()
    {
        System.out.print("Enter the Employee Id to search:");
        int Emp_id = s.nextInt();
        Employee emp = idChecking(Emp_id);
        if(emp != null)
            switch_Choice(emp);
        else
            System.out.println("Employee Id"+Emp_id+"is not found");
    }
    
    public static void switch_Choice(Employee emp)
    {
        System.out.println("1. Update name");
        System.out.println("2. Update department");
        System.out.println("3. Update salary");
	System.out.print("Update Choice:");
        int update_Choice = s.nextInt();
        switch(update_Choice)
        {
            case 1:
                System.out.print("Enter the name to be updated:");
                emp.setName(s.next());
                break;
            case 2:
                System.out.print("Enter the department to be updated:");
                emp.setDept(s.next());
                break;
            case 3:
                System.out.print("Enter the salary to be updated:");
                emp.setSalary(s.nextInt());
                break;
        }
        System.out.println("Employee Id updated successfully");
    }
    
	public static void delete_Employee()
	{
	    System.out.println("Enter the Employee Id to be deleted:");
	    int Emp_id = s.nextInt();
	    Employee emp = idChecking(Emp_id);
	    if(emp !=null)
	    {
	        for(int j=0;j<size_Array;j++)
	        {
	            if(EmpArray[j].getId() == Emp_id)
	            {
	                for(int k=j;k<size_Array;k++)
				EmpArray[k]=EmpArray[k+1];
			EmpArray[size_Array-1]=null;
			size_Array-=1;
	            }
	        }	
		System.out.println("Employee Id deleted successfully");
	    }
	    else
	        System.out.println("Employee Id"+Emp_id+"is not founded");
	}

}
	