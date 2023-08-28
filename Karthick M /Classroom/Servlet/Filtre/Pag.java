package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pag extends HttpServlet{
	Connection c=null;
	public void init(ServletConfig sc) {
		String drclass=sc.getInitParameter("dclass");
		String url=sc.getInitParameter("url");
		String iid=sc.getInitParameter("id");
		String psd=sc.getInitParameter("pwd");
		try {
			Class.forName(drclass);
			c=DriverManager.getConnection(url,iid,psd);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		public void doPost(HttpServletRequest req,HttpServletResponse res){
			try {
				//Class.forName(drclass);
				//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
				PreparedStatement ps=c.prepareStatement("insert into employees values(?,?,?,?,?)");
				ps.setString(1, req.getParameter("fName"));
				ps.setString(2, req.getParameter("lName"));
				ps.setString(3, req.getParameter("email"));
				ps.setString(4, req.getParameter("phno"));
				ps.setString(5, req.getParameter("pswd"));
				ps.executeUpdate();
				res.getWriter().println("<h1 style=\"background-color: blueviolet;\"><center>&#128512;Success<center></h1>");
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
		public void destroy() {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
}
