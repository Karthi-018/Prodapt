package edu.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Square extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int k =(int)req.getAttribute("k");			//type casting and then getting the value from addServ to Square
		
		k=k*k;
		
		PrintWriter out =res.getWriter();
		out.println("hello the sq is "+k);
	}
}
