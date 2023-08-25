package app3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class form extends HttpServlet
{
	Connection con;

	public void details(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException, SQLException, ServletException, NullPointerException
	{
		/*PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<form action=\"reg\" method=\"post\">\r\n"
				+ "<center>\r\n"
				+ "<h1>Enter your details.</h1>\r\n"
				+ "<table>\r\n"
				+ "<tr>\r\n"
				+ "<td><label> First Name </label> </td> \r\n"
				+ "<td><input type=\"text\" name=\"fname\" value=\"\" placeholder=\"Enter your first name.\"/> </td>\r\n"
				+ "</tr>\r\n"
				+ "<tr>\r\n"
				+ "<td><label> Last Name </label> </td>\r\n"
				+ "<td><input type=\"text\" name=\"lname\" value=\"\" placeholder=\"Enter your last name.\"/> </td>\r\n"
				+ "</tr>\r\n"
				+ "<tr>\r\n"
				+ "<td><label> Email ID </label> </td> \r\n"
				+ "<td><input type=\"email\" name=\"mail\" value=\"\" placeholder=\"Enter your email.\"/> </td>\r\n"
				+ "</tr>\r\n"
				+ "<tr>\r\n"
				+ "<td><label> Password </label></td>\r\n"
				+ "<td><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Enter your password.\"/> </td>\r\n"
				+ "</tr>\r\n"
				+ "</table>\r\n"
				+ "</center>\r\n"
				+ "<center>\r\n"
				+ "<table>\r\n"
				+ "<tr>\r\n"
				+ "<td><input type=\"submit\" value=\"Submit\"></td>\r\n"
				+ "<td><input type=\"reset\" value=\"Reset\"> </td>\r\n"
				+ "</tr>\r\n"
				+ "</table>\r\n"
				+ "</center>\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>"); */
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root"); 
		String query="insert into employees values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, req.getParameter("fname"));
		ps.setString(2, req.getParameter("lname"));
		ps.setString(3, req.getParameter("mail"));
		ps.setString(4, req.getParameter("password"));
		ps.executeUpdate();
		
		res.setContentType("text/html");
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("servletconfig.html");
		rd.forward(req, res);
		//res.getWriter().println("<center><h3>Registration Successful</h3></center>");
	}
	
	public void init()
	{	
		ServletContext sc = getServletContext();
		String Driver = (String)sc.getInitParameter("dclass");
		String url = (String)sc.getInitParameter("url");
		String user = (String)sc.getInitParameter("uname");
		String pass = (String)sc.getInitParameter("pword");
		
		try
		{
			Class.forName(Driver);
			con = DriverManager.getConnection(url,user,pass);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void destroy() 
	{
		try {
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException //throws IOException
	{
		try 
		{
			details(req,res);
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
