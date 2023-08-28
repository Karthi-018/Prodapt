package FiltDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class regis extends HttpServlet
{
	Connection con;

	public void details(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException, SQLException, ServletException, NullPointerException
	{
		String query="insert into employees values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, req.getParameter("fname"));
		ps.setString(2, req.getParameter("lname"));
		ps.setString(3, req.getParameter("mail"));
		ps.setString(4, req.getParameter("password"));
		ps.executeUpdate();
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