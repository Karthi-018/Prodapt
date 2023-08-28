package edu.io.labs;
import java.io.IOException;
import javax.servlet.http.*;


public class Demo_1 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException  {
	   String uname=req.getParameter("uName");
       res.getWriter();
       res.getWriter().println("<h1>Hi Hello "+ uname +"Welcome</h1>");
}
}