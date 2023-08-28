package Annotation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet 
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
			con=DriverManager.getConnection(url,username,password);
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
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
			ps.setString(1,request.getParameter("fname"));
			ps.setString(2,request.getParameter("lname"));
			ps.setString(3,request.getParameter("email"));
			ps.setString(4,request.getParameter("phno"));
			ps.setString(5,request.getParameter("pwd"));
			int temp = ps.executeUpdate();
			
			if(temp >0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("/registerServlet");
				rd.forward(request, response);
			}
			
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
			System.out.println(e);
		}
	}

}
