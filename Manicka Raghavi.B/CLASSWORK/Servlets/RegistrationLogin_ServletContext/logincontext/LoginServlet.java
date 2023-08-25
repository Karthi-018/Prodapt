package logincontext;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	Connection con=null;
	public void init()
	{   
		ServletContext sc=getServletContext();
		String driverClass=sc.getInitParameter("dClass"); 
		String url=sc.getInitParameter("url");
		String username=sc.getInitParameter("username");
		String password=sc.getInitParameter("password"); 
		try 
	    {
	       Class.forName(driverClass);
		   con=DriverManager.getConnection(url,username,password);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
		
	}  
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PreparedStatement ps;
		try 
		{
			ps = con.prepareStatement("select fname,password from empreg where fname=?");
			ps.setString(1,req.getParameter("uname")); 
			ResultSet rs=ps.executeQuery();   
			while(rs.next())
			{
				if(rs.getString(2).equals(req.getParameter("pwd")))
				{
					res.getWriter().println("<h1>EMPLOYEE LOGIN SUCCESSFUL</h1>");

				}
				else
				{
				  RequestDispatcher rd=req.getRequestDispatcher("Index.html"); 
				    	
				  rd.include(req, res); 
				  res.getWriter().println("LOGIN UNSUCCESSFUL"); 
				}
			}
		    
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
