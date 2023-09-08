package edu.training.controller;

 

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 

import edu.training.service.ProductService;

 

/**
* Servlet implementation class EditController
*/
@WebServlet("/EditProductController")
public class EditProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;


 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        String pid=(String) session.getAttribute("pid");
        int id=Integer.parseInt(pid);

        Double price=Double.parseDouble(request.getParameter("editprice"));
        int  quantity =Integer.parseInt(request.getParameter("editqty"));

        ProductService ps=new ProductService();

        ps.edit(id,price,quantity);


        response.setContentType("text/html");
        response.getWriter().println("<h1>Product edited successfully</h1>");
        RequestDispatcher rd=request.getRequestDispatcher("/ProductViewController");
        rd.include(request, response);


    }

 

 

}