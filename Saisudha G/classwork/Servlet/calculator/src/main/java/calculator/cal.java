package calculator;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cal extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException  {
		String n1=req.getParameter("number1");
		String n2=req.getParameter("number2");
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		PrintWriter out=res.getWriter();
		String result=null;
		String opr1=req.getParameter("opr");
		switch(opr1){
        case "ADD":
        	result="Addition of two numbers is"+(num1+num2);
            
        break;
        case "SUB":
        result="Subtraction of two numbers is:"+(num1-num2);
        break;
        case "MUL":
        	result="Multiplication of two numbers is:"+(num1*num2);
        break;
        case "DIV":
        	result="Division of two numbers is:"+(num1/num2);
        break;
    }
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<center>\r\n"
				+ "	<h1> HELLO WELCOME TO CALCULATOR</h1>\r\n"
				+ "	<form action =\"./calcu\">\r\n"
				+ "	<input type=\"text\" name=\"number1\" value=\"\" placeholder=\"Enter Number1\"/>\r\n"
				+ "	<br>\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"text\" name=\"number2\" value=\"\" placeholder=\"Enter Number2\"/>\r\n"
				+ "	<br>\r\n"
				+ "	<input type=\"radio\" name=\"opr\" value=\"ADD\"><label>ADD</label>\r\n"
				+ "    <input type=\"radio\" name=\"opr\" value=\"SUB\"><label>SUB</label>\r\n"
				+ "    <input type=\"radio\" name=\"opr\" value=\"MUL\"><label>MUL</label>\r\n"
				+ "    <input type=\"radio\" name=\"opr\" value=\"DIV\"><label>DIV</label>\r\n"
				+ "    <br>\r\n"
				+ "	<input type=\"submit\" value=\"SUBMIT\"/> \r\n"
				+ "	<input type=\"reset\" value=\"RESET\"/> \r\n"
				+ "	\r\n"
				+ "	\r\n"
				+ "</form>\r\n"+result
				+ "</center>\r\n"
				+ "</body>\r\n"
				+ "</html>");

	
}
}
