import java.util.Scanner;

public class EmployeeOperationCrud
{
	EmployeeCrud[] empArr= new EmployeeCrud[10];
	int Emp=0;
	Scanner sc= new Scanner(System.in);

	public EmployeeCrud searchEmployee(int id)
	{
        	for(EmployeeCrud e : empArr)
		{
            		if(e.getEid() == id)
			{
                		return e;
            		}
        	}
        	return null;
	}
	
	public void createEmployee()
	{
		System.out.println("********Creating Employee List********");
		System.out.println("Enter employee ID: ");
		int id = sc.nextInt();
        	System.out.println("Enter employee name : ");
        	String name = sc.next();
		System.out.println("Enter employee salary : ");
        	long salary = sc.nextLong();
        	System.out.print("Enter employee designation : ");
        	String department = sc.next();
        	if(Emp<10)
		{
            		empArr[Emp++] = new EmployeeCrud(id,name,salary,department);
        	}
        	
	}

	public void updateEmployee()
	{
        	System.out.print("Enter employee id : ");
        	int id = sc.nextInt();
        	EmployeeCrud emp = searchEmployee(id);
		if(emp!=null)
		{
                	System.out.println("1. Update name");
            		System.out.println("2. Update salary");
            		System.out.println("3. Update department");
			System.out.println("Enter your sub choice: ");
			int c=sc.nextInt();
			switch (c)
			{
                		case 1 :
                    			System.out.print("Enter name: ");
                    			emp.setEName(sc.next());
                    			break;
                		case 2 :
                    			System.out.print("\nEnter salary: ");
                    			emp.setSalary(sc.nextLong());
                    			break;
                		case 3 :
                    			System.out.print("\nEnter department: ");
                    			emp.setDepartment(sc.next());
                    			break;
            		}
        	}
        	
	}
	
	public void displayEmployee()
	{
        	System.out.print("********Displaying employee details********");
        	for(EmployeeCrud employee : empArr)
		{
			if(employee!=null) 
			{
				System.out.println(employee);
                	}
        	}
    	}

	public void deleteEmployee()
	{
        	System.out.print("\nEnter employee id : ");
        	int id = sc.nextInt();
		EmployeeCrud[] newEmpArr= new EmployeeCrud[10];
		int i=0;
		for(EmployeeCrud e : empArr)
		{
            		if(e.getEid() != id)
			{
                		newEmpArr[i++]=e;
            		}
		}
		empArr= newEmpArr;
		System.out.println("Employee details detailed successfully");
        	
        }
}
