package edu.prodapt.demos;
import java.sql.*;
import java.util.*;
public class sjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Loaded Successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shifi","root","root");
			//System.out.println("Connection success");
			//Statement stmt = con.createStatement();
			
			/*System.out.println("SID Name Marks");
			System.out.println("................");
			System.out.println("Enter marks");
			int mark=sc.nextInt();
			*/
			PreparedStatement ps = con.prepareStatement("select * from student WHERE marks>?");
			System.out.println("Enter marks");
			int mark=sc.nextInt(); 
			ps.setInt(1, mark);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("marks"));
			}
			
			
			//System.out.println("Enter id");
			/*
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter marks");
			int marks=sc.nextInt();*/
			//PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			//ps.setInt(1, id);
			//ps.setString(2,name);
			//ps.setInt(3, marks);
		
			 // temp = ps.executeUpdate();
			//int temp = stmt.executeUpdate("insert into student values("+id+",'"+name+"',+"+marks+")");
			//System.out.println("Inserted success");
			
			
		} 
		
		catch (ClassNotFoundException|SQLException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//catch (Exception e)
		//{
			// TODO Auto-generated catch block
			//System.out.println(e);
		//}
		
	}
}
