
package edu.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ThirdServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		String username1=(String)session.getAttribute("username1");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("Username retrieved from session2:"+username1);	
	}

}