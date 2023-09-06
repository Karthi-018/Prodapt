package servlet.demos.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EntryPageControl
 */
@WebServlet("/entrypage")
public class EntryPageControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String value=request.getParameter("opr");
		if(value.equals("login"))
		{   response.setContentType("text/html");
			response.getWriter().println("<h3 style=\"color:Green;\" align=\"center\">log in to enjoy the services</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		else if(value.equals("register"))
		{
			response.setContentType("text/html");
			 response.getWriter().println("<h3 style=\"color:Green;\" align=\"center\">register to get unlimited offers</h3>");
			 RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.include(request, response);

		}
		else
		{
			response.setContentType("text/html");
			response.getWriter().println("<h3 style=\"color:Green;\" align=\"center\">login to go......</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
