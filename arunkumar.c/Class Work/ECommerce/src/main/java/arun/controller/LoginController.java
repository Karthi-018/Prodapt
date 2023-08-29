package arun.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arun.service.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	private LoginService loginService;
	ServletContext context;
	public void init() {
		loginService = new LoginService();
		context = getServletContext();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String role = loginService.getRole(req.getParameter("uname"),req.getParameter("pass"),context);
		if(role.equals("admin")) {
			res.sendRedirect("adminpage.jsp");
		}
		else if(role.equals("user")) {
			
		}
		else {
			System.out.println("You are nobody");
		}
	}
}	
