

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	Connection con = null ;
	public void init(ServletConfig sc) 
	{
		String driverclass=(String)sc.getInitParameter("dclass");
		String Url=(String)sc.getInitParameter("url");
		String Username=(String)sc.getInitParameter("username");
		String Password=(String)sc.getInitParameter("password");
		
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
				out.println(" <!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<title>Insert title here</title>\r\n"
						+ "</head>\r\n"
						+ "<body style=\"background-color:powderblue;\">\r\n"
						+ "<center>\r\n"
						+ "<marquee><h1>Welcome to EMS Portal</h1></marquee>\r\n"
						+ "\r\n"
						+ "<table cellpadding=\"15\">\r\n"
						+ "<form action=\"./log\" method=\"post\">\r\n"
						+ "<tr>\r\n"
						+ "<td><label>UserName</label></td>\r\n"
						+ "<td><input type=\"text\" name=\"mail\" value=\"\" placeholder=\"Enter Your UserName\"/></td>\r\n"
						+ "</tr>\r\n"
						+ "\r\n"
						+ "<tr>\r\n"
						+ "<td><label>Password</label></td>\r\n"
						+ "<td><input type=\"text\" name=\"pwd1\" value=\"\" placeholder=\"Enter Your Password\"/></td>\r\n"
						+ "</tr>\r\n"
						+ "</table>\r\n"
						+ "<br>\r\n"
						+ "<pre>\r\n"
						+ "<input type=\"submit\" value=\"REGISTER\"/>    <input type=\"reset\" value=\"RESET\"/>\r\n"
						+ "\r\n"
						+ "</form>\r\n"+"Invalid Password"
						+ "</body>\r\n"
						+ "</html>");
					
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

