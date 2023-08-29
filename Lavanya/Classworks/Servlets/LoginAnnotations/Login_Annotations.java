package edu.ialabs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(
		urlPatterns = { "/Login_Annotations" }, 
		initParams = { 
				@WebInitParam(name = "dClass", value = "com.mysql.cj.jdbc.Driver"), 
				@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/prodapt"), 
				@WebInitParam(name = "username", value = "root"), 
				@WebInitParam(name = "password", value = "root")
		})
public class Login_Annotations extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Connection con=null;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init(ServletConfig config)throws ServletException {
    	String driverClass=(String)config.getInitParameter("dClass");
		String url=(String)config.getInitParameter("url");
		String userName=(String)config.getInitParameter("username");
		String password=(String)config.getInitParameter("password");
		
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
	    	PreparedStatement ps = con.prepareStatement("SELECT email, passwrd FROM registeration_annotation WHERE email = ? AND passwrd = ?");
	    	String s1 =req.getParameter("username"); 
	    	String s2 = req.getParameter("password");
	    	ps.setString(1, s1);
	    	ps.setString(2, s2);
	    	ResultSet rs=ps.executeQuery();
	    	PrintWriter pw=res.getWriter();
	    	if(rs.next()) {
	    		pw.println("Welcome");
	    	}
	    	else {
	    		pw.println("Invalid credentials");
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
