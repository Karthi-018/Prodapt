package edu.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet

{

    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException

    {

        //String username = req.getParameter("MyName");
         
        PrintWriter out = res.getWriter();
        

        String choice = req.getParameter("operator");

        

        int n1 = Integer.parseInt(req.getParameter("number1"));

        int n2 = Integer.parseInt(req.getParameter("number2"));

        String result =null;

        switch(choice)

        {

            case "add":

                result="Sum is "+(n1+n2);

                break;

            case "sub":

                result="Difference is "+(n1-n2);

                break;

            case "mul":

                result="Product is "+(n1*n2);

                break;

            case "div":

                result="Quotient is "+(n1/n2);

                break;    

        }

        

        out.println("<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n"
        		+ "<title>Calculator</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "	\r\n"
        		+ "	<form method=\"get\" action=\"./myName\"> \r\n"
        		+ "	<center>\r\n"
        		+ "	<pre>\r\n"
        		+ "	<label> Enter number 1 </label>\r\n"
        		+ "	<input type=\"number\" name=\"number1\" placeholder=\"Enter Number 1\" >\r\n"
        		+ "	<br>\r\n"
        		+ "	<label> Enter number 2 </label>\r\n"
        		+ "	<input type=\"number\" name=\"number2\" placeholder=\"Enter Number 2\" >\r\n"
        		+ "	<br>\r\n"
        		+ "<input type=\"radio\" name=\"operator\" value=\"add\"> ADD\r\n"
        		+ "<input type=\"radio\" name=\"operator\" value=\"sub\" > SUB\r\n"
        		+ "<input type=\"radio\" name=\"operator\" value=\"mul\" > MUL\r\n"
        		+ "<input type=\"radio\" name=\"operator\" value=\"div\" > DIV\r\n"
        		+ "<br>\r\n"
        		+ "<input type=\"submit\" value = \"Calculate\">\r\n"
        		+ "<br>\r\n"
        		+ "<input type=\"reset\" value =\"Reset\">\r\n"
        		+ "</pre>\r\n"
        		+ "</center>\r\n"
        		+ "</form>\r\n"
        		+ "     \r\n"
        		+ "</body>\r\n"
        		+ "</html>"+"<center>"+result);

    }

 

}