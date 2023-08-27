package FirstServlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDemo extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname = req.getParameter("UserName"); 
		
		res.getWriter().println("HI HELLO " + uname + " to FIRST SERVLET");
	//System.out.println("HI HELLO " + name + " to FIRST SERVLET");
	}
}
