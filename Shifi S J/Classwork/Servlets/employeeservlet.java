package edu.ems;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
	
    public void doPost(HttpServletRequest req,HttpServletResponse res) 
    {
    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifi","root","root");
	    		PreparedStatement ps =c.prepareStatement("insert into employees values(?,?,?,?,?);");
	    		ps.setString(1, req.getParameter("fname"));
	            ps.setString(2, req.getParameter("lname"));
	            ps.setString(3, req.getParameter("email"));
	            ps.setString(4, req.getParameter("phone"));
	            ps.setString(5, req.getParameter("pwd"));
	            
	            ps.executeUpdate();
	    
	            res.getWriter().println("<h1>Employee Registration Successful</h1>");
	    
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    

}
}
