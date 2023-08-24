package jdbc_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee_details extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver is Loaded");
		Connection con;

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_servlet","root","root"); 
		System.out.println("Connection Established");
		String fname,lname,email,phno,pwd;
		fname=req.getParameter("fname");
		lname=req.getParameter("lname");
		email=req.getParameter("email");
		phno=req.getParameter("phno");
		pwd=req.getParameter("pwd");
		PrintWriter out=res.getWriter();
		String query="insert into employee(first_name,last_name,email_id,phone_number,password) values(?,?,?,?,?)";
		PreparedStatement ps;
 
			ps = con.prepareStatement(query);
		
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setString(3,email);
		ps.setString(4,phno);
		ps.setString(5,pwd);
		ps.executeUpdate();
		System.out.println("Insertion Successful!!!");
		out.println("DATA INSERTED !!!");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
