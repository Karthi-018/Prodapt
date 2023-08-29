package arun.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arun.model.Product;
import arun.service.AdminService;
import arun.service.ProductService;

@WebServlet("/adminController")
public class AdminController extends HttpServlet{
	private AdminService adminService;
	private ProductService productService;
	ServletContext context;
	public void init() {
		adminService = new AdminService();
		productService = new ProductService();
		context = getServletContext();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String opt = req.getParameter("opt");
		if(opt.equals("add")) {
			req.getRequestDispatcher("product.jsp").forward(req, res);
		}
		else {
			try {
				ArrayList<Product> products = productService.findAll(context);
				req.setAttribute("products",products);
				RequestDispatcher rd = req.getRequestDispatcher("viewproduct.jsp");
				rd.forward(req, res);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}	
