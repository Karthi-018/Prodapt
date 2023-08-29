package edu.ialabs;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class My_Demo extends HttpServlet{
	public void process(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String num1=req.getParameter("n1");
		String num2=req.getParameter("n2");
        String operator = req.getParameter("opr");
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int output=calculate(n1,n2,operator);
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
        out.println("<!DOCTYPE html>\r\n"
    			+ "<html>\r\n"
    			+ "<head>\r\n"
    			+ "<meta charset=\"ISO-8859-1\">\r\n"
    			+ "<title>Insert title here</title>\r\n"
    			+ "</head>\r\n"
    			+ "<body>\r\n"
    			+ "Simple Calculator \r\n"
    			+ "<form action=\"./CalculatorServlet\" method=\"get\">\r\n"
    			+ "	<label>Number 1</label>\r\n"
    			+ "	<input type=\"text\" name=\"n1\" value=\"\" placeholder=\"Enter number 1\"><br><br>\r\n"
    			+ "	<label>Number 2</label>\r\n"
    			+ "	<input type=\"text\" name=\"n2\" value=\"\" placeholder=\"Enter number 2\"><br><br>\r\n"
    			+ "    <input type=\"radio\" name=\"opr\" value=\"add\">\r\n"
    			+ "        <label>Add</label><br>	\r\n"
    			+ "    <input type=\"radio\" name=\"opr\" value=\"sub\">\r\n"
    			+ "        <label>Sub</label><br>	\r\n"
    			+ "    <input type=\"radio\" name=\"opr\"  value=\"mul\">\r\n"
    			+ "        <label>Div</label><br>	\r\n"
    			+ "    <input type=\"radio\" name=\"opr\" value=\"div\">\r\n"
    			+ "        <label>Mul</label><br>\r\n"
    			+output+ " <br>     <input type=\"submit\" value=\"calculate\">\r\n"
    			+ "     <input type=\"reset\" value=\"reset\">\r\n"
    			+ "    \r\n"
    			+ "</form>\r\n"
    			+ "</body>\r\n"
    			+ "</html>");

	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		process(req,res);
	}
		static int calculate(int n1, int n2, String opr) {
        switch (opr) {
            case "add":
                return n1 + n2;
            case "sub":
                return n1 - n2;
            case "mul":
                return n1 * n2;
            case "div":
                return n1 / n2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
		}
	
	
	
	
}
