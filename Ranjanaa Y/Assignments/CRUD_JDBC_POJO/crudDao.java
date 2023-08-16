package crudconnection;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class crudDao 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void create(Connection con) 
	{
		// TODO Auto-generated method stub
		try 
		{
			System.out.println("Enter emp id: ");
			int id = sc.nextInt();
			System.out.println("Enter emp name: ");
			String name = sc.next();
			System.out.println("Enter emp salary: ");
			int sal = sc.nextInt();
			System.out.println("Enter emp designation: ");
			String des = sc.next();
			Employee emp = new Employee(id,name,sal,des);
			
			PreparedStatement ps = con.prepareStatement("insert into employee value(?,?,?,?)");
			
			ps.setInt(1,emp.getEmpid());
			ps.setString(2, emp.getEmpname());
			ps.setInt(3,emp.getEmpsal());
			ps.setString(4,emp.getEmpdes());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void display(Connection con) 
	{
		// TODO Auto-generated method stub
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from employee order by empid");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" " +rs.getString(4));
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static void update(Connection con) {
		// TODO Auto-generated method stub
		System.out.println("Enter id :");
		int uid = sc.nextInt();
		System.out.println("Enter your choice to update employee by \n1. name\n2. salary\n3. designation:");
		int update = sc.nextInt();
		switch(update)
		{
		case 1:
		System.out.println("Enter emp name to update: ");
		String uname = sc.next();
		try
		{
			PreparedStatement ps = con.prepareStatement("update employee set empname = ?  where empid = ? ");
			ps.setString(1,uname);
			ps.setInt(2,uid);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		break;
		
		case 2:
			System.out.println("Enter emp salary to update: ");
			String usalary = sc.next();
			try
			{
				PreparedStatement ps = con.prepareStatement("update employee set empsal = ?  where empid = ? ");
				ps.setString(1,usalary);
				ps.setInt(2,uid);
				ps.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
			
		case 3 :
			System.out.println("Enter emp designation to update: ");
			String udes = sc.next();
			try
			{
				PreparedStatement ps = con.prepareStatement("update employee set empdes = ?  where empid = ? ");
				ps.setString(1,udes);
				ps.setInt(2,uid);
				ps.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
		}
	}
	
	public static void delete(Connection con) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter id :");
		int did = sc.nextInt();
		try {
			PreparedStatement p = con.prepareStatement("delete from employee where empid = ? ");
			p.setInt(1, did);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void search(Connection con) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter emp id to search: ");
		int sid = sc.nextInt();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from employee where empid = ?");
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" " +rs.getString(4));
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
}
