package app3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serve extends HttpServlet
{
	
	Connection con;

	public void loginD(HttpServletRequest req, HttpServletResponse res) throws IOException, ClassNotFoundException, SQLException
	{
		String query="SELECT `EMAIL ID`, PASSWORD FROM EMPLOYEES WHERE `EMAIL ID`=? AND PASSWORD=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, req.getParameter("uname"));
		ps.setString(2, req.getParameter("password"));
		ResultSet rs=ps.executeQuery();
		if(rs.next()) 
		{
				//ps.setString(2, req.getParameter("password"));
				//ResultSet rs1=ps.executeQuery();
			res.setContentType("text/html");
			res.getWriter().println("<center><h3>Login Successful</h3></center>");
		}
				
		else
		{
			res.setContentType("text/html");
			res.getWriter().println("<center><h3>Your Username Or Password Is Incorrect</h3></center>");
		}
			
	}
		//ps.setString(2, req.getParameter("password"));
		//ps.executeUpdate();
		//res.setContentType("text/html");
		//res.getWriter().println("<center><h3></h3></center>");
		

	
	public void init()
	{
		ServletContext context= getServletContext();
		String driver = context.getInitParameter("dclass");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("uname");
		String pass = context.getInitParameter("pword");
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pass);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	{
		try
		{
			loginD(req,res);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
