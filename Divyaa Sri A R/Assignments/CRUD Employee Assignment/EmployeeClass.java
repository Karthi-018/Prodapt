import java.util.Scanner;
class EmployeeClass
{
	int eid[]=new int[11];
	String ename[]=new String[11];
	long sal[]= new long[11];
	int i;
	int j;
public void createEmployee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("********Creating Employee Details********");
	for(i=1;i<=10;i++)
	{
		System.out.println("Enter the details of employee "+i);
		System.out.println("Enter Employee id:");
		eid[i]=sc.nextInt();
		System.out.println("Enter Employee name:");
		ename[i]=sc.next();
		System.out.println("Enter Employee Salary:");
		sal[i]=sc.nextLong();
		System.out.println("__________________________________");
		
	}
	for(i=1;i<=10;i++)
	{
		for(j=i+1;j<=10;j++)
		{
			if(eid[i]==eid[j])
			{
				System.out.println(+eid[i]+ " is already initialized. \nPlease enter correct Id: ");
				eid[i]=sc.nextInt();
			}
		}
	}
}
public void updateEmployee()
{
	System.out.println("********Updating Employee Details********");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Id to update the details: ");
	int updateId= sc.nextInt();
	for(i=1;i<=10;i++)
	{
		if(updateId==eid[i])
		{
			System.out.println("Enter the Employee Name to Update: ");
			ename[i]=sc.next();
			System.out.println("Enter the Employee Salary to Update: ");
			sal[i]=sc.nextLong();
		}
	}
}
public void displayEmployee()
{
	System.out.println("********Dispalying Employee Details********");
	for(i=1;i<=10;i++)
	{
		System.out.println("Employee "+i+ " Id: "+eid[i]);
		System.out.println("Employee "+i+ " Name: "+ename[i]);
		System.out.println("Employee "+i+ " salary: "+sal[i]);
		System.out.println("___________________________________");
	}
}
public void searchEmployee()
{
	System.out.println("********Searching Employee Details********");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Search Id: "); 
	int searchId= sc.nextInt();
	for(i=1;i<=10;i++)
	{
		if(searchId==eid[i])
		{
			System.out.println("Search Id details found!!!");
			System.out.println("Search Employee Id is "+eid[i]);
			System.out.println("Search Employee Name is "+ename[i]);
			System.out.println("Search Employee Salary is "+sal[i]);
		}
	}		
}
public void deleteEmployee()
{
	System.out.println("********Deleting Employee Details********");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the delete Id: ");
	int deleteId=sc.nextInt();
	System.out.println("Employee "+i+ " Details is deleted successfully!!!");
	System.out.println("Updated Employee list");
	for(i=1;i<=10;i++)
	{
		if(deleteId==eid[i])
		{
			continue;
		}
		System.out.println("Employee "+i+ " Id: "+eid[i]);
		System.out.println("Employee "+i+ " Name: "+ename[i]);
		System.out.println("Employee "+i+ " salary: "+sal[i]);
		System.out.println("___________________________________");
	}
}
}
	
	
	