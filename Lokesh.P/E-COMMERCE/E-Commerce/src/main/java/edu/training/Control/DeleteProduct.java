package edu.training.Control;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.Model.ProductPojo;
import edu.training.Service.DAOClass;
import edu.training.Service.ProductService;

/**
 * Servlet implementation class DeleteProduct
 */
@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con=DAOClass.getConnect();
	ProductService ps = new ProductService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductPojo p = new ProductPojo();
		try
		{
			ps.deleteProduct(Integer.parseInt(request.getParameter("Product_id")));
			RequestDispatcher rd=request.getRequestDispatcher("viewProductControl");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
