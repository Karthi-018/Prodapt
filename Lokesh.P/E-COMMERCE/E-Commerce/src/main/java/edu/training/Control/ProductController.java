package edu.training.Control;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.Model.ProductPojo;
import edu.training.Service.ProductService;

@WebServlet("/ProductController") 
public class ProductController extends HttpServlet implements Serializable
{
	private static final long serialVersionUID = 7526472295622776147L;
	public void doPost(HttpServletRequest req,HttpServletResponse response) throws IOException, ServletException
	{
		int id=(Integer.parseInt(req.getParameter("Product_id")));
		String pname=req.getParameter("Product_Name");
		String pdes = req.getParameter("Product_Desc");
		int price=(Integer.parseInt(req.getParameter("Product_price")));
		int quantity=(Integer.parseInt(req.getParameter("Quantity")));
		ProductPojo p = new ProductPojo(id,pname,pdes,price,quantity);
		ProductService ps = new ProductService();
		try
        {
            ps.addProduct(p);
            response.setContentType("text/html");
            response.getWriter().println("<html><body><center><h1 style=\"color:green;\">Product added</h1></center>\r\n"
            		+ "</html>");
            req.getRequestDispatcher("index.jsp").include(req, response); 
        }

        catch(Exception e)

        {
        	 response.setContentType("text/html");
        	 response.getWriter().println("<html><body><center><h1 style=\"color:red;\">Incorrect Product Details</h1></center>\r\n"
             		+ "</html>");
            req.getRequestDispatcher("addproduct.jsp").include(req, response);

        }
		
		
		
	}
}