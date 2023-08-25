package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	Connection con=null;
	public void init()
	{
		ServletContext context = getServletContext();
		String className=context.getInitParameter("dClass");
		String url=context.getInitParameter("url");
		String uName=context.getInitParameter("userName");
		String pass=context.getInitParameter("password");
			try {
				Class.forName(className);
				con=DriverManager.getConnection(url,uName,pass);
				System.out.println("success");
			} 
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String uname1=req.getParameter("uname");
		String pass1=req.getParameter("pass");
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from employees where FName=? and password=?;");
			ps.setString(1,uname1);
			ps.setString(2,pass1);
			ResultSet rs=ps.executeQuery();
			PrintWriter pr=res.getWriter();
			if(rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("/login.html");
				rd.forward(req, res);
			}
			else
			{
				res.setContentType("text/html");
				pr.println("<center>Invalid uname or password try again...</center>");
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
				
			}
}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void destroy()
	{
		try {
			con.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}

