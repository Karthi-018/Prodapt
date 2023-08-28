package Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class myCalc extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		process(req,res);
	}
	public void process(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
		String num1 = req.getParameter("n1");
		String num2 = req.getParameter("n2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		PrintWriter out = res.getWriter();
		String result = null;
		String opr =req.getParameter("opr");
		switch(opr)
		{
		case "ADD" :
			result = "The addition of 2 numbers is = "+(n1+n2);
			break;

		case "SUB" :
			result = "The subtraction of 2 numbers is = "+(n1-n2);
			break;

		case "MUL" :
			result = "The multiplication of 2 numbers is = "+(n1*n2);
			break;

		case "DIV" :
			result = "The division of 2 numbers is = "+(n1/n2);
			break;
		}
		
		//res.getWriter().println(result);
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<form action=\"./myName\" method=\"post\">\r\n"
				+ "<center>	\r\n"
				+ "	<label>Enter num 1</label><br>\r\n"
				+ "	<input type = \"text\" name =\"n1\" value=\"\" placeholder=\"Enter num1\">\r\n"
				+ "</center>\r\n"
				+ "<br>\r\n"
				+ "<br>\r\n"
				+ "<center>	\r\n"
				+ "	<label>Enter num 2</label><br>\r\n"
				+ "	<input type = \"text\" name =\"n2\" value=\"\" placeholder=\"Enter num2\">\r\n"
				+ "</center>	\r\n"
				+ "<br>\r\n"
				+ "<br>\r\n"
				+ "<center>\r\n"
				+ "	<input type=\"radio\" name = \"opr\" value=\"ADD\">ADD\r\n"
				+ "	\r\n"
				+ "	<input type=\"radio\" name = \"opr\" value=\"SUB\">SUB\r\n"
				+ "	\r\n"
				+ "	<input type=\"radio\" name = \"opr\" value=\"MUL\">MUL\r\n"
				+ "	\r\n"
				+ "	<input type=\"radio\" name = \"opr\" value=\"DIV\">DIV\r\n"
				+ "	<br><br>\r\n"
				+result+ "<br>	<input type=\"submit\" value=\"CALCULATE\"><input type=\"reset\" value =\"RESET\">\r\n"
				+ "	\r\n"
				+ "</center>	\r\n"
				+ "</form>	\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
}
