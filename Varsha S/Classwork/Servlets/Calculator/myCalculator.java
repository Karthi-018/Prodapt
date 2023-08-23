package calculator.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myCalculator extends HttpServlet
{
	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String number1 = req.getParameter("n1");
		String number2 = req.getParameter("n2");
		String operation = req.getParameter("op");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int result = 0;
		
		switch(operation)
		{
		case "addition" : result = (num1+num2);
		break;
		
		case "subtraction" : result = (num1-num2);
		break;

		case "multiplication" : result = (num1*num2);
		break;
		
		case "division" : result = (num1/num2);
		break;
		
		}
		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h3>CALCULATOR</h3>\r\n"
				+ "<form action = \"./Name\" method = \"post\">\r\n"
				+ "	\r\n"
				+ "	<center><label> NUMBER 1 </label><input type=\"text\" name=\"n1\" value=\"\" placeholder=\"Enter number 1\" ></center><br><br>\r\n"
				+ "	<center><label> NUMBER 2 </label><input type=\"text\" name=\"n2\" value=\"\" placeholder=\"Enter number 2\" ></center><br><br>\r\n"
				+ "    \r\n"
				+ "    <center><input type=\"radio\" name=\"op\" value=\"addition\"><label>Addition</label></center><br>\r\n"
				+ "	<center><input type=\"radio\" name=\"op\" value=\"subtraction\"><label>Subtraction</label></center><br>\r\n"
				+ "	<center><input type=\"radio\" name=\"op\" value=\"multiplication\"><label>Multiplication</label></center><br>\r\n"
				+ "	<center><input type=\"radio\" name=\"op\" value=\"division\"><label>Division</label></center><br>\r\n"
				+ "	\r\n"
				+ "	<center><input type = \"submit\" value = \"Click\"></center><br>\r\n"
				+ "	<center><input type = \"reset\" value = \"Reset\"></center>\r\n"
				+ "	\r\n"
				+ "</form>\r\n"
				+ result
				+ "</body>\r\n"
				+ "</html>");
		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req,res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req,res);
	}
}




