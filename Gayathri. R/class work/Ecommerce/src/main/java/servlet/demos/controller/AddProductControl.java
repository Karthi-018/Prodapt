package servlet.demos.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.demos.model.ProductDataModel;
import servlet.demos.service.AdminService;


@WebServlet("/add")
public class AddProductControl extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		String pdes=request.getParameter("pdes");;
		double price=Double.parseDouble(request.getParameter("price"));
		int quan=Integer.parseInt(request.getParameter("quan"));
		ProductDataModel p=new ProductDataModel(pid,pname,pdes,price,quan);
		System.out.println(p.getPdes());
		AdminService ps=new AdminService();
		try {
			ps.AddProduct(p);
			response.setContentType("text/html");
			response.getWriter().println("Product added successful");
			RequestDispatcher rd=request.getRequestDispatcher("AdminPage.jsp");
			rd.include(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
