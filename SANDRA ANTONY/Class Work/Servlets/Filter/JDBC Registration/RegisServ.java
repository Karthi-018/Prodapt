package filterRegis;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisServ extends HttpServlet 
{
	
	//Connection con=null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		res.getWriter().println("Welcome "+req.getParameter("uName"));
		
//		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
//		ps.setString(1,req.getParameter("fName"));
//		ps.setString(2,req.getParameter("lName"));
//		ps.setString(3,req.getParameter("email"));
//		ps.setString(4,req.getParameter("phone"));
//		ps.setString(5,req.getParameter("password"));
//		ps.executeUpdate();
//		
//		res.getWriter().println("Employee Registration Successful");
		
	}

}
