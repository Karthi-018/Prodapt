package ems.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
		
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
				/*
				 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection
				 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root",
				 * "root");
				 */
				//separate servlet is created to implement this
				
				
				PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
				ps.setString(1, req.getParameter("fname"));
				ps.setString(2, req.getParameter("lname"));
				ps.setString(3, req.getParameter("email"));
				ps.setString(4, req.getParameter("mobile"));
				ps.setString(5, req.getParameter("pwd"));
				int temp=ps.executeUpdate();
				
				res.getWriter().println("<h1> Employee Registration Successfull</h1>");
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



