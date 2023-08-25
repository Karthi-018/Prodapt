package registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet 

{  
	Connection con=null;
   
	public void init(ServletConfig sc)
	{
		String driverClass=sc.getInitParameter("dClass"); 
		String url=sc.getInitParameter("url");
		String username=sc.getInitParameter("username");
		String password=sc.getInitParameter("password"); 
		
		System.out.print(driverClass+" "+url+" "+username+" "+password);


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
	
	public void doPost(HttpServletRequest req,HttpServletResponse rep) throws IOException 
    {
       try 
       {
	  	   PreparedStatement ps=con.prepareStatement("insert into empreg values(?,?,?,?,?)");
	       ps.setString(1,req.getParameter("fname")); 
		   ps.setString(2,req.getParameter("lname"));  
		   ps.setString(3,req.getParameter("email")); 
		   ps.setString(4,req.getParameter("mob")); 
		   ps.setString(5,req.getParameter("pwd"));   
		   ps.executeUpdate(); 
		   rep.getWriter().println("<h1>EMPLOYEE REGISTRATION SUCCESFULL</h1>");
	   } 
       catch (SQLException e) 
       {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
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
			e.printStackTrace();
		}
	}
}
