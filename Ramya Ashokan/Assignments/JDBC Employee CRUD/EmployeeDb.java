package com.employee;
import java.util.*;
import java.sql.*;
public class EmployeeDb {
static Scanner sc=new Scanner(System.in);
static Employee emp=new Employee();
public static void main(String args[])
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	int choice;
	do
	{
		System.out.println("1.Create\n2.Display\n3.Search\n4.Update\n5.Delete\n6.Exit\nEnter the choice");
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			create(con);
			break;
		case 2:
			display(con);
			break;
		case 3:
			search(con);
			break;
		case 4:
			update(con);
			break;
		case 5:
			delete(con);
			break;
		case 6:
			System.exit(0);
		}
	}while(choice<7);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
public static void create(Connection con)throws Exception
{
	System.out.println("Enter the Employee id:");
	int eid=sc.nextInt();
	emp.setEid(eid);
	sc.nextLine();
	System.out.println("Enter the Name:");
	String ename=sc.nextLine();
	emp.setEname(ename);
	System.out.println("Enter the salary");
	long salary=sc.nextLong();
	emp.setSalary(salary);
	sc.nextLine();
	System.out.println("Enter the Designation:");
	String desg=sc.nextLine();
	emp.setDesg(desg);
	try
	{
		PreparedStatement ps=con.prepareStatement("insert into employee1 values(?,?,?,?);");
		ps.setInt(1,emp.getEid());
		ps.setString(2,emp.getEname());
		ps.setLong(3,emp.getSalary());
		ps.setString(4,emp.getDesg());
		int temp=ps.executeUpdate();
		System.out.println("Employee created successfully");
	}
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}
public static void display(Connection con)throws Exception
{
	System.out.println("1.Display by Id\n2.Display all");
	int choice1=sc.nextInt();
	sc.nextLine();
	switch(choice1)
	{
	case 1:
		try
		{
			System.out.println("Enter the id:");
		int id=sc.nextInt();
		sc.nextLine();
		PreparedStatement ps=con.prepareStatement("select * from employee1 where eid=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		System.out.println("Id\tName\tSalary\tdesignation");
	
		while(rs.next()) {
		System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("desg"));	
		}
		}	
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 2:
		try
	    {
			PreparedStatement ps=con.prepareStatement("select * from employee1");
			ResultSet rs=ps.executeQuery();
			System.out.println("Id\tName\tSalary\tdesignation");
			while(rs.next())
			{
				System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("desg"));	
					
			}
		
	     }
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}
public static void search(Connection con)throws Exception
{
	try
	{
	System.out.println("Enter the id:");
	int sid=sc.nextInt();
	sc.nextLine();
	PreparedStatement ps=con.prepareStatement("select * from employee1 where eid=?");
	ps.setInt(1,sid);
	ResultSet rs=ps.executeQuery();
	System.out.println("Id\tName\tSalary\tdesignation");
	while(rs.next()) {
	System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getLong("salary")+"\t"+rs.getString("desg"));	
	}
	}	
	catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
}
public static void update(Connection con)throws Exception
{
System.out.println("Enter the employee id to update:");
int uid=sc.nextInt();

System.out.println("1.Update Name\n2.Update Salary\n3.Update Designation\nEnter the choice:");
int choice1=sc.nextInt();
sc.nextLine();
try
{
switch(choice1)
{
case 1:
	System.out.println("Enter name:");
	String upname=sc.nextLine();
	emp.setEname(upname);

		PreparedStatement ps=con.prepareStatement("update employee1 set ename=? where eid=?");
		ps.setString(1,emp.getEname());
		ps.setInt(2,uid);
		int updation1=ps.executeUpdate();
		if(updation1==1)
		{
				System.out.println(" Name updated successfully");
		}
		else
		{
			throw new EmployeeNotFoundException(uid);
		}
	
	
	break;
case 2:
	System.out.println("Enter salary:");
	long upsalary=sc.nextLong();
	emp.setSalary(upsalary);
		PreparedStatement ps1=con.prepareStatement("update employee1 set salary=? where eid=?");
		ps1.setLong(1,emp.getSalary());
		ps1.setInt(2,uid);
		int updation2=ps1.executeUpdate();
		if(updation2==1)
		{
				System.out.println(" Salary updated successfully");
		}
		else
		{
			throw new EmployeeNotFoundException(uid);
		}
	
	
	break;
case 3:
	System.out.println("Enter Designation:");
	String updesg=sc.nextLine();
	emp.setDesg(updesg);
		PreparedStatement ps2=con.prepareStatement("update employee1 set desg=? where eid=?");
		ps2.setString(1,emp.getDesg());
		ps2.setInt(2,uid);
		int updation3=ps2.executeUpdate();
		if(updation3==1)
		{
				System.out.println(" Designation updated successfully");
		}
		else
		{
			throw new EmployeeNotFoundException(uid);
		}
	
	
	break;
}
}
catch(SQLException e)
{
	System.out.println(e.getMessage());
}
catch(Exception e)
{
	System.out.println(e);
}
}
public static void delete(Connection con)throws Exception
{
	System.out.println("Enter the Employee id to delete");
	int did=sc.nextInt();
	emp.setEid(did);
	try
	{
		PreparedStatement ps=con.prepareStatement("delete from employee1 where eid=?");
		ps.setInt(1,emp.getEid());
		int del=ps.executeUpdate();
		if(del==1)
		{
			System.out.println("Employee details deleted successfully");
		}
		else
		{
		throw new EmployeeNotFoundException(did);	
		}
	}
	catch(SQLException e)
	{
	System.out.println(e.getMessage());	
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
}
}
