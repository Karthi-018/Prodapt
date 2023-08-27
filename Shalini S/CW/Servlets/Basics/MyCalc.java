package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCalc extends HttpServlet {
	public void process(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String num1=req.getParameter("n1");
		String num2=req.getParameter("n2");
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int r=0;
		PrintWriter out=res.getWriter();
		String op=req.getParameter("op");
		
		switch(op) {
		case"add":r=(n1+n2);
		          break;
		case"sub":r=(n1-n2);
		          break;
		case"mul":r=(n1*n2);
		          break;
		case"div":r=(n1/n2);
		          break;
		}
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>Hi Welcome to PRODAPT</h1>\r\n"
				+ "<form action=\"./myName\" method=\"get\">\r\n"
				+ "	<label>1)</label><input type=\"text\" name=\"n1\" value=\""+n1+"\" placeholder=\"Enter Number1\"/><br>\r\n"
				+ "	<label>2)</label><input type=\"text\" name=\"n2\" value=\""+n2+"\" placeholder=\"Enter Number2\"/>\r\n"
				+ "	<br>\r\n"
				+ "	<p>Select any one of the following operations</p>\r\n"
				+ "	<input type=\"radio\" name=\"op\" value=\"add\" /><label>Addition</label>\r\n"
				+ "	<input type=\"radio\" name=\"op\" value=\"sub\" /><label>Subtraction</label>\r\n"
				+ "	<input type=\"radio\" name=\"op\" value=\"mul\" /><label>Multiplication</label>\r\n"
				+ "	<input type=\"radio\" name=\"op\" value=\"div\" /><label>Division</label>\r\n"
				+ "	<br>	\r\n"
				+ "	<input type=\"submit\" value=\"Click Me\"/>\r\n"
				+ "</form>\r\n"
				+r
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		process(req,res);
	};
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		process(req,res);
	}
	

}
