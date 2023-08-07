package edu.prodapt.demos;

import java.sql.*;
import java.util.Scanner;
public class JdbcDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		System.out.println("Connected");
		Statement st=con.createStatement();
		int a=s.nextInt();
		String b=s.next();
		int c=s.nextInt();
		//int temp=st.executeUpdate("insert into student values("+162+",'xytg',"+38+")");
		//System.out.println("COmpleted");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setInt(3, c);
		ps.executeUpdate();
		int z=s.nextInt();
		ResultSet rs=st.executeQuery("select * from student where mark>"+z);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt("mark"));
		}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}

}
