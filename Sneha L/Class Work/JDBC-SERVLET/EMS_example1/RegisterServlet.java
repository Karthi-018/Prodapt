package edu.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
{

	try {

		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String passwd=req.getParameter("pswd");
		String ph=req.getParameter("mobile");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement ps=con.prepareStatement("INSERT INTO employees1 values(?,?,?,?,?)");
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setString(3, email);
		ps.setString(4,ph);
		ps.setString(5,passwd);
		ps.executeUpdate();
		PrintWriter out=res.getWriter();
		out.println("<h1> Registration Done Successfully");
	}
	catch(ClassNotFoundException e) { 
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}


