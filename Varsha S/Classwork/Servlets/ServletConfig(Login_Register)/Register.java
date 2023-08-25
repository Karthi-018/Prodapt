package login.edu;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	import javax.servlet.ServletConfig;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class Register extends HttpServlet
	{
		Connection con = null;
		public void init(ServletConfig sc)
		{
			String driverclass = (String) sc.getInitParameter("className");
			String url = (String) sc.getInitParameter("URL");
			String username = (String) sc.getInitParameter("userName");
			String password = (String) sc.getInitParameter("password");
			
			try 
			{
				Class.forName(driverclass);
				con = DriverManager.getConnection(url, username, password);
			} 
			
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			public void doPost(HttpServletRequest req, HttpServletResponse res) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","root");
					PreparedStatement ps = c.prepareStatement("insert into ems_table values (?, ?, ?, ?, ?)");
					ps.setString(1,req.getParameter("fname"));
					ps.setString(2,req.getParameter("lname"));
					ps.setString(3,req.getParameter("email"));
					ps.setString(4,req.getParameter("phone"));
					ps.setString(5,req.getParameter("pswrd"));
					ps.executeUpdate();
					
					res.getWriter().print("<!DOCTYPE html>\r\n"
							+ "<html>\r\n"
							+ "<head>\r\n"
							+ "<meta charset=\"ISO-8859-1\">\r\n"
							+ "<title>Insert title here</title>\r\n"
							+ "</head>\r\n"
							+ "\r\n"
							+ "<style>\r\n"
							+ "	body{\r\n"
							+ "		\r\n"
							+ "		 background-image: linear-gradient(to left, black , lightpink); \r\n"
							+ "	}\r\n"
							+ "	table{\r\n"
							+ "		background-image: linear-gradient(to right, violet , floralwhite); \r\n"
							+ "		border-color  :white;\r\n"
							+ "	}\r\n"
							+ "	\r\n"
							+ "</style>\r\n"
							+ "\r\n"
							+ "<body>\r\n"
							+ "	<center>\r\n"
							+ "	<h3>LOGIN</h3>\r\n"
							+ "	<form action=\"./login\" method = \"post\">\r\n"
							+ "		<table cellpadding=\"15\">\r\n"
							+ "			<tr>\r\n"
							+ "				<td>Email</td>\r\n"
							+ "				<td><input type=\"text\" name=\"email\" placeholder=\"Enter email\"></td>\r\n"
							+ "			</tr>\r\n"
							+ "			<tr>\r\n"
							+ "				<td>Password</td>\r\n"
							+ "				<td><input type=\"password\" name=\"pwd\" placeholder=\"Enter password\"></td>\r\n"
							+ "			</tr>\r\n"
							+ "			<tr>\r\n"
							+ "				</table>\r\n"
							+ "\r\n"
							+ "         <pre> <input type = \"submit\" value = \"Login\">         <input type = \"reset\" value = \"Clear\">\r\n"
							+ "			\r\n"
							+ "		\r\n"
							+ "	</form>\r\n"
							+ "	</center>\r\n"
							+ "\r\n"
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


