package logincontext;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logcontext")
public class LoginServlet extends HttpServlet 
{   Connection con=null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException 
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

	/**
	 * @see Servlet#destroy()
	 */
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
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
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
		      res.getWriter().println("<h1>EMPLOYEE LOGIN SUCCESSFUL</h1>"); 
		    } 
		    else
		    {   
		    	//System.out.println("LOGIN UNSUCCESSFUL");
		    	res.getWriter().println("<center>LOGIN UNSUCCESSFUL");
		    	res.setContentType("text/html");
		    	
		    	
		    	RequestDispatcher rd=req.getRequestDispatcher("Login.html"); 
		    	
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
