package edu.practice;

import java.io.*;

import javax.servlet.http.*;

public class Addition extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter out = res.getWriter();
		out.println("The result is "+(i+j));
		
	}

}
