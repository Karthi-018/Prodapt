package servlet.demos.controller;

import java.io.IOException;
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
 * Servlet implementation class UserListControl
 */
@WebServlet("/userlistcontrol")
public class UserListControl extends HttpServlet {
	
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
				request.setAttribute("buylist",bl );
				RequestDispatcher rd=request.getRequestDispatcher("BuyProduct.jsp");
				rd.forward(request, response);
			}
			}
			catch(NullPointerException e)
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
		else if(operation.equals("Add to cart"))
		{
			UserService us=new UserService();
			try {
				 
				UserService.Addcarttables(us.GetCartList(id));
				response.setContentType("text/html");
				response.getWriter().println("added success");
				RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
				rd.include(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
