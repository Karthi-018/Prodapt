package pac;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 * Servlet implementation class Annotation2
 */
@WebServlet("/login")
public class Annotation2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
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
	/**
	 * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse res)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try(PrintWriter out = res.getWriter()) {
			 String userName = req.getParameter("userName");
            String pass = req.getParameter("upass");
          
            PreparedStatement ps = con.prepareStatement("select fname,password from management where fname=?");
            ps.setString(1, userName);

            ResultSet rs = ps.executeQuery();
            
           
            while(rs.next()) {
           	
           	 if(pass.equals(rs.getString(2))) 
           	 {
           		 out.print("Login successfull"); 
           		 break;
           		 
           	 }
           	 else {
           	    out.print("Invalid credentials"); 
           	    break;
           	    
                }
		    }    
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	public void destroy(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
