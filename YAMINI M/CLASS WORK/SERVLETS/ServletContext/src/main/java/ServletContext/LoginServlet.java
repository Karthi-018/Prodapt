package ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;

public class LoginServlet extends HttpServlet
{
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

    public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    PrintWriter pt=res.getWriter();
    try 
    {
    PreparedStatement ps=con.prepareStatement("select email,password from students where email=? and password=?");
    ps.setString(1,req.getParameter("fname"));
    ps.setString(2,req.getParameter("password"));
    ResultSet rs=ps.executeQuery();

    if(rs.next())
   /* while(rs.next())
    {
        String password = rs.getString("password");
        String fname=rs.getString("fname");*/
       

    //if(req.getParameter("fname").equals(rs.getString(1)))
    {
        pt.println("<html>");
        pt.println("<body>");
        pt.println("<center><h3 style=\"color:Green;\">Login Successfull!!!!</h3></center><br>");
        pt.println("<center><h3>Welcome</h3></center>");
        pt.println("</html>");
        pt.println("</body>");
    }
    else
    {
        pt.println("<html>");
        pt.println("<body>");
        pt.println("<center><h4 style=\"color:Red;\">Invalid UserName or password</h4></center>");
        pt.println("<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n"
        		+ "<title>Insert title here</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "<center>\r\n"
        		+ "STUDENT MANAGEMENT SYSTEM\r\n"
        		+ "<br><br>\r\n"
        		+ "<form action=\"login\" method=\"post\">\r\n"
        		+ "<table>\r\n"
        		+ "<tr>\r\n"
        		+ "<td><label>USER NAME</label></td>\r\n"
        		+ "<td><input type=\"text\" name=\"fname\" value=\"\" placeholder=\"Enter user name\"><BR></td>\r\n"
        		+ "</tr>	\r\n"
        		+ "<tr>\r\n"
        		+ "<td><label>PASSWORD</label></td>\r\n"
        		+ "<td><input type=\"password\" name=\"password\" value=\"\" placeholder=\"Enter Password\"><BR></td>\r\n"
        		+ "</tr>\r\n"
        		+ "</table>\r\n"
        		+ "<BR><br>\r\n"
        		+ "<td colspan=\"2\" text:align=\"center\"></td>\r\n"
        		+ "<input type=\"submit\" value=\"Login\">\r\n"
        		+ "</body>\r\n"
        		+ "</html>\r\n"
        		+ "\r\n"
        		);
        pt.println("</html>");
        pt.println("</body>");
    }

}
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    }
}
}



