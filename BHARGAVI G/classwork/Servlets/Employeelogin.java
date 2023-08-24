package ems;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	 
	public class Employeelogin  extends HttpServlet {

	Connection con = null;

	public void init(ServletConfig sc)

	{

	String driverClass = (String)sc.getInitParameter("dClass");

	String url = (String)sc.getInitParameter("url");

	String userName = (String)sc.getInitParameter("username");

	String password = (String)sc.getInitParameter("pw");

	try

	{

	Class.forName(driverClass);

	con = DriverManager.getConnection(url,userName,password);

	}

	catch(Exception e)

	{

	System.out.println(e);

	}

	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)

	{

	try

	{
	            PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?,?)");

	            ps.setString(1, req.getParameter("fname"));

	            ps.setString(2, req.getParameter("lname"));

	            ps.setString(3, req.getParameter("email"));

	            ps.setString(4, req.getParameter("Phone"));

	            ps.setString(5, req.getParameter("PW"));

	            ps.executeUpdate();
	            res.getWriter().println("<h1>Employee Registration Successfull</h1>");

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
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
	 
	
	

	

