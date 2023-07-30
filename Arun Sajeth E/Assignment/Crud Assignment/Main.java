import java.util.*;

class Main
{
	private static ArrayList<Employee> EmpArray = new ArrayList<Employee>();
	static Scanner s= new Scanner(System.in);

	public static void main(String[] a)
	{
		int choice;
		System.out.print("No of Employee:");
		int No_Emp=s.nextInt();
		for(int i=0;i<No_Emp;i++)
		{
			Create();
		}
		
		do
		{
			System.out.println();
			System.out.println("1. Create");
			System.out.println("2. Udpate");
			System.out.println("3. Search");
			System.out.println("4. Display");
			System.out.println("5. Delete");
			System.out.println("0. Exit");
			System.out.println();

			System.out.print("Enter your choice:");
			choice = s.nextInt();
		
			switch(choice)
			{
				case 1: 
					System.out.println("\nCreating Employee Details:");
					Create();
					break;
				
				case 2: 
					System.out.println("\nUpdating Employee Details:");
					Update();
					System.out.println("------------------------------");
					break;
			
				case 3: 
					System.out.println("\nEnter the Employee Id for searching:");
					Search();
					System.out.println("------------------------------");
					break;
			
				case 4: 
					System.out.println("\nDisplaying all Employee details");
					Display();
					break;
			
				case 5: 
					Delete();
					System.out.println("------------------------------");
					break;
				
				case 0:
					System.out.println("Exit");
					break;

			}
		}while(choice!=0 && choice<6);

	}

	// Checking for Employee ID
	public static boolean IdChecking(int Emp_id)
	{
		for(Employee emp:EmpArray)
		{
			if(emp.getId()==Emp_id)
				return false;
		}
		return true;
		
	}

	// Create the Employee Details
	public static void Create()
	{
		System.out.print("Employee ID:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag==true)
		{		
			System.out.print("Employee Name:");
			String Emp_name=s.next();
			System.out.print("Employee Salary:");
			int Emp_salary=s.nextInt();
			EmpArray.add(new Employee(Emp_id,Emp_name,Emp_salary));
		}
		else
		{
			System.out.println("Employee Id "+Emp_id+" is already exixting.");
		}
		
	}

	//Updating the Employee Details
	public static void Update()
	{
		System.out.print("Employee ID:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag == true)
		{		
			System.out.println("Employed Id "+Emp_id+" is not founded");
		}
		else
		{
			System.out.print("Updated Employee Name:");
			String Emp_name=s.next();
			System.out.print("Updated Employee Salary:");
			int Emp_salary=s.nextInt();
			for(Employee emp: EmpArray)
			{
				if(emp.getId()==Emp_id)
				{
					emp.setName(Emp_name);
					emp.setSalary(Emp_salary);
				}
			}
			System.out.println("Employee Id "+Emp_id+" is updated.");		
		}
	}
	
	//Searching the Employee Details
	public static void Search()
	{
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag == true)
		{		
			System.out.println("Employed Id "+Emp_id+" is not founded");
		}
		else
		{
			for(Employee emp: EmpArray)
			{
				if(emp.getId()==Emp_id)
				{
					System.out.println("Employee name="+emp.getName());
					System.out.println("Employee salaray="+emp.getSalary());
				}
			}
		}
		
	}

	// Displaying the Employee Details
	public static void Display()
	{
		System.out.println("------------------------------");
		for(int i=0;i<EmpArray.size();i++)
		{
			System.out.println(EmpArray.get(i));
		}
		System.out.println("------------------------------");
	}
	
	//Deleting the Employing the Details
	public static void Delete()
	{
		Employee e=new Employee();
		System.out.print("Employee ID for deleting:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag==true)
		{
			System.out.println("Employed Id "+Emp_id+" is not founded");
		}
		else
		{
			for(Employee emp:EmpArray)
			{
				if(emp.getId()==Emp_id)
					e=emp;
			}
			EmpArray.remove(e);
			System.out.println("Employe ID "+Emp_id+" is deleted.");
		}
	}   
		
}
				
				