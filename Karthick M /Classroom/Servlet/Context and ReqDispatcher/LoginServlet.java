package edu.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	Connection con=null;
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
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
			PreparedStatement ps=con.prepareStatement("select password from stu where email=?");
			ps.setString(1, req.getParameter("mail"));
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				if(req.getParameter("pswd").equals(rs.getString(1))) {
					res.getWriter().println("Success");
				}
				else {
					res.getWriter().println("Invalid");
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}