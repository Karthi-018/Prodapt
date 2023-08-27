package EmployeeSystem;

import java.sql.*;
import java.io.PrintWriter;
import java.io.IOException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet
{

	    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	    {
	    	//To Display output in same page
	    	res.getWriter().println("<!DOCTYPE html>\r\n"
	    			+ "<html>\r\n"
	    			+ "<head>\r\n"
	    			+ "<meta charset=\"ISO-8859-1\">\r\n"
	    			+ "<title>EMS</title>\r\n"
	    			+ "</head>\r\n"
	    			+ "<body>\r\n"
	    			+ "<center>\r\n"
	    			+ "EMPLOYEE MANAGEMENT SYSTEM\r\n"
	    			+ "<br><br>\r\n"
	    			+ "<form action=\"./reg\" method=\"post\">\r\n"
	    			+ "<table>\r\n"
	    			+ "<tr>\r\n"
	    			+ "<td><label>FIRST NAME</label></td>\r\n"
	    			+ "<td><input type=\"text\" name=\"fname\" value=\"\" placeholder=\"Enter first name\"><BR></td>\r\n"
	    			+ "</tr>\r\n"
	    			+ "<tr>\r\n"
	    			+ "<td><label>LAST NAME</label></td>\r\n"
	    			+ "<td><input type=\"text\" name=\"lname\" value=\"\" placeholder=\"Enter last name\"><BR></td>\r\n"
	    			+ "</tr>\r\n"
	    			+ "<tr>\r\n"
	    			+ "<td><label>E-MAIL</label></td>\r\n"
	    			+ "<td><input type=\"text\" name=\"email\" value=\"\" placeholder=\"Enter Email ID\"><BR></td>\r\n"
	    			+ "</tr>\r\n"
	    			+ "<tr>\r\n"
	    			+ "<td><label>MOBILE NUMBER</label></td>\r\n"
	    			+ "<td><input type=\"text\" name=\"mobile\"  value=\"\"  placeholder=\"Enter Mobile Number\"><BR></td>\r\n"
	    			+ "</tr>\r\n"
	    			+ "<tr>\r\n"
	    			+ "<td><label>PASSWORD</label></td>\r\n"
	    			+ "<td><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Enter Password\"><BR></td>\r\n"
	    			+ "</tr>\r\n"
	    			+ "</table>\r\n"
	    			+ "<BR><br>\r\n"
	    			+ "<td colspan=\"2\" text:align=\"center\"></td>\r\n"
	    			+ "<input type=\"submit\" value=\"SUBMIT\">\r\n"
	    			+ "<input type=\"reset\" value=\"RESET\">\r\n"
	    			+ "</center>\r\n"
	    			+ "</form>\r\n"
	    			+ "</body>\r\n"
	    			+ "</html> "
	    			);
	    	try
	    	{
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prodapt","root","root");
	    		PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?,?,?)");
	    		ps.setString(1,  req.getParameter("fname"));
	    		ps.setString(2,  req.getParameter("lname"));
	    		ps.setString(3,  req.getParameter("email"));
	    		ps.setString(4,  req.getParameter("mobile"));
	    		ps.setString(5,  req.getParameter("password"));
	    		ps.executeUpdate();
	    		
	    		res.getWriter().println("<html><body><center><h1> Employee Registration Successful</h1></center></body></html>");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    }
}
