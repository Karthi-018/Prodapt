package com.arun;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
	Connection con;
	ServletContext context;
	
	public void init() {
		try {
			context = getServletContext();
			Class.forName(context.getInitParameter("connection"));
			con = DriverManager.getConnection(context.getInitParameter("database"),context.getInitParameter("username"),context.getInitParameter("password"));
		}
		catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String uName = req.getParameter("uname");
		String password = req.getParameter("password");
		
		try {
			PreparedStatement ps = con.prepareStatement("SELECT email,password from employees where email=? and password=?;");
			ps.setString(1, uName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			RequestDispatcher rd;
			if(rs.next()) {
				rd = req.getRequestDispatcher("homepage.html");
				rd.forward(req, res);
			}
			else {
				PrintWriter pr = res.getWriter();
				res.setContentType("text/html");
				pr.println("<div>Try again da !!</div>");
				rd = req.getRequestDispatcher("login.html");
				rd.include(req, res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
