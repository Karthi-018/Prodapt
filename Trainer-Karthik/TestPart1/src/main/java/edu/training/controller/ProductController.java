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
@WebServlet("/createProduct")
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pName = request.getParameter("pname");
		String pDesc = request.getParameter("pdesc");
		double pPrice = Double.parseDouble(request.getParameter("pPrice"));
		int pQty = Integer.parseInt(request.getParameter("pQty"));
		
		ProductService ps = new ProductService();
		Product p  = new Product(pid,pName,pDesc,pPrice,pQty);
		
		try {
			ps.addProduct(p);
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:green'>Product Created</b></h1>");
			request.getRequestDispatcher("addproduct.jsp").include(request, response);
		} catch (SQLException e) {
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:red'>Product Not Created Someting went wrong </b></h1>");
			request.getRequestDispatcher("addproduct.jsp").include(request, response);
			
		}
	}

}
