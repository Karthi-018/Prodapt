package edu.training.Control;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/choice")
public class Choice extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		if(req.getParameter("choose").equals("AddProduct"))
		{
			req.getRequestDispatcher("addproduct.jsp").forward(req, res);
		}
		else if(req.getParameter("choose").equals("ViewProduct"))
		{
			req.getRequestDispatcher("viewProductControl").forward(req, res);
		}
		else if(req.getParameter("choose").equals("Edit"))
		{
			req.getRequestDispatcher("editproduct.jsp").forward(req,res);
		}
		else if(req.getParameter("choose").equals("Delete"))
		{
			req.getRequestDispatcher("DeleteProduct").forward(req,res);
		}
	}
}
