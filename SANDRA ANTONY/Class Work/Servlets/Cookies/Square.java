package edu.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.*;

public class Square extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k=0;
		Cookie cookies[]=req.getCookies();                //all the cookies
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))						//cookie name==k
				k=Integer.parseInt(c.getValue());
		}
		

		//int k =Integer.parseInt(req.getParameter("k")); 
		//HttpSession session=req.getSession(); 
		//ServletContext sc=getServletContext();
		//type casting and then getting the value from addServ to Square
		
		k=k*k;
		
		PrintWriter out =res.getWriter();
		out.println("hello the sq is "+k);
	}
}
