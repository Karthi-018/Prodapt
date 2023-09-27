package edu.training.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.training.model.Product;
import edu.training.service.RegisterService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		List<Product> WishList=new ArrayList<>();
		HttpSession session=request.getSession();
		
		if((pwd.equals("admin123"))&&(uname.equals("Admin@gmail.com")) ){
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		else {
			session.setAttribute("uname",uname);
			session.setAttribute("pwd",pwd);
			
			
		request.getRequestDispatcher("userhomepage.jsp").forward(request, response);
	}

}}
