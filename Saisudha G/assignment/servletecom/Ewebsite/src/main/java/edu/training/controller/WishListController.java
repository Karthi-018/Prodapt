package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.training.model.Product;
import edu.training.service.ProductService;

@WebServlet("/WishListController")
public class WishListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		//int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
//		double pprice=Double.parseDouble(request.getParameter("pprice"));
		//int pqty=Integer.parseInt(request.getParameter("pqty"));
		ProductService ps=new ProductService();
		
		
		
		try {
			
			List<Product>WishList=ps.addtoWishList(pname);
			request.setAttribute("wish",WishList);
			System.out.println(WishList);
			RequestDispatcher rd=request.getRequestDispatcher("WishList.jsp");
			rd.forward(request, response);
			
//		RequestDispatcher rd1=request.getRequestDispatcher("WishList.jsp");
//		rd1.forward(request, response);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
