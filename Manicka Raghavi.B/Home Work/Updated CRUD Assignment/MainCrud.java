package crudmvc; 
import java.util.*;
public class MainCrud
{   Scanner sc=new Scanner(System.in);
    static EmployeeService object=new EmployeeService(); 
    
    
    void userChoice() 
    {
        System.out.println("Welcome to EMP CRUD OPERATIONS"); 
        System.out.print("ENTER:\n 1-Create Employee Details \n 2-Update Employee Details \n 3-Delete Employee Details \n 4-Search Employee Details \n 5-Display All Employee Details\n 6-Exit");
        int choice=sc.nextInt();
        userMethods(choice);
        
    }
    
    void userMethods(int choice) 
    {
        switch(choice) 
        {
        case 1: System.out.println("CREATE EMPLOYEE DETAILS"); 
                System.out.println("Enter the Emp Id to create details:"); 
	            object.createEmpList(sc.nextInt()); 
	            break;
	            
	    case 2: System.out.println("UPDATE EMPLOYEE DETAILS");  
	            System.out.println("Enter the Emp Id to update:"); 
	            object.updateEmpList(sc.nextInt());  
	            break;
	            
	    case 3: System.out.println("DELETE EMPLOYEE DETAILS");  
	            System.out.println("Enter the Emp Id to delete:");
	            object.deleteEmpList(sc.nextInt()); 
	            break; 
	            
	    case 4: System.out.println("SEARCH EMPLOYEE DETAILS"); 
	            System.out.println("Enter the Emp Id to search:");
	            Employee e1=object.searchEmpList(sc.nextInt());  
	            
	            if(e1==null) 
	            System.out.println("Details Not Found");
	            
	            else
	            System.out.println(e1); 
	            
	            break; 
	            
	    case 5: System.out.println("DISPLAY ALL EMPLOYEE DETAILS");
	            object.displayEmpList();
	            break; 
	            
	    case 6:System.out.println("EXITING CRUD OPERATIONS"); 
	           System.exit(0);
        } 
        userChoice();
    }
	public static void main(String[] args) 
	{   
	   	 object.initalEmpList();  
	   	 (new MainCrud()).userChoice();
	   	  
	 }

}
