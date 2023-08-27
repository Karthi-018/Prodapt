package com.student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
public class LoginServlet extends HttpServlet {
	Connection con=null;
public void init()
{
	
	ServletContext context=getServletContext();
	String driverClass=context.getInitParameter("dClass");
	String url_name=context.getInitParameter("url");
	String userName=context.getInitParameter("uname");
	String pword=context.getInitParameter("pswd");
	try
	{
	Class.forName(driverClass);
	con=DriverManager.getConnection(url_name,userName,pword);
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	PrintWriter pt=res.getWriter();
try {
	PreparedStatement ps=con.prepareStatement("select * from employees where email=? and password=?;");
	String mail = req.getParameter("email1");
	String pass = req.getParameter("pass1");
	ps.setString(1,mail);
	ps.setString(2, pass);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		String f_name=rs.getString("fname");
		String l_name=rs.getString("lname");
		pt.println("<html>");
		pt.println("<body>");
		pt.println("<center><h3 style=\"color:Green;\">Login Successfull </h3></center><br>");
		pt.println("<center><h3>Welcome "+f_name+" "+l_name+"</h3></center>");
		pt.println("</html>");
		pt.println("</body>");
	}
	else {
		//RequestDispatcher rd=req.getRequestDispatcher("register.html");
		//rd.include(req, res);
		pt.println("<html>");
		pt.println("<body>");
		pt.println("<center><h4 style=\"color:Tomato;\">Invalid email or password</h4></center>");
        pt.println("<!DOCTYPE html>\r\n"
		+ "<html>\r\n"
		+ "<head>\r\n"
		+ "<meta charset=\"ISO-8859-1\">\r\n"
		+ "<title>Insert title here</title>\r\n"
		+ "</head>\r\n"
		+ "<body>\r\n"
		+ "<center>\r\n"
		+ "	<h1>Login</h1>\r\n"
		+ "	<form action=\"./login\" method=\"post\">\r\n"
		+ "	<table>\r\n"
		+ "		<tr>\r\n"
		+ "			<td><label>Last Name</label></td>\r\n"
		+ "			<td><input type=\"text\" name=\"lname\" placeholder=\"enter last name\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "	    <tr>\r\n"
		+ "			<td><label>E-mail:</label></td>\r\n"
		+ "			<td><input type=\"email\" name=\"email\" placeholder=\"enter email\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "		<tr>\r\n"
		+ "			<td><label>pass word:</label></td>\r\n"
		+ "			<td><input type=\"password\" name=\"pass\" placeholder=\"enter password\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "		<tr>\r\n"
		+ "			\r\n"
		+ "			<td><input type=\"submit\" value=\"login\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "	</table>	\r\n"
		+ "	</form>\r\n"
		+ "</center>\r\n"
		+ "</body>\r\n"
		+ "</html>");
        pt.println("</html>");
		pt.println("</body>");
	}
	/*while(rs.next())
	{
		String pass=rs.getString("password");
		String name=rs.getString("lname");
	if(pass.equals(req.getParameter("pass"))&&name.equals(req.getParameter("lname")))
	{
		pt.println("<html>");
		pt.println("<body>");
		pt.println("<center><h3 style=\"color:Green;\">Login Successfull</h3></center><br>");
		pt.println("<center><h3>Welcome "+name+"</h3></center>");
		pt.println("</html>");
		pt.println("</body>");
	}
	else
	{
		pt.println("<html>");
		pt.println("<body>");
		pt.println("<center><h4 style=\"color:Tomato;\">Invalid UserName or password</h4></center>");
        pt.println("<!DOCTYPE html>\r\n"
		+ "<html>\r\n"
		+ "<head>\r\n"
		+ "<meta charset=\"ISO-8859-1\">\r\n"
		+ "<title>Insert title here</title>\r\n"
		+ "</head>\r\n"
		+ "<body>\r\n"
		+ "<center>\r\n"
		+ "	<h1>Login</h1>\r\n"
		+ "	<form action=\"./login\" method=\"post\">\r\n"
		+ "	<table>\r\n"
		+ "		<tr>\r\n"
		+ "			<td><label>Last Name</label></td>\r\n"
		+ "			<td><input type=\"text\" name=\"lname\" placeholder=\"enter last name\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "	    <tr>\r\n"
		+ "			<td><label>E-mail:</label></td>\r\n"
		+ "			<td><input type=\"email\" name=\"email\" placeholder=\"enter email\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "		<tr>\r\n"
		+ "			<td><label>pass word:</label></td>\r\n"
		+ "			<td><input type=\"password\" name=\"pass\" placeholder=\"enter password\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "		<tr>\r\n"
		+ "			\r\n"
		+ "			<td><input type=\"submit\" value=\"login\"/></td>\r\n"
		+ "		</tr>\r\n"
		+ "	</table>	\r\n"
		+ "	</form>\r\n"
		+ "</center>\r\n"
		+ "</body>\r\n"
		+ "</html>");
        pt.println("</html>");
		pt.println("</body>");
	}
	}*/
}
catch(Exception e)
{
	System.out.println(e.getMessage());
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
