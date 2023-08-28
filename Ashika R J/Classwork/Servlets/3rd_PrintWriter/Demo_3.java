package edu.io.labs;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;


public class Demo_3 extends HttpServlet
{public void process(HttpServletRequest req,HttpServletResponse res) throws IOException  {
   String uname=req.getParameter("uName");
    PrintWriter out =res.getWriter();
    out.println("<h1>Hi Hello "+ uname +"Welcome</h1>");
}
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
	process(req,res);
}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
	process(req,res);
}
}