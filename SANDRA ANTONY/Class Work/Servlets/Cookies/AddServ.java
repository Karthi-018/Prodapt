package edu.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServ extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2")); 
		//HttpSession session=req.getSession(); 
		
		int k=i+j;
		
		Cookie cookie=new Cookie("k",k+"String");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
		//PrintWriter out=res.getWriter();                                    //AddServ
		//out.println("Result is"+k);
	
		//session.setAttribute("sum",k);                       	            //sending "data" of addServ to square
		
		//RequestDispatcher rd= req.getRequestDispatcher("sq");            //redirecting it to Square servlet
		//rd.forward(req, res);
		
		//res.sendRedirect("sq?k="+k+"&name=sandra");
		
		

		
	}
	
}
