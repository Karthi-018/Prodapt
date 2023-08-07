package edu.prodapt.demos;
import java.sql.*;
import java.util.Scanner;
import java.util.Scanner;
public class JdbcDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try
		{
		String url="jdbc:mysql://localhost:3306/prodapt";
		String uname="root";
		String pass="root";
		int sid=s.nextInt();
		String sname=s.next();
		int marks=s.nextInt();
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("success");
		Connection con = DriverManager.getConnection(url,uname,pass);
		String query="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, sid);
		ps.setString(2, sname);
		ps.setInt(3, marks);
		ps.executeUpdate();
		//int temp = stmt.executeUpdate("insert into student values(" +sid+",'"+sname+"',"+marks+")");
		
		ResultSet rs =ps.executeQuery("select * from student where marks>88");
		System.out.println("-----------------------");
		System.out.println("SID \t Sname \t Marks");
		System.out.println("-----------------------");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+ "\t"+ rs.getString(2)+ "\t"+rs.getInt(3));
			System.out.println(" ");
		}
		
		}
		
		catch(ClassNotFoundException e)
		{
			System.out.print(e);
		
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}

}
