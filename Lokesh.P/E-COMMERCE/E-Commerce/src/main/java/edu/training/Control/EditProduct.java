package edu.training.Control;

 

import java.io.IOException;

import java.io.PrintWriter;

 

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import edu.training.Service.ProductService;

 
 


@WebServlet("/EditProduct")

public class EditProduct extends HttpServlet {

    private static final long serialVersionUID = 1L;


 

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session =request.getSession();

        String pid=(String) session.getAttribute("Product_id");

        int eid=Integer.parseInt(pid);
        System.out.println(eid);
        int eprice=Integer.parseInt(request.getParameter("editprice"));
        int  eqty =Integer.parseInt(request.getParameter("editqty"));


        ProductService ps=new ProductService();


        ps.edit(eid,eprice,eqty);



        response.setContentType("text/html");

        response.getWriter().println("<h1>Product edited successfully</h1>");

        RequestDispatcher rd=request.getRequestDispatcher("/viewProductControl");

        rd.include(request, response);



    }

 

 

}
