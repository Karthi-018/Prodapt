package crud_employee;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.*;

public class Employeee
{
	static Scanner sc = new Scanner(System.in);	
	public static void main(String args[])
	{
		try 
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Employeee c = new Employeee();
		System.out.println("1. Create\n2. Display\n3. Update\n4. Search\n5. Delete");
		int n = sc.nextInt();
		
		switch(n)
		 {
		   case 1:
		    c.create(con);
		    break;
		    
		   case 2:
			c.display(con);
			break;
			
		   case 3:
			c.update(con);
			break;
			
		   case 4:
			c.search(con);
			break;
			
		   case 5:
			c.delete(con);
			break;
			
		   default:
			   System.out.println("Invalid");
		 }
		
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
     }
	
	
	
	public void create(Connection con) throws Exception
	{

		System.out.println("Enter Employee ID : ");
	        int eid = sc.nextInt();
		System.out.println("Enter Employee Name : ");
	        String ename = sc.next();
	        System.out.println("Enter Enployee Salary : ");
	        double esalary = sc.nextDouble();
	        
		PreparedStatement ps = con.prepareStatement("insert into emplopyee_table values (?, ?, ?)");
		ps.setInt(1,eid);
                ps.setString(2,ename);
                ps.setDouble(3, esalary);
                ps.executeUpdate();
                
            
	}
	
	
	
	public void display(Connection con) throws Exception
	{		
			
		    PreparedStatement ps = con.prepareStatement("select * from employee_table");
		    ResultSet rs = ps.executeQuery();
			
	        while(rs.next()) 
	        {
	        	System.out.println("Employee ID is : " + rs.getInt(1));
	        	System.out.println("Employee Name is : " + rs.getString(2));
	        	System.out.println("Employee Salary is : " + rs.getDouble(3));
	        }
		
	}

	
	public void update(Connection con) throws Exception
	{
		System.out.println("Enter Employee ID to be updated : ");
                int eid = sc.nextInt();
                System.out.println("Enter the Updated Employee Name : ");
                String emp_name=sc.next();
               System.out.println("Enter the Updated Employee Salary : ");
                Double emp_salary=sc.nextDouble();
        
        PreparedStatement ps=con.prepareStatement("select * from employee_table where eid = ?");
        ps.setInt(1, eid);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()) 
             {
                ps = con.prepareStatement("update crud_table set ename = ?, esalary = ? where eid = ?");
        	    ps.setString(1, emp_name);
        	    ps.setDouble(2, emp_salary);
        	    ps.setInt(3, eid);
        	    ps.executeUpdate();
        	   
            }
           
        else
            {
        	    System.out.println("Employee not found");
            }
        
	}
	
	
	
	public void search(Connection con) throws Exception
	{
		
	System.out.println("Enter your ID : ");
        int eid=sc.nextInt();
        
        PreparedStatement ps=con.prepareStatement("select * from employee_table where eid = ?");
        ps.setInt(1, eid);
		
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()) 
            {
        	    System.out.println("Employee ID is : " + rs.getInt(1));
        	    System.out.println("Employee Name is : " + rs.getString(2));
        	    System.out.println("Employee Salary is : " + rs.getDouble(3));
            }
       
        else
        	{
        		System.out.println("Employee with ID " + eid + " is not found");
        	}
        
	}
}


