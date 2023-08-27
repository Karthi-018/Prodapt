package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet
{
	public void process(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
	String num1=req.getParameter("n1");//html input type name will be this parameter
	String num2=req.getParameter("n2");
	String op=req.getParameter("opr");
	int number1=Integer.parseInt(num1);
	int number2=Integer.parseInt(num2);
	PrintWriter out=res.getWriter();
	out.println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"ISO-8859-1\">\r\n"
			+ "<title>Insert title here</title>\r\n"
			+ "\r\n"
			+ "</head>\r\n"
			+ "<body><center>\r\n"
			+ "<h1>Calculator</h1>\r\n"
			+ "<form action=\"./name\" method=\"get\"><!--action attr give servlet name data sent to server-->\r\n"
			+ "<!--<input type=\"text\" name=\"UserName\" values=\"\" placeholder=\"Enter your name\"/>name same as req parameter --> \r\n"
			+ "<!--<input type=\"submit\" value=\"click\"/>value atrr empty it give empty button-->\r\n"
			+ "<label>Number1:</label><input type=\"text\" name=\"n1\" values=\"\" placeholder=\"number1\"/><br><br>\r\n"
			+ "<label>Number2:</label><input type=\"text\" name=\"n2\" values=\"\" placeholder=\"number2\"/><br><br>\r\n"
			+ "<input type=\"radio\" name=\"opr\" value=\"add\"/>add\r\n"
			+ "<br>\r\n"
			+ "<input type=\"radio\" name=\"opr\" value=\"sub\"/>sub\r\n"
			+ "<br>\r\n"
			+ "<input type=\"radio\" name=\"opr\" value=\"mul\"/>mul\r\n"
			+ "<br>\r\n"
			+ "<input type=\"radio\" name=\"opr\" value=\"div\"/>div\r\n"
			+ "<br>\r\n"
			+ "<input type=\"submit\" value=\"calculate\"/>\r\n"
			+ "<input type=\"reset\" value=\"reset\"/>\r\n"
			+ "</form>\r\n"
			+ "\r\n"
			+ "</center>\r\n"
			+ "</body>\r\n"
			+ "</html>\r\n"
			+ "");
	switch(op)
	{
	case "add":
		out.println("<html>");
		out.println("<body>");
		out.printf("<center>The addition of two number is<h3>"+(number1+number2)+"</h3></center>");//web page print
		out.println("</html>");
		out.println("</body>");
		break;
	case "sub":
		out.println("<html>");
		out.println("<body>");
		out.println("<center>The subtraction of two numbers is<h3>"+(number1-number2)+"</h3></center>");//web page print
		out.println("</html>");
		out.println("</body>");
		break;
	case "mul":
		out.println("<html>");
		out.println("<body>");
		out.println("<center>The multiplication of two number is<h3>"+(number1*number2)+"</h3></center>");//web page print
		out.println("</html>");
		out.println("</body>");
		break;
	case "div":
		out.println("<html>");
		out.println("<body>");
		out.println("<center>the division of two number is<h3>"+(number1/number2)+"</h3></center>");//web page print
		out.println("</html>");
		out.println("</body>");
		break;
	}
	
	/*res.getWriter().println("HI HELLO WELCOME "+uName+" J2EE SERVLET");//web page print
	  System.out.println("HI HELLO WELCOME "+uName+" J2EE");//console print
	out.println("<html>");
	out.println("<body>");
	out.println("<h1>HI HELLO WELCOME "+uName+" J2EE SERVLET</h1>");//web page print
	out.println("</html>");
	out.println("</body>");
	
	out.println("<html>");
	out.println("<body>");
	out.println("<h3>Addition of two numbers </h3>"+(number1+number2));
	out.println("<h3>subtraction of two numbers </h3>"+(number1-number2));
	out.println("<h3>Multiplication of two numbers </h3>"+(number1*number2));
	out.println("<h3>Division of two numbers </h3>"+(number1/number2));////web page print
	out.println("</html>");
	out.println("</body>");*/
	
	}
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	process(req,res);
	}
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
{
process(req,res);
}
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
{
process(req,res);
}

}
