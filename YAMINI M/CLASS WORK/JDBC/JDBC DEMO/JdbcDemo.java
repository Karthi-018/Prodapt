package edu.prodapt.demos;
import java.util.*;
import java.sql.*;


public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded Successfully");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
				System.out.println("Connection Success");
				Statement stmt = con.createStatement();
				/*int temp = stmt.executeUpdate("insert into student values("+102+",'XYZ',"+98+",'IT')");
				System.out.println("Student Inserted Successfully");
				ResultSet rs = stmt.executeQuery("select * from student");
				System.out.println("SID \t NAME \t MARKS");
				System.out.println("------------------------------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				}
		}*/
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Student ID:");
				int StudentID = sc.nextInt();
				System.out.println("Enter Student NAME:");
				String StudentName = sc.next();
				System.out.println("Enter Student MARKS:");
				int StudentMarks = sc.nextInt();
				System.out.println("Enter Student DEPARTMENT:");
				String StudentDepartment = sc.next();
				
				int temp = stmt.executeUpdate("insert into student values("+StudentID+",'"+StudentName+"',"+StudentMarks+",'"+StudentDepartment+"')");
		}
				
				
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}

	}

}
