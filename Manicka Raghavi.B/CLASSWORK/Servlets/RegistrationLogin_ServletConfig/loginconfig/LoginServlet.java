package loginconfig;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{   
	Connection con=null;
	public void init(ServletConfig sc)
	{
		String driverClass=sc.getInitParameter("dClass"); 
		String url=sc.getInitParameter("url");
		String username=sc.getInitParameter("username");
		String password=sc.getInitParameter("password"); 
		
		System.out.print(driverClass+" "+url+" "+username+" "+password);


        try 
        {
           Class.forName(driverClass);
 		   con=DriverManager.getConnection(url,username,password);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	} 
	public void doPost(HttpServletRequest req,HttpServletResponse rep) throws IOException 
    {
       try 
       {
	  	   PreparedStatement ps=con.prepareStatement("select fname,password from empreg");
	       ResultSet rs=ps.executeQuery(); 
	       int flag=0;
	       while(rs.next())
	       {
	    	   if(rs.getString(1).equals(req.getParameter("uname"))&& rs.getString(2).equals(req.getParameter("pwd")))
	    	   {
	    		   rep.getWriter().println("<h1>EMPLOYEE LOGIN SUCCESSFUL</h1>"); 
	    		   flag=1;
	    		   break;
	    	   }
	           
	       } 
	       if(flag==0) 
	       {
	    	   rep.getWriter().println("<html>\r\n"
	    	   		+ "<head>\r\n"
	    	   		+ "<meta charset=\"ISO-8859-1\">\r\n"
	    	   		+ "<title>Insert title here</title>\r\n"
	    	   		+ "</head>\r\n"
	    	   		+ "<body>\r\n"
	    	   		+ "<center><b><h1>WELCOME TO EMS</h1></b></center>\r\n"
	    	   		+ "<form action=\"login\" method=\"post\">\r\n"
	    	   		+ "<center>  \r\n"
	    	   		+ "<table cellpadding=\"15\" > 	\r\n"
	    	   		+ "	<tr>\r\n"
	    	   		+ "			<td><label> USER NAME </label></td>\r\n"
	    	   		+ "			<td><input type = \"text\" name =\"uname\" value=\"\" placeholder=\"Enter your username\"></td>\r\n"
	    	   		+ "			\r\n"
	    	   		+ "	</tr> \r\n"
	    	   		+ "		\r\n"
	    	   		+ "    <tr>\r\n"
	    	   		+ "		<td><label>PASSWORD</label></td>\r\n"
	    	   		+ "        <td><input type = \"password\" name =\"pwd\" value=\"\" placeholder=\"Enter your password\"></td>\r\n"
	    	   		+ "    </tr>\r\n"
	    	   		+ "		\r\n"
	    	   		+ "	\r\n"
	    	   		+ "</table>\r\n"
	    	   		+ "<pre>	\r\n"
	    	   		+ "<input type=\"submit\" value=\"SUBMIT\">   <input type=\"reset\" value=\"CLEAR\"> \r\n"
	    	   		+ "</center>\r\n"
	    	   		+ "</form>		\r\n"
	    	   		+ "</body>\r\n"
	    	   		+ "</html>");  
		    	        rep.getWriter().println("<center>INVALID CREDENTIALS</center>");
	       }
		  
	   } 
       catch (SQLException e) 
       {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
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
