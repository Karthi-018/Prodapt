package ServletContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	Connection con=null;
	
	public void init()
	{
		ServletContext context = getServletContext();
		String driverclass = context.getInitParameter("driverclass");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		
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
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		try
    	{
    		PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?,?)");
    		ps.setString(1,  req.getParameter("fname"));
    		ps.setString(2,  req.getParameter("lname"));
    		ps.setString(3,  req.getParameter("email"));
    		ps.setString(4,  req.getParameter("mobile"));
    		ps.setString(5,  req.getParameter("password"));
    		ps.executeUpdate();	
    		res.getWriter().println("<html><body><center><h1> Employee Registration Successful</h1></center></body></html>");
    		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
    		rd.forward(req, res);
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

