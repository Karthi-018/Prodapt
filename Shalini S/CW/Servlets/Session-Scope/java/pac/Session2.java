package pac;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session2
 */
@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=null;
	public void init() throws ServletException {
		ServletContext context=getServletContext();
		String driverClass=context.getInitParameter("dClass");
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("username");
		String pass=context.getInitParameter("password");
		
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	
	protected void service(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("name");
		String pass=req.getParameter("upass");
		try {
		PreparedStatement ps = con.prepareStatement("select fname,password from management where fname=?");
        ps.setString(1,name);
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
