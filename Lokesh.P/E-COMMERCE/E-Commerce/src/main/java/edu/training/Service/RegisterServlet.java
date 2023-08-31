package edu.training.Service;

import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class RegisterServlet  extends HttpServlet{
	Connection con=null;
	public void init()
	{
		
		String url="jdbc:mysql://localhost:3306/prodapt";
		String username="root";
		String password="root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			System.out.println("success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
	try
	{
		PreparedStatement ps = con.prepareStatement("insert into register(FName,LName,Mail,Mobile,password) values (?,?,?,?,?);");
		ps.setString(1, req.getParameter("name1"));
		ps.setString(2, req.getParameter("name2"));
		ps.setString(3, req.getParameter("mail"));
		ps.setString(4, req.getParameter("mobile"));
		ps.setString(5, req.getParameter("password"));
	//	ps.setString(6, req.getParameter("dob"));
		int x=ps.executeUpdate();
		System.out.println("successful");
		if(x==1)
		{
			res.getWriter().println("Login Successfully");
			// moving to another file 
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
		
		
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
public void destroy() {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
