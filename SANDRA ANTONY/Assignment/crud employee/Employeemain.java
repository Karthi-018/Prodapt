import java.util.*;
class Employeemain
 {

    public static void main(String[] args)
    {   
        System.out.println("Enter 1 to create Employee details");
        System.out.println("Enter 2 to update Employee details");
        System.out.println("Enter 3 to search Employee details");
        System.out.println("Enter 4 to display all Employee details");
        System.out.println("Enter 5 to delete Employee details");
        
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
	    Employee obj = new Employee();
        Scanner s1 = new Scanner(System.in);
        Employee[] empArr = new Employee[20];
        //ArrayList<Employee> empdetail = new ArrayList<Employee>();
	
       
        
        
        
            switch(i)
            {
                case 1:
                    System.out.println("Enter number of employee IDs to create.");
                    int n= s.nextInt();

		    Employee emparr[]=new Employee[n];
		    for(int j=0;j<n;j++)
		    {
		    	System.out.println("Enter employee ID: ");    
		    	int eid = s.nextInt();
                    
                    	System.out.println("Enter Employee name: ");
                    	String ename= s1.nextLine();
                    
                    	System.out.println("Enter employee salary: ");
                    	int esal = s.nextInt();

			Employee employee = new Employee(eid,ename,esal);
			
			emparr[j] = employee;

                     } 

		     for(int k=0; k<emparr.length; k++)
		     {
	 	    
		     Employee arrdis = new Employee();
		     
		     arrdis.employeedetail(emparr[k]);                   
                     }
                     break;
                    
                case 2:
			
			obj.update();
            
		   break;
                    
                case 3:
	        
		    obj.searchdet();
		    break;
    
                case 4:
                  
		    obj.disdetails();
		    break;
                    
                case 5:
                    System.out.println("Deleting the Details");
                    break;
                    
                default:
                    System.out.println("Number entered is invalid");
                    
                    
            }
        
    }
        
}