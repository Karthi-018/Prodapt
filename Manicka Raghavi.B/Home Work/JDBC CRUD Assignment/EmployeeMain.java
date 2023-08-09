package employeecrud;
import java.sql.*;
import java.util.*;
public class EmployeeMain 
{
    static Scanner sc=new Scanner(System.in); 
    PreparedStatement ps;
    ResultSet rs;
    int id;
    int flag=1;
    
    void userChoice(Connection con) throws SQLException 
    {   
       while(flag==1)
       {
         System.out.println("Welcome to EMPLOYEE CRUD OPERATIONS\n"); 
         System.out.println("ENTER:\n 1-Create Employee Details \n 2-Update Employee Details \n 3-Delete Employee Details \n 4-Search Employee Details \n 5-Display All Employee Details\n 6-Exit");
         int choice=sc.nextInt();
           
         switch(choice) 
         {
          case 1: 
        	    System.out.println("CREATE EMPLOYEE DETAILS"); 
	            createEmpList(con); 
	            break;
	            
	      case 2: 
	    	    System.out.println("UPDATE EMPLOYEE DETAILS");  
	            System.out.println("Enter the Emp Id to update:"); 
	            updateEmpList(con,sc.nextInt());  
	            break;
	            
	      case 3: 
	    	    System.out.println("DELETE EMPLOYEE DETAILS");  
	            System.out.println("Enter the Emp Id to delete:");
	            deleteEmpList(con,sc.nextInt()); 
	            break; 
	            
	      case 4: 
	    	    System.out.println("SEARCH EMPLOYEE DETAILS"); 
	    	    System.out.println("Enter the Empolyee Id to Search");  
	            rs=searchEmpList(con,sc.nextInt()); 
	            if(rs!=null)
	            { 
	              EmployeePojo object=pojoObject(rs);
	              System.out.println("DETAILS FOUND\n"); 
 	    		  System.out.println(object); 
	            }
	            else
	            {
	            	System.out.println("Emp Id not found in the database\n");
	            }
 	    		  break;
	            
	      case 5: 
	    	    System.out.println("DISPLAY ALL EMPLOYEE DETAILS");
	            displayEmpList(con);
	            break; 
	            
	      case 6:
	    	    System.out.println("EXITING CRUD OPERATIONS"); 
	            System.exit(0);
        } 
        System.out.println("WISH TO CONTINUE ->1 EXIT->0");
        flag=sc.nextInt();
      }
    }   
     

    void createEmpList(Connection con) throws SQLException 
    { 
    	    System.out.println("Enter the Emp Id to create details:"); 
    	    int id=sc.nextInt();
            System.out.println("Enter Emp Name to be created");
            String name=sc.next(); 
            System.out.println("Enter Emp Salary to be created"); 
            int salary=sc.nextInt(); 
            
            EmployeePojo object=new EmployeePojo(id,name,salary);
            ps=con.prepareStatement("insert into employee values(?,?,?)"); 
            ps.setInt(1,object.getId());
            ps.setString(2,object.getName());
            ps.setInt(3,object.getSalary()); 
            int temp=ps.executeUpdate();
            
            System.out.println("Details created successfully\n");  
   } 

    void displayEmpList(Connection con) throws SQLException 
    {
    	   ps=con.prepareStatement("select*from employee");
    	   rs= ps.executeQuery();  
    	   while(rs.next())
    	   {
    		   EmployeePojo object=pojoObject(rs);
	    	   System.out.println(object);
    	   } 
    }

     
    ResultSet searchEmpList(Connection con,int id) throws SQLException 
    {
        ps=con.prepareStatement("select*from employee");
 	    rs= ps.executeQuery();  
 	    int flag=0;
 	    while(rs.next())
 	    {
 	    	if(rs.getInt(1)==id)
 	    	{
 	    		flag=1;
 	    		break;
 	    		
 	    	}
 	    }
 	    if(flag==0)
 	    	rs=null;
 	    return rs;
        
    } 
    
    void updateEmpList(Connection con,int id) throws SQLException 
    {   
        rs=searchEmpList(con,id); 
        if(rs==null)
        	System.out.println("Emp Id not found in the database\n"); 
        else 
        {   
            EmployeePojo object=pojoObject(rs);
        	System.out.println("Enter your choice \n 1-Update Emp Name \n 2-Update Emp Salary"); 
     	    int n=sc.nextInt(); 
     	    String update="update employee set"; 
     	   switch(n) 
    	   {
    	    case 1:System.out.println("Enter Emp Name to be updated");
    	           object.setName(sc.next());
    	           update=update.concat(" name=? where id=?");
    	           ps=con.prepareStatement(update.toString());  
      	      	   ps.setString(1,object.getName()); 
    	           break;
    	                           
    	    case 2:System.out.println("Enter Emp Salary to be updated");
                   object.setSalary(sc.nextInt());
                   update=update.concat(" salary=? where id=?"); 
                   ps=con.prepareStatement(update.toString());  
      	      	   ps.setInt(1,object.getSalary());
                   break;	                        
    	   }
     	  ps.setInt(2,object.getId());
     	  int temp=ps.executeUpdate(); 
     	  if(temp>0)
     		  System.out.println("Update Successful\n");
        }
      
    } 
    
    void deleteEmpList(Connection con,int id) throws SQLException 
    {
    	rs=searchEmpList(con,id); 
        if(rs==null)
        	System.out.println("Emp Id not found in the database"); 
        else
        {  
        	ps=con.prepareStatement("delete from employee where id=?");  
        	EmployeePojo object=pojoObject(rs);
        	ps.setInt(1,object.getId());
        	int temp=ps.executeUpdate(); 
       	    if(temp>0)
       		  System.out.println("Delete Successful\n");
        }
     
    } 
    
    EmployeePojo pojoObject(ResultSet rs) throws SQLException
    {
		
    	EmployeePojo object=new EmployeePojo(rs.getInt(1),rs.getString(2),rs.getInt(3));
    	return object;
     
    }
    
	public static void main(String[] args) 
	{   
	   try 
	   {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("Driver Loaded Classes");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empcrud","root","root");
	    System.out.println("Connection success");  
	   	(new EmployeeMain()).userChoice(con); 
	   }
	   catch(Exception e)
	   {
		System.out.println(e);
	   }
	   	  
	}
}
