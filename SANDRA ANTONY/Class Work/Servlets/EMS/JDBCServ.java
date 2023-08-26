package edu;

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

public class JDBCServ extends HttpServlet
{
	Connection con=null;
	public void init(ServletConfig sc)
	{
		String driverClass=(String)sc.getInitParameter("dClass");
		String url=(String)sc.getInitParameter("url");
		String username=(String)sc.getInitParameter("userName");
		String password=(String)sc.getInitParameter("password");
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) 
	{
		try 
		{
			
			
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setString(1,req.getParameter("fName"));
			ps.setString(2,req.getParameter("lName"));
			ps.setString(3,req.getParameter("email"));
			ps.setString(4,req.getParameter("phone"));
			ps.setString(5,req.getParameter("password"));
			ps.executeUpdate();
			
			res.getWriter().println("Employee Registration Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void destroy()
	{
		try {
			con.close();
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
}
