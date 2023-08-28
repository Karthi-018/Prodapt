package edu.io.labs;
import java.io.IOException;
import javax.servlet.http.*;


public class Demo_1 extends HttpServlet
{
	public void Process(HttpServletRequest req,HttpServletResponse res) throws IOException  
	{
	String uName=req.getParameter("userName");
    res.getWriter();
    res.getWriter().println("<h1>Hi Hello "+ uName +"Welcome</h1>");
	}
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	Process(req,res);
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	Process(req,res);
    }
}