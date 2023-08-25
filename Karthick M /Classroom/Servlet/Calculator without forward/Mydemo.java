package edu.ia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mydemo extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
		String ch=req.getParameter("s");
		int c = 0;
		switch (ch){
		case "add":
			c=a+b;
			break;
		case "sub":
			c=a-b;
			break;
		case "mul":
			c=a*b;
			break;
		case "div":
			c=a/b;
			break;
		}
		Integer.toString(c);
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>CALCULATOR</h1> \r\n"
				+ "<form action=\"./myName\" method=\"post\">\r\n"
				+ "	<input type=\"text\" name=\"a\" value=\"\" placeholder=\"Enter Number 1\">\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"text\" name=\"b\" value=\"\" placeholder=\"Enter Number 2\">\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"radio\" value=\"add\" name=\"s\" >ADD\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"radio\" value=\"sub\" name=\"s\" >SUB\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"radio\" value=\"mul\" name=\"s\" >MUL\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"radio\" value=\"div\" name=\"s\" >DIV\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"submit\" value=\"CALCULATE\">\r\n"
				+ "	<input type=\"reset\" value=\"RESET\">\r\n"
				+ "</form>\r\n"+c
				+ "</body>\r\n"
				+ "</html>");
	}
}
