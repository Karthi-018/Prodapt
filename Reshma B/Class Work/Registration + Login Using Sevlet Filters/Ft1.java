package FiltDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ft1 extends HttpFilter
{
	Connection con;
	
	public void init()
	{
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("dclass");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("uname");
		String pass = context.getInitParameter("pword");
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pass);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain c) throws IOException, ServletException
	{
		try
		{
			String query="SELECT `EMAIL ID`, PASSWORD FROM EMPLOYEES WHERE `EMAIL ID`=? AND PASSWORD=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("password"));
			PrintWriter out = res.getWriter();
			RequestDispatcher rd;
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
					//ps.setString(2, req.getParameter("password"));
					//ResultSet rs1=ps.executeQuery();
				rd=req.getRequestDispatcher("LoginAfterReg.html");
				rd.include(req, res);
				res.setContentType("text/html");
				out.println("<center><h3>Login Successful!</h3></center>");
				c.doFilter(req, res);
			}
					
			else
			{
				rd=req.getRequestDispatcher("LoginAfterReg.html");
				rd.include(req, res);
				res.setContentType("text/html");
				out.println("<center><h3>Invalid Login...</h3></center>");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
