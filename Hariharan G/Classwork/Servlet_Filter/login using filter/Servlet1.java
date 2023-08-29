package FilterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("Hello");
		out.println("Hello"+" "+req.getSession().getAttribute("first_name")+" "+req.getSession().getAttribute("last_name"));

//		out.println("Hello"+" "+req.getParameter("fn")+" "+req.getParameter("ln"));
		
	}

}
