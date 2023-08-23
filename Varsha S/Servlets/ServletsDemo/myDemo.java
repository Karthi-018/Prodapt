package serverex.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myDemo extends HttpServlet
	{
//		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
//		{
//			String name = req.getParameter("myName");
//			//res.getWriter().println("Hello " +name);
//			res.getWriter().println("<html><body><h2>Heloo " + name + "Welcomeee</h2></body></html>");
//		}
	
	
	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("myName");
		PrintWriter out = res.getWriter();
		//out.println("Hello " +name);
		out.println("<html>");
		out.println("<body>");
		out.println("<h2><i>Heloo " + name + "Welcomeee</i></h2>");
		out.println("</body>");
		out.println("</html>");	
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req, res);
	}
	}

