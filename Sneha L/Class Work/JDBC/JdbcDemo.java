package edu.prodapt.demos;
import java.sql.*;
import java.util.*;
public class JdbcDemo {
	public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		
	/*	Statement stmt=con.createStatement();
		int temp=stmt.executeUpdate("insert into student values("+102+",'XYZ',"+87+")");
		System.out.println("Student inserted Success");
		ResultSet rs=stmt.executeQuery("select * from student where sname='XYZ'");
		System.out.println("SID Name|Marks");
		System.out.println("-------------------------------");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("smarks"));
		}
	}*/
		
		
	/*
	 * System.out.println("Enter Id"); int sid=sc.nextInt();
	 * System.out.println("Enter Name"); String sname=sc.next();
	 * System.out.println("Enter Marks"); int smarks=sc.nextInt();
	 int temp=stmt.executeUpdate("insert into student values("+sid+",'"+sname+"',"+smarks+")");
	//----------------------PreparedStatement insert---------------------
	* PreparedStatement
	* ps=con.prepareStatement("insert into student values(?,?,?)"); ps.setInt(1,* sid); 
	* ps.setString(2, sname); ps.setInt(3, smarks); 
	* int temp=ps.executeUpdate();
	* PreparedStatement ps=con.prepareStatement("delete from student where sid=?");
	*ps.setInt(1, n);
	*int temp=ps.executeUpdate();
	*/
		
		int n =sc.nextInt();
		PreparedStatement ps=con.prepareStatement("select * from student where smarks>=?");
		ps.setInt(1,n);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("smarks"));
		}
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			}
		
		}
