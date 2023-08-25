package emp.ser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/log")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null ;
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
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

	
	public void destroy() {
		// TODO Auto-generated method stub
		 try

		    {

		        con.close();

		    }

		    catch(Exception e)

		    {

		        e.printStackTrace();

		    }
	}

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
					out.println("Invalid Password");
					res.setContentType("text/html");
					RequestDispatcher rd=req.getRequestDispatcher("index.html");
					rd.include(req, res);
					
					
				}
			}
	         
		    
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
