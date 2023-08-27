package com.student;

import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class StudentServlet extends HttpServlet {
	Connection con=null;
	//It can call only once if we use this no need to change jdbc connection in every class file 
	public void init()
	{
		ServletContext context=getServletContext();
	String driverClass=context.getInitParameter("dClass");
	String url_name=context.getInitParameter("url");
	String userName=context.getInitParameter("uname");
	String pWord=context.getInitParameter("pswd");
	try
	{
		Class.forName(driverClass);
		con=DriverManager.getConnection(url_name,userName,pWord);
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws  IOException
{
	PrintWriter p=res.getWriter();
	p.println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"ISO-8859-1\">\r\n"
			+ "<title>Insert title here</title>\r\n"
			+ "</head>\r\n"
			+ "<body bgcolor=\"	#7FFFD4\">\r\n"
			+ "	\r\n"
			+ "<center>\r\n"
			+ "	<h1>Welcome to Employee Mangement System</h1>\r\n"
			+ "	<form action=\"./reg\" method=\"post\">\r\n"
			+ "		<table>\r\n"
			+ "			<tr>\r\n"
			+ "				<td><label>First Name:</label></td>\r\n"
			+ "				<td><input type=\"text\" name=\"fname\" placeholder=\"enter first name\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			<tr>\r\n"
			+ "				<td><label>Last Name:</label></td>\r\n"
			+ "				<td><input type=\"text\" name=\"lname\" placeholder=\"enter last name\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			<tr>\r\n"
			+ "				<td><label>Email :</label></td>\r\n"
			+ "				<td><input type=\"email\" name=\"email\" placeholder=\"enter email\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			<tr>\r\n"
			+ "				<td><label>Phone Number:</label></td>\r\n"
			+ "				<td><input type=\"number\" name=\"phone\" placeholder=\"enter phone no\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			<tr>\r\n"
			+ "				<td><label>password:</label></td>\r\n"
			+ "				<td><input type=\"password\" name=\"pass\" placeholder=\"enter your password\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			<tr>\r\n"
			+ "				\r\n"
			+ "				<td ><input type=\"submit\" value=\"Register\"/></td>\r\n"
			+ "				<td ><input type=\"reset\" value=\"Clear\"/></td>\r\n"
			+ "			</tr>\r\n"
			+ "			\r\n"
			+ "		</table>\r\n"
			+ "	</form>\r\n"
			+ "</center>\r\n"
			+ "</body>\r\n"
			+ "</html>");
try {
	//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	PreparedStatement ps=con.prepareStatement("insert into employees values(?,?,?,?,?);");
	ps.setString(1, req.getParameter("fname"));
	ps.setString(2, req.getParameter("lname"));
	ps.setString(3, req.getParameter("email"));
	ps.setNString(4, req.getParameter("phone"));
	ps.setString(5, req.getParameter("pass"));
	int temp=ps.executeUpdate();
	
	if(temp>0)
	{
		p.println("<center><h1>Employee Registration successful</h1><center>");
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.forward(req, res);
	}
	else
	{
		p.println("Unsuccessful registration");
		RequestDispatcher rd=req.getRequestDispatcher("register.html");
		rd.include(req, res);
		
	}
	
}
catch(Exception e)
{
System.out.println(e.getMessage())	;
}
}
public void destroy()
{
	try {
		con.close();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}

}

