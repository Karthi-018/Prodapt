package practice;
import java.util.*;
import java.sql.*;

public class Main
{
	static Scanner sc=new Scanner(System.in);
	List<Employee> l=new ArrayList<>();	
	static ResultSet rs;
	static PreparedStatement ps;
	public void operation()throws Exception
	{		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		System.out.println("Connection Established!!!");
		
		System.out.println("1. Create Employee\n2. Update Employee Details\n3. Search Employee Details using Employee Id\n4. Display all Employee Details\n5. Delete Employee from database\n6. Exit");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Creating New Employee");
			System.out.println("Enter employee id to check if the id already exists:");
			int id=sc.nextInt(); 
			rs=searchEmployee(id,con);
			if(rs!=null) {
				System.out.println("Employee already exists!!!");
			}
			else {
				createEmployee(id,con);
			}
			operation();
		
		case 2:
			System.out.println("Enter employee id to check if the id already exists or not:");

			int updateId=sc.nextInt();
			rs=searchEmployee(updateId,con);
			if(rs==null) {
				System.out.println("Employee Details not found!!!");
			}
			else {
				//System.out.println("Enter choice");
				updateEmployee(updateId,con);
			}
			operation();
			
		case 3:
			System.out.println("Enter Employee id to search");
			int searchId=sc.nextInt();
			rs=null;
			rs=searchEmployee(searchId,con);
			if(rs==null) {
				System.out.println("Employee Details not found!!!");
			}
			else 
			{
				
					
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));   
					

			}
			operation();
			
		case 4:
			System.out.println("Displaying all Employee Details");
			String query="select * from employee";
			displayEmployee(query,con);
			operation();
		
		case 5:
			System.out.println("Enter employee id to check if the id exists:");
			int deleteId=sc.nextInt();
			rs=searchEmployee(deleteId,con);
			if(rs==null) {
				System.out.println("No Employee Found!");
			}
			else {
				deleteEmployee(deleteId,con);
			}
			operation();
			
		case 6:
			System.out.println("BYE!!!");
			System.exit(0);
		}
	}
	public void createEmployee(int empId,Connection con)throws Exception {
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		System.out.println("Enter Employee Salary: ");
		int sal=sc.nextInt();
		l.add(new Employee(empId,name,sal));
		//System.out.println(l);
		String query="insert into employee values(?,?,?)"; 
		ps=con.prepareStatement(query);
		ps.setInt(1,empId);
		ps.setString(2, name);
		ps.setInt(3, sal);
        int temp=ps.executeUpdate();
		System.out.println("Employee created!");		
	}
	
	public void updateEmployee(int id,Connection con)throws Exception {
		System.out.println("1. name\n2. salary\n3. both");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter new Employee name: ");
			String name=sc.next();
			String query="update employee set employeeName=? where employeeid=?"; 
			ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("Employee name updated!");
		}
		else if(choice==2) {
			System.out.println("Enter new salary: ");
			int sal=sc.nextInt();
			String query="update employee set employeeSalary=? where employeeid=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,sal);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("Employee salary updated!");
		}
		else if(choice==3) {
			System.out.println("Enter new Employee name: ");
			String name=sc.next();
			System.out.println("Enter new salary: ");
			int sal=sc.nextInt();
			String query="update employee set employeeName=?,employeeSalary=? where employeeid=?";
			ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, sal);
			ps.setInt(3, id);
			ps.executeUpdate();
			//System.out.println("Employee name updated!");
//			System.out.println("Enter new salary: ");
//			int sal=sc.nextInt();
//			query="update employee set employeeSalary=? where employeeid=?";
//			ps=con.prepareStatement(query);
//			ps.setInt(1, sal);
//			ps.setInt(2, id);
//			ps.executeUpdate();
			System.out.println("Employee name and salary are updated!");
		}
	}
	public ResultSet searchEmployee(int id,Connection con) throws Exception {
		//System.out.println("Entered employee id is: "+id);
		String query="select * from employee where employeeId=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs1=ps.executeQuery();
		int flag=0;
		while(rs1.next())
		{
			if(rs1.getInt(1)>=1)
				
				{  flag=1;
				   return rs1;
				}
				
		}
		if(flag==0)
		{
		 rs1=null;	
	    }
		return rs1;
		
	}

	
	public void displayEmployee(String query,Connection con)throws Exception {
		ps=con.prepareStatement(query);
		rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		System.out.println("All Employee Details displayed!");
	}
	public void deleteEmployee(int deleteId,Connection con)throws Exception {
		System.out.println("Entered Id is: "+deleteId);
		String query="delete from employee where employeeId=?";
		ps=con.prepareStatement(query);
		ps.setInt(1, deleteId);
		ps.executeUpdate();
		System.out.println("Employee with employeeId: "+deleteId+" is deleted from the database!");
	}
	
		

	public static void main(String args[]) throws Exception {
		try {
			Main m=new Main();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");

			m.operation();			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
