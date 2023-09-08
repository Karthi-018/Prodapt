package filter;

import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class filtercls extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request,ServletResponse response) throws IOException {
		String s= request.getParameter("username");
	response.getWriter().println("Welcome  "+s);

}
}
