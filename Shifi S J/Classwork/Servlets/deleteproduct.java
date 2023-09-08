package edu.training.controller;

 

import java.io.IOException;

 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 

import edu.training.service.ProductService;

 

/**
* Servlet implementation class DeleteController
*/
@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;


 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pid=(String) request.getParameter("deleteid");
        int id=Integer.parseInt(pid);

        System.out.println(id);
        ProductService ps=new ProductService();

        ps.delete(id);
        System.out.println("deleted succesfully");

        response.setContentType("text/html");
        response.getWriter().println("<h3>Product Deleted successfully</h3>");
        RequestDispatcher rd=request.getRequestDispatcher("/ProductViewController");
        rd.include(request, response);
    }

 

 

}