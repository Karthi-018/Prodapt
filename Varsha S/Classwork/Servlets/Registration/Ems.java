package ems.edu;

import java.io.IOException;
import java.sql.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ems extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
			PreparedStatement ps = c.prepareStatement("insert into ems_table values (?, ?, ?, ?, ?)");
			ps.setString(1,req.getParameter("fname"));
			ps.setString(2,req.getParameter("lname"));
			ps.setString(3,req.getParameter("email"));
			ps.setString(4,req.getParameter("phone"));
			ps.setString(5,req.getParameter("pswrd"));
			ps.executeUpdate();
			res.getWriter().println("Success!! Employee Details Created!!");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
}
