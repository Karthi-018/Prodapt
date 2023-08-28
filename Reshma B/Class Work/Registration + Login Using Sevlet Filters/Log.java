package FiltDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Log extends HttpServlet
{
	Connection con;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
	}
		//ps.setString(2, req.getParameter("password"));
		//ps.executeUpdate();
		//res.setContentType("text/html");
		//res.getWriter().println("<center><h3></h3></center>");
		

	
	
	
	
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

}
