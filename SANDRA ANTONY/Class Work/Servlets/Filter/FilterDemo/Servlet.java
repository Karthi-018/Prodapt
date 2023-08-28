package edu.Filter;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.getWriter().println("Welcome "+req.getParameter("uName"));
	}
}
