package edu.training.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import  java.sql.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config)
	{
		String dClass="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/prodapt";
		String username="root";
		String password="root";
		try
		{
			Class.forName(dClass);
			con=DriverManager.getConnection(url,username,password);
			System.out.println("success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from register where FName=? and password=?;");
			ps.setString(1, req.getParameter("name1"));
			ps.setString(2, req.getParameter("password"));
			ResultSet rs=ps.executeQuery();
			if(req.getParameter("name1").equals("Admin"))
			{	
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("user.jsp");
				rd.forward(req, res);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
