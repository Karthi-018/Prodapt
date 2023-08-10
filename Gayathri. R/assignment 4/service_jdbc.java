package edu.prodapt.jdbc;
import java.sql.*;
import java.util.*;


public class service_jdbc {
	static Scanner s=new Scanner(System.in);
	public static void main(String a[])
	{
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded success");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		System.out.println("connection success");
		userChoice();	
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	static void userChoice()
    {
        System.out.println("Enter your choice \n1. Create New Employee\n2.Update Employee Details\n3.Display All Employee Details\n 4.Delete Employee Detail\n 5.Exit");
       
        int choice = s.nextInt();
        choiceloop(choice);
    }
	
	static void choiceloop(int choice)
	{
		try
		{
		switch(choice)
		{
		case 1:System.out.println("creating employee details");
		int id=s.nextInt();
		double sal=s.nextDouble();
		String dep=s.next();
		String name=s.next();
		pojo_jdbc obj=new pojo_jdbc();
		pojo_jdbc o=new pojo_jdbc(id,name,dep,sal);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		//System.out.println("connection success");
		PreparedStatement ps=con.prepareStatement("insert empdetails values(?,?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,dep);
        ps.setDouble(4,sal);
		ps.executeUpdate();
		System.out.println("inserted successfully");
		userChoice();	
		break;
		case 3:
			System.out.println("displaying empdetails");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
			PreparedStatement p=c.prepareStatement("select * from empdetails ;");
			ResultSet rs=p.executeQuery();
			System.out.println(rs);
			userChoice();
			break;
		case 2:
			System.out.println("enter employee name and id to update name");
			String uname=s.next();
			int uid=s.nextInt();
			Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
			PreparedStatement p2 = c2.prepareStatement("UPDATE empdetails SET NAME = ? WHERE ID = ?");
			p2.setString(1, uname);
			p2.setInt(2, uid);
			p2.executeUpdate();
			System.out.println("Employee details updated successfully");
			userChoice();
			break;
		case 4:
			System.out.println("enter employee id to delete");
			int did=s.nextInt();
			//System.out.println(did);
			Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
			PreparedStatement p3 = c3.prepareStatement("DELETE from empdetails WHERE ID = ?;");
			p3.setInt(1, did);
			p3.executeUpdate();
			System.out.println("deleted successfully");
		
			userChoice();
			break;
		case 5:
			break;
			}
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
