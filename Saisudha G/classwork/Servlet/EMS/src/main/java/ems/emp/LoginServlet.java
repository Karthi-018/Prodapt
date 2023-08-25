package ems.emp;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	Connection con = null ;
	public void init() 
	{
		ServletContext context=getServletContext();
		String driverclass=(String)context.getInitParameter("dclass");
		String Url=(String)context.getInitParameter("url");
		String Username=(String)context.getInitParameter("username");
		String Password=(String)context.getInitParameter("password");
		
		try {
			Class.forName(driverclass);
			con = DriverManager.getConnection(Url, Username, Password);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
public void doPost(HttpServletRequest req , HttpServletResponse res) {
	
	
		
		try {
			
			PreparedStatement ps=con.prepareStatement("select pwd from employee where email=?");
			ps.setString(1, req.getParameter("mail"));
			PrintWriter out=res.getWriter();
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				
				
				if(req.getParameter("pwd1").equals(rs.getString(1))) {

				out.println("Welcome ");
				}
				else {
					RequestDispatcher rd=req.getRequestDispatcher("index.html");
					rd.include(req, res);
					
				}
			}
	         
		    
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	


}
public void destroy()

{

    try

    {

        con.close();

    }

    catch(Exception e)

    {

        e.printStackTrace();

    }

}
}

