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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		session.removeAttribute("uname");
//		session.setAttribute("test", "Hello");
//		session.setMaxInactiveInterval(0);
		
//		Cookie c[] = request.getCookies();
//		
//		for(Cookie reqCookie: c)
//		{
////			if(reqCookie.getName().equals("cookie1"))
//			response.getWriter().println(reqCookie.getValue()+" "+reqCookie.getName());
//		}
		
//		response.getWriter().println(request.getParameter("data")+" "+request.getParameter("myname"));
		
//		ServletContext context = getServletContext();
//		context.setAttribute("test", "Hello");
		
		Cookie c3 = new Cookie("cookie3", "CCC");
		response.addCookie(c3);
		RequestDispatcher rd = request.getRequestDispatcher("thirdServlet");
		rd.forward(request, response);
		
	}

}
