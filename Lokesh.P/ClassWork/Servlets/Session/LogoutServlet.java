package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		PrintWriter out=res.getWriter();
		out.println("<html>\r\n"
				+ "	<head>\r\n"
				+ "		<meta charset=\"UTF-8\">\r\n"
				+ "<title>Logout</title>\r\n"
				+ "	</head>\r\n"
				+ "	<body>\r\n"
				+ "		<h2>Logout Successful</h2>\r\n"
				+ "		<p>You have been SUCCESSFULLY LOGGED OUT</p>\r\n"
				+ "	</body>\r\n"
				+ "</html>");
	}


}
