package ConfigExample1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	 static Connection con;
	static PreparedStatement ps;
	public void init(ServletConfig sc) {
		try {
			String driverClass=(String)sc.getInitParameter("dClass");
			String url=(String)sc.getInitParameter("url");
			String userName=(String)sc.getInitParameter("userName");
			String password=(String)sc.getInitParameter("password");
			
				Class.forName(driverClass);
				con = DriverManager.getConnection(url,userName,password);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		RequestDispatcher rd;
		try {
			String email = req.getParameter("email");
			String password = req.getParameter("passwd");
			PreparedStatement ps = con.prepareStatement("SELECT email,password,firstname from employees1 where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				    PrintWriter pr = res.getWriter();
					res.setContentType("text/html");
					pr.println("<html><head></head>\r\n"
							+ "	<body style=\"background-color: black;\">\r\n"
							+ "		\r\n"
							+ "	</body>\r\n"
							+ "</html>");
					pr.println("<div style='color:red;background:black;'>"+rs.getString(3)+"<div>");
//					rd = req.getRequestDispatcher("home.html");
//					rd.forward(req, res);
				}
				else {
					PrintWriter pr = res.getWriter();
					rd=req.getRequestDispatcher("login.html");
					rd.include(req, res);
					res.setContentType("text/html");
					pr.println("<br><div style='color:red;text-align:center;' ><u>Enter the valid credentials !!<u></div>");
					
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	/*
	 * public static void display(String email,HttpServletResponse res) throws
	 * SQLException, IOException{ PreparedStatement ps
	 * =con.prepareStatement("SELECT firstname from employees1 where email=?;");
	 * ps.setString(1, email); ResultSet rs = ps.executeQuery(); if(rs.next()) {
	 * res.getWriter().println(rs.getString(1)); }
	 * 
	 * }
	 */

}

