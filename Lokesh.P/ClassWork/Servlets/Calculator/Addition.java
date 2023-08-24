package edu.ialabs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		String opt=req.getParameter("opt");
		//int result=0;
		res.setContentType("text/html");
		PrintWriter pr = res.getWriter();
		pr.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<style>\r\n"
				+ "			p{\r\n"
				+ "				text-align: center;\r\n"
				+ "			}\r\n"
				+ "		</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "	<form action=\"calculator\">\r\n"
				+ "		<p><h1>Basic Calculator</h1></center>	</p>\r\n"
				+ "			<p><input type=\"text\" name=\"num1\" placeholder=\"Enter the Number1\" /><br>	</p>\r\n"
				+ "			<p><input type=\"text\" name=\"num2\" placeholder=\"Enter the Number2\" /><br> </p>\r\n"
				+ "		<hr>\r\n"
				+ "			<p><input type=\"radio\" name=\"opt\" value=\"+\">add<br>\r\n"
				+ "		<input type=\"radio\" name=\"opt\" value=\"-\">sub<br>\r\n"
				+ "		<input type=\"radio\" name=\"opt\" value=\"*\">mul<br>\r\n"
				+ "		<input type=\"radio\" name=\"opt\" value=\"/\">divide<br>\r\n"
				+ "		<input type=\"radio\" name=\"opt\" value=\"%\">modulus<br></p>\r\n"
				+ "			<p><input type=\"submit\" />\r\n"
				+ "		<input type=\"reset\" /></p>\r\n"
				+ "		\r\n"
				+ "	\r\n"
				+ "	</form>\r\n"
				+ "	\r\n"
				+ "</body>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		if(opt.equals("+"))
		{
			pr.printf("<center>The sum of two numbers is %d</center> ",(num1+num2));
		}
		else if(opt.equals("-"))
		{
			
			pr.printf("<center>The difference of two numbers is %d</center> ",(num1-num2));
			
		}
		else if(opt.equals("*"))
		{
			pr.printf("<center>The mul of two numbers is %d </center> ",(num1*num2));
			
		}
		else if(opt.equals("/"))
		{
			
			pr.printf("<center>The divide of two numbers is %d  </center>",(num1/num2));
			
		}
		else if(opt.equals("%"))
		{
			
			pr.printf("<center>The remainder of two numbers is %d</center>",(num1%num2));
			
		}
		
		
	}
}
