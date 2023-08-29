package edu.ialabs;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Form_creation extends HttpServlet {
	Connection c=null;
	ServletContext context;
	public void init() {
		context = getServletContext();
		String driverClass=context.getInitParameter("dClass");
		String url=context.getInitParameter("url");
		String userName=context.getInitParameter("username");
		String password=context.getInitParameter("password");
		
	try {
    	Class.forName(driverClass);
    	c=DriverManager.getConnection(url,userName,password);

	}
	catch(Exception e) {
    	System.out.println(e);
      }
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)  {
    try {
    	PreparedStatement ps=c.prepareStatement("insert into registerationdetails values(?,?,?,?,?)");
    	String fname = req.getParameter("fname");
    	ps.setString(1,fname);
    	ps.setString(2,req.getParameter("lname"));
    	ps.setString(3,req.getParameter("email"));
    	ps.setString(4,req.getParameter("phneno"));
    	ps.setString(5,req.getParameter("passwrd"));
        PrintWriter out=res.getWriter();
    	int temp=ps.executeUpdate();
    	if(temp>0) {
    		RequestDispatcher rd=req.getRequestDispatcher("login.html");
    		rd.forward(req, res);
    	}
    	else {
    		out.println("Unsuccessful");
    		RequestDispatcher rd=req.getRequestDispatcher("index.html");
    		rd.include(req, res);
    	}
    	}
    catch(Exception e) {
    	System.out.println(e);
    }
	}	
   	public void destory()throws SQLException{
	c.close();
}
}
