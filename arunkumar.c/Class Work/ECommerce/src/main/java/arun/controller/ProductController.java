package arun.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import arun.model.Product;
import arun.service.ProductService;

@WebServlet("/product")
public class ProductController extends HttpServlet{
	ProductService productService;
	ServletContext context;
	public void init() {
		productService = new ProductService();
		context = getServletContext();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		int price = Integer.parseInt(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		
		Product pd = productService.save(new Product(id,name,description,price,quantity),context);
		if(pd!=null) {
			res.sendRedirect("adminpage.jsp");
		}
		else {
			System.out.println("product cant add");
		}
	}
}
