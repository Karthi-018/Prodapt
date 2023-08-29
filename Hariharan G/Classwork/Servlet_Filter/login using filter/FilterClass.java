package FilterDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterClass extends HttpFilter
{
	static Connection con;
	PreparedStatement ps;
	ResultSet rs;
	ServletContext context;
	public void init() {
		try {
//		ServletContext sx = getServletContext();		
//		String className,connectionUrl,connectionUsername,connectionPassword;
//		className=(String)sx.getInitParameter("driverClass");
//		connectionUrl=(String)sx.getInitParameter("connectionUrl");
//		connectionUsername=(String)sx.getInitParameter("connectionUsername");
//		connectionPassword=(String)sx.getInitParameter("connectionPassword");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println("Driver is Loaded");
		System.out.println("Connection Established");
		ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(3));
		}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public void init(FilterConfig sc)throws ServletException {
//		
////		String className,connectionUrl,connectionUsername,connectionPassword;
////		className=(String)sc.getInitParameter("driverClass");
////		connectionUrl=(String)sc.getInitParameter("connectionUrl");
////		connectionUsername=(String)sc.getInitParameter("connectionUsername");
////		connectionPassword=(String)sc.getInitParameter("connectionPassword");
//		try {
//			Class.forName(className);
//			con = DriverManager.getConnection(connectionUrl,connectionUsername,connectionPassword);
//			System.out.println("Driver is Loaded");
//			System.out.println("Connection Established");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public void doFilter(HttpServletRequest request,HttpServletResponse response,FilterChain chain) throws IOException, ServletException {
		try {
		String email_id,password;
		email_id=request.getParameter("email");
		password=request.getParameter("pwd");
		System.out.println(email_id);
		System.out.println(password);
		ps=con.prepareStatement("select * from employee");
		rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1) + rs.getString(2));
		}
		ps=con.prepareStatement("select first_name,last_name,password from employee where email_id=?");
		ps.setString(1, email_id);
		rs=ps.executeQuery();
		while(rs.next()) {
			if(password.equals(rs.getString(3))) {
				response.getWriter().println(rs.getString(1));
				request.getSession().setAttribute("mail", email_id);
				request.getSession().setAttribute("password", password);
				request.getSession().setAttribute("first_name", rs.getString(1));
				request.getSession().setAttribute("last_name", rs.getString(2)); 
				request.getRequestDispatcher("Servlet1").forward(request, response);
//				chain.doFilter(request, response);
			}
			else{
				response.setContentType("text/html");
				response.getWriter().println("<b style='color:red'>INVALID USER DETAILS! TRY AGAIN</b>");
	               RequestDispatcher rd = request.getRequestDispatcher("index.html");          
	               rd.include(request, response);

	           }
//			else {
//				response.getWriter().println("INVALID USER DETAILS! TRY AGAIN");
//				request.getRequestDispatcher("index.html").include(request, response);
////				response.sendRedirect("index.html");
//			}
		}	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}


//if(fname.length()>3 && lname.length()>3) {
////request.getRequestDispatcher("Servlet1").forward(request,response);
////response.sendRedirect("Servlet1");
//chain.doFilter(request, response);
//
//}
//else {
//response.sendRedirect("index.html");
//}
