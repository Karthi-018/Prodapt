package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reg extends HttpServlet{
	Connection con=null;
	public void init() {
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
			RequestDispatcher rd=req.getRequestDispatcher("log.html");
			rd.forward(req, res);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	public void destroy(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
