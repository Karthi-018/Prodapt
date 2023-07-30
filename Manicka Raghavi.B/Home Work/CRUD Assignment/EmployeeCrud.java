package crud; 
import java.util.*;
class EmployeeCrud
{   
	public static void main(String[] args) 
	{ 
	int num,flag=1;  
	EmployeeDetails object=new EmployeeDetails();
	EmployeeDetails empobject[]=new EmployeeDetails[10];   
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++) 
	{
	    EmployeeDetails e=new EmployeeDetails(i); 
	    empobject[i]=e; 
	}  
	while(flag==1)
	{
	System.out.println("\nWELCOME TO EMPLOYEE CRUD OPERATION \n");
	System.out.print("ENTER:\n 1-Create Employee Details \n 2-Update Employee Details \n 3-Delete Employee Details \n 4-Search Employee Details \n 5-Display All Employee Details\n");
	num=sc.nextInt(); 
	switch(num)
	{
	    case 1: System.out.println("CREATE EMPLOYEE DETAILS");
	            object.create(empobject); 
	            break;
	    case 2: System.out.println("UPDATE EMPLOYEE DETAILS");
	            object.update(empobject);
	            break; 
	    case 3: System.out.println("DELETE EMPLOYEE DETAILS");  
	            object.delete(empobject);
	            break; 
	    case 4: System.out.println("SEARCH EMPLOYEE DETAILS"); 
	            object.search(empobject);
	            break;
	    case 5: System.out.println("DISPLAY ALL EMPLOYEE DETAILS");
	            object.display(empobject);
	            break; 
	    default:System.out.println("CHOSE THE WRONG NUMBER\n");
	   
	}
	System.out.println("Wish to continue then type 1 else type 0");
	flag=sc.nextInt(); 
	}
	}
}