package edu.training.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username,password;
		username=request.getParameter("username");
		password=request.getParameter("password");
		if(username.equals("admin@123") && password.equals("reset@123")) {
			request.getRequestDispatcher("Admin_home.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("Homepage.jsp").forward(request, response);
		}
		
	}

}
