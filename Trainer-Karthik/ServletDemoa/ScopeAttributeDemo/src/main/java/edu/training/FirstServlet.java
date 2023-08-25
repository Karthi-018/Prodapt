package edu.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
		ServletContext context = getServletContext();
		context.setAttribute("uname", request.getParameter("uname"));
		
//		response.sendRedirect("http://www.google.com/search?q="+request.getParameter("uname"));
		
		Cookie c = new Cookie("cookie1", request.getParameter("uname"));
		response.addCookie(c);
		
		Cookie c1 = new Cookie("cookie2", "AAA");
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("cookie3", "BBB");
		response.addCookie(c2);
		
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
		rd.forward(request, response);
		
		
		
	}

}
