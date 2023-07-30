import java.util.*;
class AssignEmployee
{
int i=0;
int j=0;
int Eid[]=new int[5];
String Ename[]=new String[5];
long Salary[]= new long[5];
String Design[]=new String[5];
String Dept[]=new String[5];
	
public void Create()
{
Scanner sc=new Scanner(System.in);
{
System.out.println("CREATE EMPLOYEE DETAILS");
}
	for(i=1;i<=5;i++)
	{
		System.out.println("Enter the details of employee "+i);
		System.out.println("Enter the Employee ID:");
		Eid[i]=sc.nextInt();
		System.out.println("Enter the Employee Name:");
		Ename[i]=sc.next();
		System.out.println("Enter the Employee Salary:");
		Salary[i]=sc.nextLong();
		System.out.println("Enter the Employee Designation:");
		Design[i]=sc.next();
		System.out.println("Enter the Employee Department:");
		Dept[i]=sc.next();

		System.out.println("********_____________*********");
		
	}
	for(i=1;i<=5;i++)
	{
		for(j=i+1;j<=5;j++)
		{
			if(Eid[i] == Eid[j])
			{
				System.out.println(+Eid[i]+ " Employee ID already exists. \n\nPlease enter the valid Id: ");
				Eid[i]=sc.nextInt();
			}
		}
	}
}

public void Update()
{
	System.out.println("UPDATE EMPLOYEE DETAILS");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Employee Id to update the details: ");
	int updateId= sc.nextInt();
		for(i=1;i<=5;i++)
		{
		if(updateId==Eid[i])
		{
			System.out.println("Enter the Employee Name to Update the Details: ");
			Ename[i]=sc.next();
			System.out.println("Enter the Employee Salary to Update the Details: ");
			Salary[i]=sc.nextLong();
		}
	}
}

public void Search()
{
	System.out.println("SEARCH EMPLOYEE DETAILS");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee ID to Search: "); 
	int searchId= sc.nextInt();
		for(i=1;i<=5;i++)
		{
		if(searchId==Eid[i])
		{
			System.out.println("Employee details found with an Employee ID"+ searchId);
			System.out.println("Employee's Id is "+Eid[i]);
			System.out.println("Employee's Name is "+Ename[i]);
			System.out.println("Employee's Salary is "+Salary[i]);
		}
	}		
}

public void Display()
{
	System.out.println("DISPLAY EMPLOYEE DETAILS");
	for(i=1;i<=5;i++)
	{
		System.out.println(+i+ "Employee's Id: "+Eid[i]);
		System.out.println(+i+ "Employee's Name: "+Ename[i]);
		System.out.println(+i+ "Employee's Salary: "+Salary[i]);
		System.out.println();
	}
}

public void Delete()
{
	System.out.println("DELETE EMPLOYEE DETAILS");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee ID to Delete: ");
	int deleteId=sc.nextInt();
	System.out.println("Employee ID "+deleteId+ " Details is deleted");
	System.out.println("Final Employee list");
	for(i=1;i<=5;i++)
	{
		if(deleteId==Eid[i])
		{
		continue;
		}
		System.out.println("Employee "+i+ " Id: "+Eid[i]);
		System.out.println("Employee "+i+ " Name: "+Ename[i]);
		System.out.println("Employee "+i+ " Salary: "+Salary[i]);
		System.out.println();
	}
}
}