package pac;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
 * Servlet implementation class Annotation
 */
@WebServlet("/reg")
public class Annotation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	Connection con=null;
	public void init() throws ServletException {
		ServletContext context=getServletContext();
		String driverClass=context.getInitParameter("dClass");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("username");
		String pass=context.getInitParameter("password");
		
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into management values(?,?,?,?,?)");	
			ps.setString(1,req.getParameter("fname"));
			ps.setString(2, req.getParameter("lname"));
			ps.setString(3, req.getParameter("email"));
			ps.setString(4, req.getParameter("phone"));
			ps.setString(5,req.getParameter("password"));
			ps.executeUpdate();
			
			res.getWriter().println("<h1>EMPLOYEE REGISTRATION SUCCESSFUL</h1>");
			
			//redirecting it to login using forward but print statement wont work
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, res);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
