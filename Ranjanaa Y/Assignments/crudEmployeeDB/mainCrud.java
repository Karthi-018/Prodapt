package crudconnection;
import java.util.*;
import java.sql.*;
public class mainCrud 
{
	public static void main(String args[])
	{
		Connection con;
		PreparedStatement ps;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
		Scanner sc = new Scanner(System.in);
		int choice =0 ;
		while(choice !=5)
		{
			System.out.println("Enter 1 to create a table: ");
			System.out.println("Enter 2 to display a table: ");
			System.out.println("Enter 3 to update a table: ");
			System.out.println("Enter 4 to delete a table: ");
			System.out.println("Enter 5 to exit: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 : create(con);break;
			case 2 : display(con);break;
			case 3 : update(con);break;
			case 4 : delete(con);break;
			case 5 : System.exit(0);
			
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void create(Connection con)
	{
		// get details of employee
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee id : ");
		int id = s.nextInt();
		System.out.println("Enter Employee name : ");
		String name = s.next();
		System.out.println("Enter Employee salary : ");
		int salary = s.nextInt();
		System.out.println("Enter Employee designation : ");
		String designation = s.next();
		
		// insert the details to table through prepared statements
		try
		{
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		ps.setString(4, designation);
		// to execute query
		int temp = ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public static void display(Connection con)
	{
		try 
		{
			// to retrieve data
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			// to print the retrival data
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			System.out.println("This is the table........");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void update(Connection con)
	{
		
		try
		{
			Scanner su = new Scanner(System.in);
			System.out.println("Enter Employee id to update : ");
			int uid = su.nextInt();
			System.out.println("Enter Employee name to update : ");
			String uname = su.next();
			System.out.println("Enter Employee salary to update: ");
			int usalary = su.nextInt();
			System.out.println("Enter Employee designation to update: ");
			String udesignation = su.next();
			PreparedStatement ps = con.prepareStatement("update employee set empid = ?,empname = ?,empsal = ?,empdes =?");
			ps.setInt(1,uid);
			ps.setString(2,uname);
			ps.setInt(3, usalary);
			ps.setString(4, udesignation);
			int temp = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Updated the employee detail successfully........");
	}
	public static void delete(Connection con)
	{
		try
		{
			Scanner sd = new Scanner(System.in);
			System.out.println("Enter employee id to delete the employee: ");
			int did = sd.nextInt();
			PreparedStatement ps = con.prepareStatement("delete from employee where empid = ? ");
			ps.setInt(1, did);
			int temp = ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Deleted the employee detail successfully........");
	}
}

