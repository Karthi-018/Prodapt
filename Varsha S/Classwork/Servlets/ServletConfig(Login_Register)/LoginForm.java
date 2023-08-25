
package login.edu;

 

import java.io.IOException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

 

import javax.servlet.ServletConfig;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

public class LoginForm extends HttpServlet{

    

    

    Connection con = null;

    

    public void init(ServletConfig sc) {    

        String dClass = (String)sc.getInitParameter("dClass1");

        String url = (String)sc.getInitParameter("url1");

        String username = (String)sc.getInitParameter("username1");

        String password = (String)sc.getInitParameter("password1");

        

        try {

            Class.forName(dClass);

            con = DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {

            e.printStackTrace();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

        

    }

    

    public void destroy() {

        try {

            con.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    

    

    @Override

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        String em = req.getParameter("email");
		String p = req.getParameter("pwd");
		try {
			
			PreparedStatement ps = con.prepareStatement("select email,pswrd from ems_table where email=? ");
			ps.setString(1, em);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				if(p.equals(rs.getString(2)))
				{
				res.getWriter().print("<html>");
				res.getWriter().print("<body>");
				res.getWriter().print("<center>");
				res.getWriter().print("<h2><i>Login successful</i></h2>");
				res.getWriter().print("</center>");
				res.getWriter().print("</body>");
				res.getWriter().print("</html>");
				}
			
			else {
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
				res.getWriter().print("<html>");
				res.getWriter().print("<body>");
				res.getWriter().print("<center>");
				res.getWriter().print("<h2><i>Invalid credentials </i></h2>");
				res.getWriter().print("</center>");
				res.getWriter().print("</body>");
				res.getWriter().print("</html>");
			}
			}
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
    }
	}