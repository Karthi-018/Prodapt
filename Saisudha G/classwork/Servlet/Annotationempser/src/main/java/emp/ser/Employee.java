package emp.ser;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con=null;
    
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context=getServletContext();
		String driverclass=(String)context.getInitParameter("dclass");
		String Url=(String)context.getInitParameter("url");
		String Username=(String)context.getInitParameter("username");
		String Password=(String)context.getInitParameter("password");
		
		try {
			Class.forName(driverclass);
			con = DriverManager.getConnection(Url, Username, Password);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		 try

		    {

		        con.close();

		    }

		    catch(Exception e)

		    {

		        e.printStackTrace();

		    }
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setString(1, req.getParameter("fname"));
		ps.setString(2, req.getParameter("lname"));
		ps.setString(3, req.getParameter("email"));
		ps.setString(4, req.getParameter("mobile"));
		ps.setString(5, req.getParameter("pwd"));
		ps.executeUpdate();
		
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, res);
		  
	}
	catch(Exception e) {
		System.out.println(e);
	}}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
