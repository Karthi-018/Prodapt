package edu.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCalc extends HttpServlet
{ 	
	public void process(HttpServletRequest req,HttpServletResponse res)throws IOException{
		String num1=req.getParameter("n1");
		String num2=req.getParameter("n2");
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		String op=req.getParameter("option");
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<center><h1>Hi Hello Welcome to Basic Calculator</h1>\r\n"
				+ "<!--<form action=\"./Name\" method=\"post\"> public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException-->\r\n"
				+ "	<!--<form action=\"./Name\" method=\"get\">-->\r\n"
				+ "	<form action=\"./Name\" method=\"post\">\r\n"
				+ "	<p><label>Enter the number 1</label><input type=\"text\" name=\"n1\"  value=\"\" placeholder=\"Enter N1 Value\"/><br>\r\n"
				+ "	<p><label>Enter the number 2</label><input type=\"text\" name=\"n2\"  value=\"\" placeholder=\"Enter N2 Value\"/><br>\r\n"
				+ "	<p><input type=\"radio\"  name=\"option\" value=\"+\"/>ADD\r\n"
				+ "	<input type=\"radio\" name=\"option\" value=\"-\"/>SUB\r\n"
				+ "	<input type=\"radio\" name=\"option\" value=\"*\"/>MUL\r\n"
				+ "	<input type=\"radio\" name=\"option\" value=\"/\"/>DIV</p>\r\n"
				+ "	<p><input type=\"submit\" value=\"submit\" />\r\n"
				+ "	<input type=\"reset\" value=\"reset\"/><br>\r\n"
				+ "</form>\r\n"
				+ "</center>\r\n"
				+ "</body>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		if(op.equals("+"))
		{
			//out.println(String.format("<center>Addition:%d</center>"+(a+b)));
			out.printf("<center>Addition:%d+%d=%d</center>", a, b, (a+b));
	}
		else if(op.equals("-")) {
			out.printf("<center>Subtraction:%d</center>",(a-b));
		}
		else if(op.equals("*")) {
			out.println(String.format("<center>Multiplication:%d</center>", (a*b)));
		}
		else if(op.equals("/"))
		{
			out.printf("<center>Division:%d</center>",(a/b));
		}
	
	}
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	
		process(req,res);
	
	/*
	 * System.out.println("Hi Hello welcome "+uName+" to J2EE World");
	 * res.getWriter().println("Hi Hello welcome "+uName+" to J2EE World");
	 */
		
	}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
	process(req,res);
}

}
