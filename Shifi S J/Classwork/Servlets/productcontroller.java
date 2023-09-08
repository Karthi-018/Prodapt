package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.model.Product;
import edu.training.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		String pdesc = request.getParameter("pdesc");
		double price = Double.parseDouble(request.getParameter("price"));
		int pquantity = Integer.parseInt(request.getParameter("pquantity"));
		
		ProductService ps = new ProductService();
		Product p  = new Product(pid,pname,pdesc,price,pquantity);
		
		try {
			ps.addProduct(p);
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:green'>Product Created</b></h1>");
			request.getRequestDispatcher("addproducts.jsp").include(request, response);
		} catch (SQLException e) {
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:red'>Product Not Created Someting went wrong </b></h1>");
			request.getRequestDispatcher("addproducts.jsp").include(request, response);
			
		}
	}

}