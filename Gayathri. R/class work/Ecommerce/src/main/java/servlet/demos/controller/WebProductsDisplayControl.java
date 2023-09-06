package servlet.demos.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.demos.model.ProductDataModel;
import servlet.demos.service.AdminService;
import servlet.demos.service.UserService;

/**
 * Servlet implementation class WebProductsDisplayControl
 */
@WebServlet("/WebProductsDisplayControl")
public class WebProductsDisplayControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("products display");
		UserService us=new UserService();
		  List<ProductDataModel> pl=us.WebProductDisplay();
		  System.out.println(pl);
		  request.setAttribute("productlist",pl);
		response.getWriter().println("product display");
		RequestDispatcher rd=request.getRequestDispatcher("WebProductDisplay.jsp");
		rd.forward(request, response);
	}

}
