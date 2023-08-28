package edu.io.labs;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

public class Calci extends HttpServlet
{
	public void process(HttpServletRequest req,HttpServletResponse res) throws IOException  
	{
	      String num1=req.getParameter("Number1");
	      String num2=req.getParameter("Number2");
	      String op=req.getParameter("op");
	      int Number1=Integer.parseInt(num1);
	      int Number2=Integer.parseInt(num2);  
	      PrintWriter out =res.getWriter();
	      String result = null ;
	      switch(op) {
	      case "add":
	    	  result="Addition: "+(Number1+Number2);
	    	  break;
	      case "sub":
	    	 result="Subtract: "+(Number1-Number2);
	    	 break;
	      case "mul":
	    	  result="Multiply: "+(Number1*Number2);
	    	  break;  
	      case "div":
	    	  result="Division: "+(Number1/Number2);
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
	      		+ "<marquee><h1>Hi Welcome</h1></marquee>\r\n"
	      		+ "<form action=\"./myName\">\r\n"
	      		+ "<input type=\"text\" name=\"Number1\" value=\"\" placeholder=\"Enter Number\"><br>\r\n"
	      		+ "<input type=\"text\" name=\"Number2\" value=\"\" placeholder=\"Enter Number\"><br>\r\n"
	      		+ "<lable>ADD</lable>\r\n"
	      		+ "<input type=\"radio\" name=\"op\" value=\"add\">\r\n"
	      		+ "<lable>SUB</lable>\r\n"
	      		+ "<input type=\"radio\" name=\"op\" value=\"sub\">\r\n"
	      		+ "<lable>MUL</lable>\r\n"
	      		+ "<input type=\"radio\" name=\"op\" value=\"mul\">\r\n"
	      		+ "<lable>DIV</lable>\r\n"
	      		+ "<input type=\"radio\" name=\"op\" value=\"div\">\r\n"
	      		+ "<br>\r\n"
	      		+ result
	      		+ "<br><input type=\"submit\" value=\"CALCULATE\">\r\n"
	      		+ "<input type=\"reset\" value=\"RESET\">\r\n"
	      		+ "</form>\r\n"
	      		+ "</center>\r\n"
	      		+ "</body>\r\n"
	      		+ "</html>");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		process(req,res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		process(req,res);
	}
}
