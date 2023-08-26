package EMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet 
{
	Connection con = null;
	
	public void init(ServletConfig sc)
	{
		String driverclass = (String)sc.getInitParameter("dclass");

		String url = (String)sc.getInitParameter("url");
		
		String username = (String)sc.getInitParameter("username");

		String password = (String)sc.getInitParameter("password");
		
		System.out.println(driverclass+" "+url+" "+username+" "+password);
		try
		{
			Class.forName(driverclass);
			con = DriverManager.getConnection(url,username,password);
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
			PreparedStatement ps = con.prepareStatement("select fname,pwd from emp where fname=? and pwd=?");
			/*
			 * String name= req.getParameter("fname"); String
			 * passwrd=req.getParameter("pwd"); ps.setString(1,name); ps.setString(2,
			 * passwrd);
			 */
			ps.setString(1, req.getParameter("fname"));
			ps.setString(2, req.getParameter("pwd"));
			ResultSet rs =ps.executeQuery();
		
			if(rs.next())
			{   
				
				res.getWriter().println("<html><center><h1>logged in Succesfully....</h1></center></html>"); 
					
			}	
		
			else 
			{
				res.getWriter().println("<html><center><h1>login not Success....</h1></center></html>");
				
			}
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
