package edu.log;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	Connection con;
	ServletContext cont;
	public void init() {
		
		cont=getServletContext();
		String driverclass=(String) cont.getInitParameter("dclass");
		String url=(String) cont.getInitParameter("url");
		String uname=(String) cont.getInitParameter("uname");
		String pass=(String) cont.getInitParameter("pass");

		
		try {
			Class.forName(driverclass);
			con=DriverManager.getConnection(url,uname,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("usname");
        String passwd=req.getParameter("password");
        PreparedStatement ps;
        try {
			ps= con.prepareStatement("select * from prodapt.register where email=? and password=?;");
			ps.setString(1, email);
			ps.setString(2, passwd);
			ResultSet rs = ps.executeQuery();
			RequestDispatcher rd;
			if(rs.next()) {
				PrintWriter out = res.getWriter();
				out.println("Hi"+rs.getString(1));
				
			}
			else {
				PrintWriter pr = res.getWriter();
				res.setContentType("text/html");
				pr.println("Illegal Entry");
				rd = req.getRequestDispatcher("index.html");
				rd.forward(req, res);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
