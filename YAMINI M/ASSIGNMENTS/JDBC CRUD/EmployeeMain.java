package edu.prodapt.crud;

import java.util.*;
import java.sql.*;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connection success");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");

			System.out.println("1.Create the Employee Details\n 2.Display the Employee Details\n 3.Search the Employee Details\n 4.Update the Employee Details\n 5.Delete the Employee Details\n Enter your choice");
			int choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				createDetails(con);
				break;
			case 2:
				displayDetails(con);
				break;
			case 3:
				searchDetails(con);
				break;
			case 4:
				updateDetails(con);
				break;
			case 5:
				deleteDetails(con);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void createDetails(Connection con)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		int eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name:");
		String ename=sc.nextLine();
		System.out.println("Enter the Employee salary");
		long salary=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Employee Designation:");
		String design=sc.nextLine();
		
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?);");
			ps.setInt(1,eid);
			ps.setString(2,ename);
			ps.setLong(3,salary);
			ps.setString(4,design);
			int temp=ps.executeUpdate();
			System.out.println("Employee Details created successfully");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public static void displayDetails(Connection con)throws Exception
	{
		System.out.println("1.Display by Employee Id\n 2.Display all");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		sc.nextLine();
		
		switch(choice1)
		{
		case 1:
			try
			{
			System.out.println("Enter the Employee Id:");
			int id=sc.nextInt();
			sc.nextLine();
			PreparedStatement ps=con.prepareStatement("select * from Employee where eid=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			System.out.println("Id\tName\tSalary\tDesignation");
		
			while(rs.next()) {
			System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("design"));	
			}
			}	
			catch(SQLException e)
			{
				System.out.println(e);
			}
			break;
		case 2:
			try
		    {
				PreparedStatement ps=con.prepareStatement("select * from Employee");
				ResultSet rs=ps.executeQuery();
				System.out.println("Id\tName\tSalary\tdesignation");
				while(rs.next())
				{
					System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("design"));	
						
				}
			
		     }
			catch(SQLException e)
			{
				System.out.println(e);
			}
		}
		
	}
	
	public static void searchDetails(Connection con)throws Exception
	{
		try
		{
		System.out.println("Enter the Employee Id:");
		Scanner sc=new Scanner(System.in);
		int sid=sc.nextInt();
		sc.nextLine();
		PreparedStatement ps=con.prepareStatement("select * from Employee where eid=?");
		ps.setInt(1,sid);
		ResultSet rs=ps.executeQuery();
		System.out.println("Id\tName\tSalary\tdesignation");
		while(rs.next()) {
		System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("design"));	
		}
		}	
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public static void updateDetails(Connection con)throws Exception
	{
	System.out.println("Enter the Employee Id to update:");
	Scanner sc=new Scanner(System.in);
	int updateid=sc.nextInt();

	System.out.println("1.Update Name\n2.Update Salary\n3.Update Designation\nEnter your choice:");
	int choice2=sc.nextInt();
	sc.nextLine();
	try
	{
	switch(choice2)
	{
	case 1:
		System.out.println("Enter the Employee name:");
		String updatename=sc.nextLine();
		

			PreparedStatement ps=con.prepareStatement("update Employee set ename=? where eid=?");
			ps.setString(1,updatename);
			ps.setInt(2,updateid);
			int updation =ps.executeUpdate();
			if(updation == 1)
			{
					System.out.println(" Name updated successfully");
			}
			else
			{
				throw new EmployeeNotFoundException(updateid);
			}
		
		
		break;
	case 2:
		System.out.println("Enter Employee salary:");
		long updatesalary=sc.nextLong();
		
			PreparedStatement ps1=con.prepareStatement("update Employee set salary=? where eid=?");
			ps1.setLong(1,updatesalary);
			ps1.setInt(2,updateid);
			int updation1=ps1.executeUpdate();
			if(updation1==1)
			{
					System.out.println(" Salary updated successfully");
			}
			else
			{
				throw new EmployeeNotFoundException(updateid);
			}
		
		
		break;
	case 3:
		System.out.println("Enter Employee Designation:");
		String updatedesign=sc.nextLine();
		
			PreparedStatement ps2=con.prepareStatement("update Employee set desg=? where eid=?");
			ps2.setString(1,updatedesign);
			ps2.setInt(2,updateid);
			int updation2=ps2.executeUpdate();
			if(updation2==1)
			{
					System.out.println(" Designation updated successfully");
			}
			else
			{
				throw new EmployeeNotFoundException(updateid);
			}
		
		
		break;
	}
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	}
	
	public static void deleteDetails(Connection con)throws Exception
	{
		System.out.println("Enter the Employee Id to delete");
		Scanner sc=new Scanner(System.in);
		int deleteid=sc.nextInt();
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from Employee where eid=?");
			ps.setInt(1,deleteid);
			int delete=ps.executeUpdate();
			if(delete==1)
			{
				System.out.println("Employee Details Deleted successfully");
			}
			else
			{
			throw new EmployeeNotFoundException(deleteid);	
			}
		}
		catch(SQLException e)
		{
		System.out.println(e);	
		}
		catch(Exception e1)
		{
		System.out.println(e1);	
		}
	}
}
