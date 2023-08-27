package ConfigExample1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
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
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String email = req.getParameter("email");
			String mobile =req.getParameter("mobile");
			String password = req.getParameter("passwd");
			PreparedStatement ps = con.prepareStatement("INSERT INTO employees1 values(?,?,?,?,?)");
					ps.setString(1, fname);
					ps.setString(2, lname);
					ps.setString(3, email);
					ps.setString(4,mobile);
					ps.setString(5,password);
					ps.executeUpdate();
					
					PrintWriter out=res.getWriter();
					res.setContentType("text/html");
					out.println("<div> Registration Done Successfully!Please Login</div>");
					rd =req.getRequestDispatcher("login.html");
					rd.include(req, res);
 }
		catch(SQLException e) {
			e.printStackTrace();
		}
 }
}