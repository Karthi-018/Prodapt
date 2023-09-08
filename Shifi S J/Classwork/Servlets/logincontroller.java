package edu.training.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass=request.getParameter("pass");
		if(name.equalsIgnoreCase("Admin"))
		{
			if(pass.equals("reset@123")) 
			{
				request.setAttribute("name", pass);
				request.getRequestDispatcher("AdminHome.jsp").include(request, response);

			}
			else {
				response.setContentType("text/html");
				response.getWriter().write("Invalid Password");
				request.getRequestDispatcher("Login.jsp").include(request, response);
								
			}
		}
		else 
		{
			response.setContentType("text/html");
			response.getWriter().write("Invalid username");
			request.getRequestDispatcher("Login.jsp").include(request, response);
							
		}
	}
}