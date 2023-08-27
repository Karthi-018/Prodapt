package Calculatorr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calcul extends HttpServlet{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String n1= req.getParameter("n1");
        String n2=req.getParameter("n2");
        String n=req.getParameter("opr");
        int num1=Integer.parseInt(n1);
        int num2=Integer.parseInt(n2);
        int result=0;
        switch(n) {

        case "add":
        	result=(num1+num2);
        	break;
        case "sub":
        	result=(num1-num2);
        	break;
        case "mul":
        	result=(num1*num2);
        	break;
        case "div":
        	result=(num1/num2);
        	break;
        }

        PrintWriter out=res.getWriter();
        //out.println(result);
        out.println("<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n"
        		+ "<title>BASIC CALCULATOR</title>\r\n"
        		+ "</head>\r\n"
        		+ "	<center>\r\n"
        		+ "	BASIC CALCULATOR OPERATIONS\r\n"
        		+ "	<br>\r\n"
        		+ "<form action=\"./calculator\">\r\n"
        		+ "	<label>Enter number 1</label>\r\n"
        		+ "<input type=\"text\" name=\"n1\" placeholder=\"Enter number 1\" ><BR>\r\n"
        		+ "	<label>Enter number 2</label>\r\n"
        		+ "<input type=\"text\" name=\"n2\" placeholder=\"Enter number 2\">\r\n"
        		+ "<BR><BR>\r\n"
        		+ "<input type=\"radio\"  name=\"opr\" value=\"add\">\r\n"
        		+ "ADD\r\n"
        		+ "<BR>\r\n"
        		+ "<input type=\"radio\"  name=\"opr\" value=\"sub\">\r\n"
        		+ "SUB\r\n"
        		+ "<BR>\r\n"
        		+ "<input type=\"radio\"  name=\"opr\" value=\"mul\">\r\n"
        		+ "<label>MUL</label>\r\n"
        		+ "<BR>\r\n"
        		+ "<input type=\"radio\"  name=\"opr\" value=\"div\">\r\n"
        		+ "<label>DIV</label>\r\n"
        		+ "<BR><br>\r\n"
        		+ "<input type=\"submit\" value=\"Calculate\">\r\n"
        		+ "<input type=\"reset\" value=\"Reset\">"
        		+ "</form>\r\n"+result
        		+ "</body>\r\n"
        		+ "</html>"
        		);
        

         

    }


}
