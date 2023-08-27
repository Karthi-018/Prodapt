package scope;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request2
 */
@WebServlet("/Request2")
public class Request2 extends HttpServlet {
	Connection con=null;
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
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

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			 String userName = (String)req.getAttribute("name");
            String pass =req.getParameter("upass");
            PreparedStatement ps = con.prepareStatement("select fname,password from management where fname=?");
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
           	 if(pass.equals(rs.getString(2))) {
           	 res.getWriter().print("Login successfull");
            }

            else {
           	 res.getWriter().print("Invalid credentials");
            }
            }  	 
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
