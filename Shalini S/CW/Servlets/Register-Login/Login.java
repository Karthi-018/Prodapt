package pac;

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

 

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

public class Login extends HttpServlet{
	Connection con=null;
	public void init(ServletConfig sc) {
		String driverClass=(String) sc.getInitParameter("dClass1");
		String url=(String) sc.getInitParameter("url1");
		String user=(String) sc.getInitParameter("username1");
		String pass=(String) sc.getInitParameter("password1");
		
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
			 String userName = req.getParameter("userName");
             String pass = req.getParameter("upass");
             PreparedStatement ps = con.prepareStatement("select fname,password from management where fname=?");
             ps.setString(1, userName);
             ResultSet rs = ps.executeQuery();
             while(rs.next()) {
            	 if(pass.equals(rs.getString(2))) {
            	 res.getWriter().print("Login successfull");
             }

             else {
            	 res.getWriter().print("Invalid credentials");
             }
             }  	 
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