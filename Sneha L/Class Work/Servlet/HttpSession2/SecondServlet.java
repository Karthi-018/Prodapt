package edu.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)

        throws IOException, ServletException {

        

        HttpSession session = request.getSession();

        String username = (String) session.getAttribute("username");

        

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("Username retrieved from session1: " + username);

        
        session.setAttribute("username1", username);

        //session.setAttribute("username1", "SOMETHING");

		/*
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("/thirdserv");
		 * 
		 * rd.include(request, response);
		 * 
		 */


        

        out.close();

    }

}

