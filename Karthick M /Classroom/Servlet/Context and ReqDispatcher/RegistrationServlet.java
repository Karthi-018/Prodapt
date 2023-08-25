package edu.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet
{
	Connection con =null;
	ServletContext s;
	public void init() {
		ServletContext sc = getServletContext();
		String drclass=sc.getInitParameter("dclass");
		String url=sc.getInitParameter("url");
		String iid=sc.getInitParameter("id");
		String psd=sc.getInitParameter("psd");
		try {
			Class.forName(drclass);
			con=DriverManager.getConnection(url,iid,psd);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			PreparedStatement ps=con.prepareStatement("insert into stu values(?,?,?,?,?)");
			ps.setString(1, req.getParameter("fName"));
			ps.setString(2, req.getParameter("lName"));
			ps.setString(3, req.getParameter("email"));
			ps.setString(4, req.getParameter("phno"));
			ps.setString(5, req.getParameter("pswd"));
			int r=ps.executeUpdate();
			if(r>0) {
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.forward(req, res);
			}
			else {
				RequestDispatcher rd=req.getRequestDispatcher("index.html");
				rd.include(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
