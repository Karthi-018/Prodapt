package edu.ialabs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "/Register_Annotations" }, 
		initParams = { 
				@WebInitParam(name = "dclass", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/prodapt"), 
				@WebInitParam(name = "username", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		})
public class Register_Annotations extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String driverClass=config.getInitParameter("dclass");
		String url=config.getInitParameter("url");
		String userName=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		
	try {
    	Class.forName(driverClass);
    	con=DriverManager.getConnection(url,userName,password);

	}
	catch(Exception e) {
    	System.out.println(e);
      }
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
	    	PreparedStatement ps=con.prepareStatement("insert into registeration_annotation values(?,?,?,?,?)");
	    	String fname = req.getParameter("fname");
	    	ps.setString(1,fname);
	    	ps.setString(2,req.getParameter("lname"));
	    	ps.setString(3,req.getParameter("email"));
	    	ps.setString(4,req.getParameter("phneno"));
	    	ps.setString(5,req.getParameter("passwrd"));
	        PrintWriter out=res.getWriter();
	    	int temp=ps.executeUpdate();
	    	if(temp>0) {
	    		RequestDispatcher rd=req.getRequestDispatcher("login1.html");
	    		rd.forward(req, res);
	    	}
	    	else {
	    		out.println("Unsuccessful");
	    		RequestDispatcher rd=req.getRequestDispatcher("index1.html");
	    		rd.include(req, res);
	    	}
	    	}
	    catch(Exception e) {
	    	System.out.println(e);
	    }
			
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
