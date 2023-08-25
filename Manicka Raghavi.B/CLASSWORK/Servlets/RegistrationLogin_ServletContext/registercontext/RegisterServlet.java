package registercontext;

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

public class RegisterServlet extends HttpServlet 
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
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	try 
	{
		
		PreparedStatement ps=con.prepareStatement("insert into empreg values(?,?,?,?,?)"); 
		ps.setString(1,req.getParameter("fname")); 
		ps.setString(2,req.getParameter("lname"));  
		ps.setString(3,req.getParameter("email")); 
		ps.setString(4,req.getParameter("mob")); 
		ps.setString(5,req.getParameter("pwd"));   
		int temp=ps.executeUpdate(); 
		if(temp>0) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("/Login.html");
			rd.forward(req, res);
		} 
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/Index.html"); 
			rd.include(req, res);
		}
	} 
	catch (SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
