package edu.prodapt.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.Scanner;

public class PreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded Successfully");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
				System.out.println("Connection Success");

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Student ID:");
				int StudentID = sc.nextInt();
				System.out.println("Enter Student NAME:");
				String StudentName = sc.next();
				System.out.println("Enter Student MARKS:");
				int StudentMarks = sc.nextInt();
				System.out.println("Enter Student DEPARTMENT:");
				String StudentDepartment = sc.next();
				
				String query = "insert into student values(?,?,?,?)";
			    PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, StudentID);
				ps.setString(2,StudentName);
				ps.setInt(3,StudentMarks);
				ps.setString(4,StudentDepartment);
				
				ps.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}

	}

}
