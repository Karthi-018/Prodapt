package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet
{

	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String num1 = req.getParameter("Number 1");
		String num2 = req.getParameter("Number 2");
		String sym = req.getParameter("Symbol");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		//String s = String.valueOf(sym);
		//String s = 
		PrintWriter out = res.getWriter();
		//out.println("<h1>Hello " +uname+ ", Welcome To Calculator!!</h1>");
		//out.println("<h1>Thank you for using our page.</h1>");
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<center>\r\n"
				+ "<h1>WELCOME TO CALCULATOR!!</h1>\r\n"
				+ "<form action=\"./Name\" method=\"post\">  \r\n"
				+ "<label>1ST NUMBER </label>                            <!--submits info to server-->\r\n"
				+ "<input type =\"text\" name=\"Number 1\" placeholder=\"Enter First Number\"/> <br><br>\r\n"
				+ "\r\n"
				+ "<label>2ND NUMBER </label> \r\n"
				+ "<input type =\"text\" name=\"Number 2\" placeholder=\"Enter First Number\"> <br><br>\r\n"
				+ "\r\n"
				+ "<label>OPERATION </label> <br><br>\r\n"
				+ "<input type=\"radio\" name=\"Symbol\" value=\"Add\"/> ADD\r\n"
				+ "<input type=\"radio\" name=\"Symbol\" value=\"Subtract\"/> SUBTRACT\r\n"
				+ "<input type=\"radio\" name=\"Symbol\" value=\"Multiply\"/> MULTIPLY\r\n"
				+ "<input type=\"radio\" name=\"Symbol\" value=\"Divide\"/> DIVIDE <br><br>\r\n"
				+ "\r\n"
				+ "<input type=\"submit\" value=\"SUBMIT\">\r\n"
				+ "<input type=\"reset\" value=\"RESET\"><br><br>\r\n" 
				+ "</center>\r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		switch (sym)
		{
		case "Add":
			out.println("<html>");
			out.println("<body>");
			out.println("<center><h3> ANSWER IS "+(n1+n2)+"</h3></center>");
			out.println("</body>");
			out.println("</html>");	
			break;
		case "Subtract":
			out.println("<html>");
			out.println("<body>");
			out.printf("<center><h3> ANSWER IS "+(n1-n2)+"</h3></center>");
			out.println("</body>");
			out.println("</html>");	
			break;
		case "Multiply":
			out.println("<html>");
			out.println("<body>");
			out.println("<center><h3> ANSWER IS "+(n1*n2)+"</h3></center>");
			out.println("</body>");
			out.println("</html>");	
			break;
		case "Divide":
			out.println("<html>");
			out.println("<body>");
			out.println("<center><h3> ANSWER IS "+(n1/n2)+"</h3></center>");
			out.println("</body>");
			out.println("</html>");	
			break;
		default:
			out.println("<html>");
			out.println("<body>");
			out.println("<center><h1> INVALID SYMBOL </center></h1>");
			out.println("</body>");
			out.println("</html>");	
		}
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		process(req,res);
	}
	
	public void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		process(req,res);
	}
}	
	
