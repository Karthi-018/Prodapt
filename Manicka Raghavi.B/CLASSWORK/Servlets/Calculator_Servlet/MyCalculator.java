package jspcalculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCalculator extends HttpServlet
{
	public void process(HttpServletRequest req,HttpServletResponse rep) throws IOException
	{
		String number1=req.getParameter("n1"); 
		String number2=req.getParameter("n2");
		String symbol=req.getParameter("opr"); 
		
		int n1=Integer.parseInt(number1);
		int n2=Integer.parseInt(number2); 
		char calc=symbol.charAt(0); 
		
		String result=null; 
		PrintWriter pw=rep.getWriter();
		
		switch(calc)
		{
		case '+' : result="Addition of 2 numbers: "+(n1+n2);
		           break; 
		           
		case '-' : result="Subraction of 2 numbers: "+(n1-n2);
                   break;
                   
		case '*' : result="Mulitplication of 2 numbers: "+(n1*n2);
                   break;
                   
		case '/' : result="Division of 2 numbers: "+(n1/n2);
                   break;
		}  
		
		pw.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<center><b><i>\r\n"
				+ "<h1>WELCOME TO CALCULATOR</h1>\r\n"
				+ "</i></b></center>\r\n"
				+ "<form action =\"./myCalc\" method=\"get\">\r\n"
				+ "<center>\r\n"
				+ "<label>Enter num 1</label>\r\n"
				+ "<br>\r\n"
				+ "<input type = \"text\" name =\"n1\" value=\"\" placeholder=\"Enter num1\">\r\n"
				+ "<br>\r\n"
				+ "<label>Enter num 2</label>\r\n"
				+ "<br>\r\n"
				+ "<input type = \"text\" name =\"n2\" value=\"\" placeholder=\"Enter num2\">\r\n"
				+ "<br>\r\n"
				+ "<br>\r\n"
				+ "<br>\r\n"
				+ "<input type=\"radio\" name = \"opr\" value=\"+\">ADD\r\n"
				+ "<br>\r\n"
				+ "<input type=\"radio\" name = \"opr\" value=\"-\">SUB\r\n"
				+ "<br>\r\n"
				+ "<input type=\"radio\" name = \"opr\" value=\"*\">MUL\r\n"
				+ "<br>\r\n"
				+ "<input type=\"radio\" name = \"opr\" value=\"/\">DIV\r\n"
				+ "<br>\r\n"
				+ "<input type=\"submit\" value=\"CALCULATE\">  \r\n"
				+ "\r\n"
				+ "<input type=\"reset\" value=\"RESET\"> \r\n"
				+ "\r\n"
				+ "</center>\r\n"
				+ "</form>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");		
		pw.println("<html><body><center>"+result+"</center></body></html>");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse rep)throws IOException 
	{
		process(req,rep);
	} 
	
	public void doPost(HttpServletRequest req,HttpServletResponse rep)throws IOException 
	{
		process(req,rep);
	}

}
