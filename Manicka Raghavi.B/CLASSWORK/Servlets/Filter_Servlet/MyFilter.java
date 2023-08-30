
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpFilter;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 public class MyFilter extends HttpFilter 
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
    protected void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain chain) throws IOException, ServletException 
    {
    	PreparedStatement ps;
    	try 
		{
			ps = con.prepareStatement("select fname,password from empreg where fname=? and password=?");
			ps.setString(1,req.getParameter("uname")); 
			ps.setString(2,req.getParameter("pwd"));
			ResultSet rs=ps.executeQuery(); 
			
			if(rs.next())
			{
                
				chain.doFilter(req, res);
			}
			else
			{
                RequestDispatcher rd=req.getRequestDispatcher("Login.html"); 
		    	
				rd.forward(req, res); 
			}
				
		} 
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        

    }
    
    public void destroy() 
	{
	
		try 
		{
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 

}
