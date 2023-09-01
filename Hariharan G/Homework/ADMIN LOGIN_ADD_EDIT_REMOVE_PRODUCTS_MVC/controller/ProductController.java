package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.model.Product;
import edu.training.service.AddProducts;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductController() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pName,pDesc;
		int pid=Integer.parseInt(request.getParameter("pid"));
		pName=request.getParameter("pname");
		pDesc=request.getParameter("pdesc");
		double pPrice=Double.parseDouble(request.getParameter("pprice"));
		int pQuantity=Integer.parseInt(request.getParameter("pquantity"));
		Product P=new Product(pid,pName,pDesc,pPrice,pQuantity);
		AddProducts ad=new AddProducts();
		try {
			String result=ad.addProduct(P);
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:green'>Product Created</b></h1>");
			request.getRequestDispatcher("addProduct.jsp").include(request, response);
		} catch (SQLException e) {
			response.getWriter().println("Product not created");
			
		}
	}

}
