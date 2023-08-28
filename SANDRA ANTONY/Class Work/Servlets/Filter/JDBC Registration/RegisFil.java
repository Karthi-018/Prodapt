package filterRegis;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisFil extends HttpFilter 
{
	Connection con=null;
	public void init()
	{
		ServletContext sc = getServletContext();
		String driverClass=(String)sc.getInitParameter("dClass");
		String url=(String)sc.getInitParameter("url");
		String username=(String)sc.getInitParameter("userName");
		String password=(String)sc.getInitParameter("password");
		try {
			Class.forName(driverClass);
			con = DriverManager.getConnection(url,username,password);
			System.out.println("connection success");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain chain ) throws IOException, ServletException 
	{
		String password=req.getParameter("password");
		String firstName=req.getParameter("fName");
		try
		{
			PreparedStatement ps = con.prepareStatement("select fname,password from employee where fname=?");
			ps.setString(1,req.getParameter("fName"));
			ResultSet rs = ps.executeQuery();
			if(password.equals(rs.getString(2)))
			{
//				res.getWriter().println("Employee Exists");	
//				RequestDispatcher rd= req.getRequestDispatcher("/myServlet");            //redirecting it to next servlet
//				rd.forward(req, res);
				
				chain.doFilter(req, res);
			}
			else
			{
				RequestDispatcher rd= req.getRequestDispatcher("myServlet.html");            //redirecting it to Square servlet
				rd.include(req, res);
			
			}
		
			
			
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
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
}
