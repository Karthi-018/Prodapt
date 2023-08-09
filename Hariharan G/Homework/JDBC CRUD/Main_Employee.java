package Project;
import java.util.*;
import java.sql.*;
public class Main_Employee {
	static Scanner sc=new Scanner(System.in);
	public void display(Connection con) 
	{
		System.out.println("Select 1 to create");                                       //ask user what to do?
		System.out.println("Select 2 to update");
		System.out.println("Select 3 to search");
		System.out.println("Select 4 to display all employee details");
		System.out.println("Select 5 to delete");
		System.out.println("Select 6 to exit");
		System.out.println("Enter choice: ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			createEmployee(con);
			display(con);
			//break;
		case 2:
			updateEmployee(con);
			display(con);
			
		case 3:
			searchEmployee(con);
			display(con);
		case 4:
			displayEmployee(con);
			display(con);
			
		case 5:
			deleteEmployee(con);
			display(con);
			
		default:
			System.out.println("BYE!!!");
			break;
		}

		
	}
	public void createEmployee(Connection con)
	{
		System.out.println("Enter employee id:");
		int eid=sc.nextInt();
		System.out.println("Enter employee name:");
		String name=sc.next();
		System.out.println("Enter employee salary:");
		int sal=sc.nextInt();
		try {
			Connection con1=con;
			PreparedStatement ps=con1.prepareStatement("insert into employee_details values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3,sal);
			ps.executeUpdate();
			System.out.println("Employee created!!!");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateEmployee(Connection con)
	{
		System.out.println("Enter Employee Id to update");
		int id=sc.nextInt();
		System.out.println("1-update name\n2-update salary");
		int choice=sc.nextInt();
		if(choice==1) {
			try {
			System.out.println("Enter new employee name");
			String newName=sc.next();
			String query="update employee_details set empName=? where empId=?";
			
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, newName);
				ps.setInt(2, id);
				//ps.executeQuery();
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));   
				}
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(choice==2) {
			try {
			System.out.println("Enter new employee salary ");
			int newSal=sc.nextInt();
			String query="update employee_details set sal=? where empId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,newSal);
			ps.setInt(2, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));   
			}
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			}
		}
		

	public void searchEmployee(Connection con)
	{
		System.out.println("Enter Employee Id to search");
		int search=sc.nextInt();
		String query="select * from employee_details where empId=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, search);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void displayEmployee(Connection con)
	{
		String query="select * from employee_details";
		try {
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3) );
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	public void deleteEmployee(Connection con)
	{
		System.out.println("Enter employee id to delete from table");
		int delId=sc.nextInt();
		String query="delete from employee_details where empId=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, delId);
			int temp=ps.executeUpdate();
	        System.out.println("empId " + delId + " details has been deleted");
	

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("SUCCESS!!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_employee","root","root");
			System.out.println("CONNECTION ESTABLISHED");
			Main_Employee me=new Main_Employee();
			me.display(con);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
