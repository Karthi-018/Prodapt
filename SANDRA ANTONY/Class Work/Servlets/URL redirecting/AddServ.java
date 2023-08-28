package edu.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServ extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		
		//PrintWriter out=res.getWriter();                               //printing on webserver
		//out.println("Result is"+k);
		
		//req.setAttribute("k",k);                      	               
		
		//RequestDispatcher rd= req.getRequestDispatcher("sq");          //sending "data" of addServ to square
		//rd.forward(req, res);
		
		res.sendRedirect("sq?k="+k);                                 //redirecting it to Square servlet
		
		

		
	}
	
}
