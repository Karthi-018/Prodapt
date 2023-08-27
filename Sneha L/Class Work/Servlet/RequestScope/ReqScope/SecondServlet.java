package ReqScope;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	
	static Connection con;
	public void init() throws ServletException {
		ServletContext context=getServletContext();
		String driverClass=(String)context.getInitParameter("dClass");
		String url=(String)context.getInitParameter("url");
		String user=(String)context.getInitParameter("userName");
		String pass=(String)context.getInitParameter("password");
		
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

	
	protected void service(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException {
		
		String emailid=(String)req.getAttribute("email");
		String pass=req.getParameter("passwd");
		try {
		PreparedStatement ps = con.prepareStatement("select email,password from employees1 where email=?");
        ps.setString(1,emailid);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
       	 if(pass.equals(rs.getString(2))) {
       	 res.getWriter().print("Login successfull");
       	 break;
        }

        else {
       	 res.getWriter().print("Invalid credentials");
       	 break;
        }
        }  	 

	    }
		catch(Exception e) {
			System.out.println(e);
		}
	}
		

}
