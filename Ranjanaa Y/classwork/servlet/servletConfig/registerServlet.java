package EMS;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet 
{
	Connection con = null;
	
	public void init(ServletConfig sc)
	{
		String driverclass = (String)sc.getInitParameter("dclass");

		String url = (String)sc.getInitParameter("url");
		
		String username = (String)sc.getInitParameter("username");

		String password = (String)sc.getInitParameter("password");
		
		System.out.println(driverclass+" "+url+" "+username+" "+password);
		try
		{
			Class.forName(driverclass);
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
			ps.setString(1, req.getParameter("fname"));
			ps.setString(2, req.getParameter("lname"));
			ps.setString(3, req.getParameter("email"));
			ps.setString(4, req.getParameter("phno"));
			ps.setString(5, req.getParameter("pwd"));
			ps.executeUpdate();
			res.getWriter().println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<center>\r\n"
					+ "	<h1> LOGIN PAGE</h1>\r\n"
					+ "<form action=\"./log\" method = \"post\">\r\n"
					+ "	<table cellpadding = \"12\">\r\n"
					+ "		<tr>\r\n"
					+ "			<td>\r\n"
					+ "				<label>USERNAME</label>\r\n"
					+ "				<input type =\"text\" name = \"uname\" value=\"\" placeholder=\"Enter username\">\r\n"
					+ "			</td><BR><BR>\r\n"
					+ "		</tr>\r\n"
					+ "		<tr>\r\n"
					+ "			<td>\r\n"
					+ "				<label>PASSWORD</label>\r\n"
					+ "				<input type = \"password \" name = \"pwd\" value=\"\" placeholder=\"Enter password\">\r\n"
					+ "			</td>\r\n"
					+ "		</tr>	\r\n"
					+ "		\r\n"
					+ "	</table>\r\n"
					+ "<input type=\"submit\" value=\"login\">\r\n"
					+ "	    <input type = \"reset\" value=\"clear\">\r\n"
					+ "</form>\r\n"
					+ "\r\n"
					+ "</center>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
		catch(Exception e)
		{
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
			System.out.println(e);
		}
	}
}
