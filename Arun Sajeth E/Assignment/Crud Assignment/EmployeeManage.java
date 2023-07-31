import java.util.*;
class EmployeeManage
{
	static int Size=0;
	static Employee[] EmpArray=new Employee[10];
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] a)
	{
		int choice;

		do
		{
			System.out.println();
			System.out.println("1. Create");
			System.out.println("2. Update");
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
					if(Size>=EmpArray.length)
						System.out.println("Array is full");
					else
						Create();
					break;
				case 2:
					Update();
					break;
				case 3:
					Search();
					break;
				case 4:
					System.out.println("Employee Details:");
					Display();
					break;
				case 5:
					Delete();
					break;
				case 0:
					System.out.println("Exit");
					break;
			}
			
		}while(choice<6);
	}
	
	public static boolean IdChecking(int Emp_id)
	{
		for(int i=0;i<Size;i++)
		{
			if(EmpArray[i].getId()==Emp_id)
				return false;
		}
		return true;
		
	}

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
			Employee e=new Employee(Emp_id,Emp_name,Emp_salary);
			EmpArray[Size]=e;
			Size+=1;
		}
		else
		{
			System.out.println("Employee Id "+Emp_id+" is already exixting.");
		}
		
	}
	
	public static void Update()
	{
		System.out.print("Enter the Employee ID to be updated:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag==true)
			System.out.println("Employed Id "+Emp_id+" is not founded");
		else
		{
			System.out.print("Updated Employee Name:");
			String Emp_name=s.next();
			System.out.print("Updated Employee Salary:");
			int Emp_salary=s.nextInt();
			for(int i=0;i<Size;i++)
			{
				if(EmpArray[i].getId()==Emp_id)
				{
					EmpArray[i].setName(Emp_name);
					EmpArray[i].setSalary(Emp_salary);
				}
			}
			System.out.println("Employee Id "+Emp_id+" is updated.");
		}
	}
	
	public static void Search()
	{
		System.out.print("Enter the Employee ID to searched:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag==true)
			System.out.println("Employed Id "+Emp_id+" is not founded");
		else
		{
			for(int i=0;i<Size;i++)
			{
				if(EmpArray[i].getId()==Emp_id)
				{
					System.out.println("Employee name="+EmpArray[i].getName());
					System.out.println("Employee salaray="+EmpArray[i].getSalary());
				}
			}
		}
	}

	public static void Delete()
	{
		System.out.print("Enter the Employee ID to be deleted:");
		int Emp_id=s.nextInt();
		boolean flag=IdChecking(Emp_id);
		if(flag==true)
			System.out.println("Employed Id "+Emp_id+" is not founded");
		else
		{
			for(int i=0;i<Size;i++)
			{
				if(EmpArray[i].getId()==Emp_id)
				{
					for(int j=i;j<Size-1;j++)
						EmpArray[j]=EmpArray[j+1];
					EmpArray[Size-1]=null;
					Size-=1;
				}
			}
			System.out.println("Eployee Id Deleted Successfully");
		}
		
	}
	
	public static void Display()
	{
		for(int i=0;i<Size;i++)
			System.out.println(EmpArray[i]);
	}
}