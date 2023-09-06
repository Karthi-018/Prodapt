package servlet.demos.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.demos.model.ProductDataModel;
import servlet.demos.service.UserService;

/**
 * Servlet implementation class UserCartControl
 */
@WebServlet("/usercartcontrol")
public class UserCartControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("opr");
		int id=Integer.parseInt(request.getParameter("id"));
		if(operation.equals("BUY"))
		{
			System.out.println(id);
			UserService us=new UserService();
			List<ProductDataModel> bl=us.BuyProduct(id);
			try {
			if(!bl.equals(null))
			{   
				UserService.removecart(id);
				request.setAttribute("buylist",bl );
				RequestDispatcher rd=request.getRequestDispatcher("BuyProduct.jsp");
				rd.forward(request, response);
			}
			}
			catch(NullPointerException | ClassNotFoundException | SQLException e)
			{
				response.setContentType("text/html");
				response.getWriter().println("<h3  style=\"color:red;\" align=\"center\">product out of stock pls buy other product</h3>");
				UserService ns=new UserService();
				  List<ProductDataModel> pl=ns.WebProductDisplay();
				  request.setAttribute("productlist",pl);
				RequestDispatcher rd=request.getRequestDispatcher("WebProductDisplay.jsp");
				rd.include(request, response);
			}
			
		}
		else if(operation.equals("move to wishlist"))
		{
			UserService us=new UserService();
			try {
				 
				UserService.AddWishtables(us.GetWishList(id));
				UserService.removecart(id);
				response.setContentType("text/html");
				response.getWriter().println("moved success");
				RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
				rd.include(request, response);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			if(operation.equals("REMOVE FROM CART"))
			{
				try
				{
				UserService.removecart(id);
				response.setContentType("text/html");
				response.getWriter().println("removed success");
				RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
				rd.include(request, response);
			}
				 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		
		
	
	}
}


