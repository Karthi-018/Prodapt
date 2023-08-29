package edu.ialabs;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login_page extends HttpServlet {
	Connection con=null;
	ServletContext context;
	public void init() {
		context = getServletContext();
		String driverClass=(String)context.getInitParameter("dClass");
		String url=(String)context.getInitParameter("url");
		String userName=(String)context.getInitParameter("username");
		String password=(String)context.getInitParameter("password");
		
	try {
    	Class.forName(driverClass);
    	con=DriverManager.getConnection(url,userName,password);

	}
	catch(Exception e) {
    	System.out.println(e);
    	
    }
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)  {
	    try {
	    	PreparedStatement ps = con.prepareStatement("SELECT email, passwrd FROM registerationdetails WHERE email = ? AND passwrd = ?");
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
	    	/*while(rs.next()) {
	    		if(req.getParameter("passwrd").equals(rs.getString(2))) {
	    			pw.println("Welcome "+rs.getString("fname"));
	    		}
	    		else {
	    			pw.println("Invalid credentials");
	    		}
	    	}*/

	}
	    catch(Exception e) {
	    	System.out.println(e);
	    }
		
	}
	public void destory()throws SQLException{
		con.close();
	}
}


