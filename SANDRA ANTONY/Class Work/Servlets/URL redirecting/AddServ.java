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
		
		
		PrintWriter out=res.getWriter();                   //AddServ
		out.println("Result is"+k);
		
		req.setAttribute("k",k);                      	//sending "data" of addServ to square
		
		RequestDispatcher rd= req.getRequestDispatcher("sq");            //redirecting it to Square servlet
		rd.forward(req, res);
		
		res.sendRedirect("sq?sum="+k);
		
		

		
	}
	
}
