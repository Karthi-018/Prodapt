package edu.ems;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.http.*;


	public class JD_Servlet extends HttpServlet {

		public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException

		{

		 

		    try {

		 

		        String fname=req.getParameter("fname");

		        String lname=req.getParameter("lname");

		        String email=req.getParameter("email");

		        String passwd=req.getParameter("password");

		        String ph=req.getParameter("phone");

		        

		        Class.forName("com.mysql.cj.jdbc.Driver");

		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");

		        PreparedStatement ps=con.prepareStatement("INSERT INTO registration values(?,?,?,?,?)");

		        ps.setString(1, fname);

		        ps.setString(2, lname);

		        ps.setString(3, email);

		        ps.setString(4,ph);

		        ps.setString(5,passwd);

		        ps.executeUpdate();

		        PrintWriter out=res.getWriter();

		        out.println("<marquee><h1> Registration  Success</marquee>");

		    }

		    catch(ClassNotFoundException e) {

		        e.printStackTrace();

		    }

		    catch(SQLException e)

		    {

		        e.printStackTrace();

		    }

		}

		}

		 


