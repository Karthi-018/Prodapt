package ServletConfig;

import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SerConfig extends HttpServlet
{
	Connection con=null;
	
	public void init(ServletConfig sc)
	{
		String driverclass = (String)sc.getInitParameter("driverclass");
		String url = (String)sc.getInitParameter("url");
		String username = (String)sc.getInitParameter("username");
		String password = (String)sc.getInitParameter("password");
		try
		{
			Class.forName(driverclass);
    		Connection con = DriverManager.getConnection(url,username,password);      	
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
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prodapt","root","root");
    		PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?,?,?)");
    		ps.setString(1,  req.getParameter("fname"));
    		ps.setString(2,  req.getParameter("lname"));
    		ps.setString(3,  req.getParameter("email"));
    		ps.setString(4,  req.getParameter("mobile"));
    		ps.setString(5,  req.getParameter("password"));
    		ps.executeUpdate();
    		
    		res.getWriter().println("<html><body><center><h1> Employee Registration Successful</h1></center></body></html>");
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

