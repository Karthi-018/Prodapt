package Annotation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	Connection con = null;
	public void init()
	{
		ServletContext context = getServletContext();
		String dclass = context.getInitParameter("dclass");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		try
		{
			Class.forName(dclass);
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		try
		{
			PreparedStatement ps = con.prepareStatement("select email,pwd from emp where email=? and pwd =?");
			ps.setString(1,request.getParameter("email"));
			ps.setString(2,request.getParameter("pwd"));
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{ 
				//response.getWriter().println("<html>logged in.............</html>");
				RequestDispatcher rd = request.getRequestDispatcher("home.html");
				rd.forward(request, response);
			}
			else
			{
				response.getWriter().println("try again.............");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
