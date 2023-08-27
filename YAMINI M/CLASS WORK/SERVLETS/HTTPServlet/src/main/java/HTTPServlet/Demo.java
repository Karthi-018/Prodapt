package HTTPServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo extends HttpServlet{
	
	public void process(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("UserName");
        PrintWriter out=res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<b><i> hello </b></i>");
        out.println("<body>");
        out.println("<html>");
        out.println("welcome"+uname+"to je22");
        }

    public void doGet(HttpServletRequest req,HttpServletResponse res) 
    {
        try 
        {
			process(req,res);
		} 
        catch (IOException e) 
        {
		
			e.printStackTrace();
		}
    }

    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
        process(req,res);
    }
}


