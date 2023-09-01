package edu.training.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomepageController
 */
@WebServlet("/HomepageController")
public class HomepageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
	}


	public void destroy() {
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("hiii");
		String choice=request.getParameter("homepageChoice");
		if(choice.equals("HOME")) {
			request.getRequestDispatcher("Homepage.jsp").forward(request, response);
		}
		else if(choice.equals("REGISTER")) {
			request.getRequestDispatcher("Register.jsp").forward(request, response);

		}
		else if(choice.equals("LOGIN")) {
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}
	}

}
