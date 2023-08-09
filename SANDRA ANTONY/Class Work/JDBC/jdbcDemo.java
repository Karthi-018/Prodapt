package edu.prodapt.demos;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
//		System.out.println("Enter id");
//		int sid = s.nextInt();
//		System.out.println("Enter name");
//		String sname = s.next();
		System.out.println("Enter marks");
		int marks=s.nextInt();
		
		
		
		
		
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded success!");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("Connection success!");
			
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
//			ps.setInt(1,sid);
//			ps.setString(2,sname);
			ps.setInt(3,marks);
			int temp = ps.executeUpdate();
			
			//Statement stat=con.createStatement();
			
			
			//ps.executeUpdate("insert into student values("+sid+",'"+sname+"',"+marks+")");
			
			System.out.println("insertion completed");
			
			ResultSet r=ps.executeQuery("select * from student where marks>?");
			while(r.next())
			{
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt("marks"));
			}
	
			
			
			//DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		

	}

}
