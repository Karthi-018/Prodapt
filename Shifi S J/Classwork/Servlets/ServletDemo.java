package edu.demo;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myDemo extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	String myName=req.getParameter("myName");
	//System.out.println("Hi "+myName+" to J2EE");  prints in console
	res.getWriter().println("<h1>My name is "+myName+"</h1>");  //prints in bowser
}

}
