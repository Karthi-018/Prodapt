package edu.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.training.model.Product;
import edu.training.service.AddProducts;

/**
 * Servlet implementation class EditProductController
 */
@WebServlet("/EditProductController")
public class EditProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session=request.getSession();
			Double updatePrice=Double.parseDouble(request.getParameter("editPrice")) ;
			int updateQuantity=Integer.parseInt(request.getParameter("editQuantity"));
			session.setAttribute("editPrice", updatePrice);
			session.setAttribute("editQuantity", updateQuantity);
			PrintWriter out=response.getWriter();
			out.println(session.getAttribute("editid"));
			out.println(request.getParameter("editPrice"));
			out.println(request.getParameter("editQuantity"));
			AddProducts ad=new AddProducts();
			List<Product>el=ad.editProductDetails(updatePrice,updateQuantity,Integer.parseInt(session.getAttribute("editid").toString()));
			out.println(el);
			session.setAttribute("viewlist", el);
			
			response.setContentType("text/html");
			response.getWriter().println("<h1><b style='color:green'>PRODUCT DETAILS EDITED SUCCESSFULLY </b></h1>");
			request.getRequestDispatcher("ViewProductsController").include(request, response);
			
		}
		catch(Exception e) {
			response.getWriter().println("Product details not edited");
		}
		
		

		
		
		
		
		
//		try {
//			
//			PrintWriter pw=response.getWriter();
//			HttpSession session=request.getSession();
//			String pid=(String) session.getAttribute("editid");
//			int product_id=Integer.parseInt(pid);
//			if(request.getParameter("choice").equals("EDIT PRODUCT PRICE")) {
////				ad.editProductPrice(product_id);
//				request.getRequestDispatcher("EditPrice.jsp").forward(request, response);
//			}
//			else {
//				ad.editProductQuantity(product_id);
//
//		}
////		pw.println(pid);
////		System.out.println(pid);
//		
////		ad.editProduct(product_id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
