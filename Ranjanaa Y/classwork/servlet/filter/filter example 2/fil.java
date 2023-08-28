package filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class fil
 */
@WebFilter("/logServlet")
public class fil extends HttpFilter  {

	/**
	 * @see Filter#destroy()
	 */
	
	Connection con = null;
	public void init()
	{
		ServletContext context = getServletContext();
		
		String dclass = (String)context.getInitParameter("dclass");

		String url =(String) context.getInitParameter("url");

		String username = (String)context.getInitParameter("username");

		String password =(String) context.getInitParameter("password");
		try
		{
			Class.forName(dclass);
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		try 
		{ 
				  PreparedStatement ps = con.prepareStatement("select email,pwd from stu where email=? ");
				  String mail = request.getParameter("email");
				  String pass = request.getParameter("pwd");
				  ps.setString(1,mail);
				  //ps.setString(2,request.getParameter("pwd")); 
				  ResultSet rs = ps.executeQuery(); 
				 // String password = rs.getString("pass");
				  while(rs.next())
				  {
				  if(mail.length()>3 && pass.equals(rs.getString("pwd")) )
				  {
					  chain.doFilter(request, response);
				  }
				  
				  else 
				  {
					  request.getRequestDispatcher("login.html").forward(request, response);
				  } 
				  } 
		}
				  catch(Exception e) 
				  { 
					  System.out.println(e); 
				  }
		
	}

	
}
