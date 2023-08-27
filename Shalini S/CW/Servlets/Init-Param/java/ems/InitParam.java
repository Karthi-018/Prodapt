package ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam extends HttpServlet{
	Connection con=null;
	public void init(ServletConfig sc) {
		String driverClass=(String) sc.getInitParameter("dClass");
		String url=(String) sc.getInitParameter("url");
		String user=(String) sc.getInitParameter("username");
		String pass=(String) sc.getInitParameter("password");
		
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
