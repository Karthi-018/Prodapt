package edu.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{		
		res.getWriter().write("Welcome "+req.getParameter("name"));
	}
}
