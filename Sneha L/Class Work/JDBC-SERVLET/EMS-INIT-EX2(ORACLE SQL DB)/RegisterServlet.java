package edu.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	Connection con=null;
	
public void init(ServletConfig sc) {
	String driverClass=(String)sc.getInitParameter("dClass");
	String url=(String)sc.getInitParameter("url");
	String userName=(String)sc.getInitParameter("userName");
	String password=(String)sc.getInitParameter("password");
	try {
		Class.forName(driverClass);
		con = DriverManager.getConnection(url,password,userName);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
{

	try {

		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String passwd=req.getParameter("pswd");
		String ph=req.getParameter("mobile");
	
		PreparedStatement ps=con.prepareStatement("INSERT INTO employeesdetail values(?,?,?,?,?)");
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setString(3, email);
		ps.setString(4,ph);
		ps.setString(5,passwd);
		ps.executeUpdate();
		PrintWriter out=res.getWriter();
		out.println("<h1> Registration Done Successfully");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}


