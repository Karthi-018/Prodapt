package edu.ialabs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDemo extends HttpServlet
{
	//public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	public void process(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String num1 = req.getParameter("n1");
		String num2 = req.getParameter("n2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
	
		String opr=req.getParameter("opr");
		String result = null;
		
		switch(opr)
		{
		case "add": result="Sum of two numbers is: "+(n1+n2); break;
		case "sub": result="Sub of two numbers is: "+(n1-n2); break;
		case "mul": result="Mul of two numbers is: "+(n1*n2); break;
		case "div": result="Div of two numbers is: "+(n1/n2); break;
		case "mod": result="Mod of two numbers is: "+(n1%n2); break;
		}
		
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1><center>Calculator </center></h1>\r\n"
				+ "<form action =\"./myName\" method=\"get\">\r\n"
				+ "	<center>\r\n"
				+ "	<label>Number 1</label> <input type=\"text\" name=\"n1\" placeholder=\"Enter Number 1\">\r\n"
				+ "	<label>Number 2</label> <input type=\"text\" name=\"n2\"  placeholder=\"Enter Number 2\"> <br><br>\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"add\"> ADD\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"sub\"> SUB\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"mul\"> MUL\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"div\"> DIV\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"mod\"> MOD <br><br>\r\n"
				+ "	<input type=\"submit\" value=\"Calculator\"><input type=\"reset\" value=\"Reset\">\r\n"
				+ "	</center>\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>"+"<br>"+"<center>"+result+"</center>");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
	{
		
		try 
		{
			process(req,res);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		
		
		
//		String uName=req.getParameter("userName");
//		res.getWriter();
//		res.getWriter().println("<h1>The sum is "+()+"</h1>");
//		res.getWriter().println("<h1> thank you "+uName+" visit again </h1>");
	}
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uName=req.getParameter("userName");
		res.getWriter();
		res.getWriter().println("<h1>Hi hello "+uName+" welcome to My page </h1>");
		res.getWriter().println("<h1> thank you "+uName+" visit again </h1>");
	}
}
