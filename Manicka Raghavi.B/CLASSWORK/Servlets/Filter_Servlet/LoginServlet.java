package logincontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logcontext")
public class LoginServlet extends HttpServlet 
{   
	
	private static final long serialVersionUID = 1L;
    
	

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		
		pw.println("<html><body><h1>LOGIN SUCCESS USERNAME: "+req.getParameter("uname")+" PWD: "+req.getParameter("pwd")+"</h1></body></html>");
	}

}
