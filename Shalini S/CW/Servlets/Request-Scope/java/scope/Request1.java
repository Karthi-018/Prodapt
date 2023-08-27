package scope;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Request1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		req.setAttribute("name",req.getParameter("uname"));
		//req.setAttribute("pass",req.getAttribute("upass"));
		RequestDispatcher rd=req.getRequestDispatcher("/Request2");
		rd.forward(req, res);
		//rd.forward(req, res);
	}

}
