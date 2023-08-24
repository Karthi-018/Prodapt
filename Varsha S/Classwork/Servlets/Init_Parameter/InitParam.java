package initparam.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam extends HttpServlet
{
	Connection con = null;
	public void init(ServletConfig sc)
	{
		String driverclass = (String) sc.getInitParameter("className");
		String url = (String) sc.getInitParameter("URL");
		String username = (String) sc.getInitParameter("userName");
		String password = (String) sc.getInitParameter("password");
		
		try 
		{
			Class.forName(driverclass);
			con = DriverManager.getConnection(url, username, password);
		} 
		
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void doPost(HttpServletRequest req, HttpServletResponse res) 
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
				PreparedStatement ps = c.prepareStatement("insert into ems_table values (?, ?, ?, ?, ?)");
				ps.setString(1,req.getParameter("fname"));
				ps.setString(2,req.getParameter("lname"));
				ps.setString(3,req.getParameter("email"));
				ps.setString(4,req.getParameter("phone"));
				ps.setString(5,req.getParameter("pswrd"));
				ps.executeUpdate();
				res.getWriter().println("Success!! Employee Details Created!!");
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		
	}

		public void destroy()
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
