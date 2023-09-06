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
import servlet.demos.service.AdminService;


@WebServlet("/ProductViewControl")
public class ProductViewControl extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		AdminService ps=new AdminService();
		  List<ProductDataModel> pl=ps.viewproduct();
		  System.out.println(pl);
		  req.setAttribute("productlist",pl);
		res.getWriter().println("product display");
		RequestDispatcher rd=req.getRequestDispatcher("ProductView.jsp");
		rd.forward(req, res);
	}

}
