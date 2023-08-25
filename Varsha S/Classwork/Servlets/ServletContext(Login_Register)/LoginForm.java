package context.edu;

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

public class LoginForm extends HttpServlet
{
	Connection con = null;
	ServletContext context;
	
    public void init()
    {
    	try {
    		context = getServletContext();
    	Class.forName(context.getInitParameter("className"));
		
			con = DriverManager.getConnection(context.getInitParameter("URL"),context.getInitParameter("username"),context.getInitParameter("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


    String em = req.getParameter("email");
	String p = req.getParameter("pwd");
	try {
		
		PreparedStatement ps = con.prepareStatement("select email,pswrd from ems_table where email=? ");
		ps.setString(1, em);
		
		ResultSet rs = ps.executeQuery();
	    RequestDispatcher rd = null;
	
	
	while(rs.next()) {
		if(p.equals(rs.getString(2)))
		{
		res.getWriter().print("<html>");
		res.getWriter().print("<body>");
		res.getWriter().print("<center>");
		res.getWriter().print("<h2><i>Login successful</i></h2>");
		res.getWriter().print("</center>");
		res.getWriter().print("</body>");
		res.getWriter().print("</html>");
        rd.forward(req,  res);
        break;
		}
		else
		{
			
			
			rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
	}
	} 
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
}
        
        
        
        
        
        
        
        
        
        