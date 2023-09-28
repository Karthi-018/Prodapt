package edu.training.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.training.model.Prod_Cus;
import edu.training.service.ProductService;

@WebServlet("/AddtoCart")
public class AddtoCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		double pprice=Double.parseDouble(request.getParameter("pprice"));
		int pqty=Integer.parseInt(request.getParameter("pqty"));
		int qty=Integer.parseInt(request.getParameter("qty"));
         System.out.println(qty);
		
		ProductService ps=new ProductService();
		Prod_Cus pc=new Prod_Cus();
		try {
			pc.setName(uname);
			pc.setpwd(pwd);
			pc.setPid(pid);
			pc.setPname(pname);
			pc.setPprice(pprice);
			pc.setPqty(pqty);
			
			ps.addTocart(pc);
		RequestDispatcher rd=request.getRequestDispatcher("Viewcusproductcontroller");
		rd.include(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
