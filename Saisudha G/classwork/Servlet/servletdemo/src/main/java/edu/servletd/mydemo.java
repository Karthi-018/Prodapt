package edu.servletd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mydemo extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException  {
		String uname=req.getParameter("username");
		
		//res.getWriter().println("<h1> Hi Hello Welcome "+uname+" to J2EE World </h1>");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<b><i> Hi Hello"+uname+"</i></b>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	/*
	 * public void goGet(HttpServletRequest req , HttpServletResponse res) throws
	 * IOException{ process(req,res); }
	 */
	
	/*
	 * public void goPost(HttpServletRequest req , HttpServletResponse res) throws
	 * IOException{ process(req,res); }
	 */
	
	

}
