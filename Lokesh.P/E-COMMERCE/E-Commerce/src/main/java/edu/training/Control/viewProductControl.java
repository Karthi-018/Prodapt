package edu.training.Control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.Model.ProductPojo;
import edu.training.Service.viewProductService;

/**
 * Servlet implementation class viewProductControl
 */
@WebServlet("/viewProductControl")
public class viewProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
      viewProductService productService = new viewProductService();
    
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			List<ProductPojo> products = productService.getAllProducts();
			System.out.println(products);
			request.setAttribute("products",products);
			RequestDispatcher rd=request.getRequestDispatcher("viewproduct.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	

}
