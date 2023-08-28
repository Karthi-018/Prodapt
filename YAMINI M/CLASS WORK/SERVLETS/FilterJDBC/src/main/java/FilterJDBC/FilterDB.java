package FilterJDBC;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.Filter;
import javax.servlet.http.HttpFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterDB extends HttpFilter {
	
	Connection con=null;
	
	public void init()
    {
		 ServletContext context = getServletContext();
			String driverclass = context.getInitParameter("driverclass");
			String url = context.getInitParameter("url");
			String username = context.getInitParameter("username");
			String password = context.getInitParameter("password");
			
			try
			{
				Class.forName(driverclass);
	    		con = DriverManager.getConnection(url,username,password);    
	    		System.out.println("connected!!!!!");
			}
			catch(Exception e)
			{
	        System.out.println(e.getMessage());
			}
			
	}
	   

	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		 PrintWriter pw=res.getWriter();
		    try 
		    {
		    PreparedStatement ps=con.prepareStatement("select firstname,password from students where firstname=? and password=?");
		    ps.setString(1,req.getParameter("uname"));
		    ps.setString(2,req.getParameter("password"));
		    ResultSet rs=ps.executeQuery();
		    
		    //if(rs.next())
		    while(rs.next())
		    	
		    	if(req.getParameter("uname").equals(rs.getString(1)))
		        {
		            pw.println("<html>");
		            pw.println("<body>");
		            pw.println("<center><h3 style=\"color:Green;\">Login Successfull!!!!</h3></center><br>");
		            pw.println("<center><h3>Welcome</h3></center>");
		            pw.println("</body>");
		            pw.println("</html>");
		            
		        }
		        else
		        {
		            pw.println("<html>");
		            pw.println("<body>");
		            pw.println("<center><h4 style=\"color:Red;\">Invalid UserName or password</h4></center>");
		            pw.println("<!DOCTYPE html>\r\n"
		            		+ "<html>\r\n"
		            		+ "<head>\r\n"
		            		+ "<meta charset=\"ISO-8859-1\">\r\n"
		            		+ "<title>Insert title here</title>\r\n"
		            		+ "</head>\r\n"
		            		+ "<body>\r\n"
		            		+ "<center> LOGIN CREDENTIALS \r\n"
		            		+ "<form action=\"Validservlet\" >\r\n"
		            		+ "\r\n"
		            		+ "	<table>\r\n"
		            		+ "<tr>\r\n"
		            		+ "<td>\r\n"
		            		+ "	<label>Enter User Name </label></td> \r\n"
		            		+ "	<td><input type=\"text\" name=\"fname\" value=\"\" placeholder=\"Enter UserName\">\r\n"
		            		+ "	</td>\r\n"
		            		+ "</tr>	\r\n"
		            		+ "<tr>\r\n"
		            		+ "<td><br>\r\n"
		            		+ "	<label>Enter Password </label></td>\r\n"
		            		+ "	<td> <input type=\"text\" name=\"password\" value=\"\" placeholder=\"Enter password\">\r\n"
		            		+ "	</td>\r\n"
		            		+ "</tr>	\r\n"
		            		+ "	</table>\r\n"
		            		+ "	<br><br>\r\n"
		            		+ "	<input type=\"submit\">\r\n"
		            		+ "	<input type=\"reset\" value=\"Reset\">\r\n"
		            		+ "	</center>\r\n"
		            		+ "	</form>\r\n"
		            		+ "\r\n"
		            		+ "</body>\r\n"
		            		+ "</html>"
		            		);
		            
		            pw.println("</body>");
		            pw.println("</html>");
		           
		        }

		    }
		        catch(Exception e)
		        {
		        System.out.println(e.getMessage());
		        }
		    }	    
		
}
