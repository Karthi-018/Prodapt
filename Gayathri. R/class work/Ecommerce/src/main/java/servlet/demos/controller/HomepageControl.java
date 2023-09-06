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
 * Servlet implementation class HomepageControl
 */
@WebServlet("/headercontrol")
public class HomepageControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operator=request.getParameter("opr");
		if(operator.equals("HOME"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
					rd.forward(request, response);
		}
		else if(operator.equals("VIEWPRODUCTS"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WebProductsDisplayControl");
					rd.forward(request, response);
		}
		else if(operator.equals("MYCART"))
		{  try
		{
			List<ProductDataModel> mycart=UserService.getMycart();
			System.out.println(mycart);
			request.setAttribute("mycartlist", mycart);
     		RequestDispatcher rd=request.getRequestDispatcher("UserCart.jsp");
					rd.include(request, response);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
		
		else if(operator.equals("MYWISHLIST"))
		{
			try
			{
			List<ProductDataModel> mywishlist=UserService.getMyWishlist();
			System.out.println(mywishlist);
			request.setAttribute("mywishlist", mywishlist);
			RequestDispatcher rd=request.getRequestDispatcher("UserList.jsp");
					rd.include(request, response);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(operator.equals("LOGOUT"))
		{try {
			response.setContentType("text/html");
			UserService us=new UserService();
			us.logout();
			response.getWriter().println("<h2 align=\"center\">Logged out</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
		{
			System.out.println(operator);
			UserService us=new UserService();
			try {
				List<ProductDataModel> sl=us.GetSearhList(operator);
				request.setAttribute("productlist", sl);
			     RequestDispatcher rd=request.getRequestDispatcher("WebProductDisplay.jsp");
					rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
