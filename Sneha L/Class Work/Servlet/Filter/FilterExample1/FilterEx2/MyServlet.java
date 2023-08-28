package FilterEx2;



import java.io.IOException;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class MyServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.getWriter().println("Welcome "+req.getParameter("uname"));
    }

 

}