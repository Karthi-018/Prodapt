package arun.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arun.model.Customer;
import arun.service.RegisterService;

@WebServlet("/register")
public class RegisterController extends HttpServlet{
	private RegisterService registerService;
	ServletContext context;
	public void init() {
		registerService = new RegisterService();
		context = getServletContext();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		try {
			int id =  Integer.parseInt(req.getParameter("id"));
			String name =  req.getParameter("name");
			String email =  req.getParameter("email");
			String password = req.getParameter("password");
			String phone =  req.getParameter("phone");
			
			Customer c = registerService.save(new Customer(id,name,email,password,phone),context);
			if(c!=null) {
				res.sendRedirect("Login.jsp");
			}
			else {
				res.sendRedirect("Register.jsp");
			}
		}
		catch(IOException e) {
			res.getWriter().println("Cant add ");
		}
		
	}
}
