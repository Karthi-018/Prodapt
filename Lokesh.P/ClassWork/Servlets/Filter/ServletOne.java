package com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=(String) req.getAttribute("name");
		PrintWriter out=res.getWriter();
		out.println("Hello "+ uname + " Login Successfully");
	}
}
