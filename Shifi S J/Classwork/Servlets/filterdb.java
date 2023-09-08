package filter;

	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	import javax.servlet.Filter;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.http.HttpFilter;

	public class Firstfilter extends HttpFilter  {
	
		private static final long serialVersionUID = 1L;
		Connection con=null;
		public void init(FilterConfig sc) throws ServletException {
			String dclass=(String)sc.getInitParameter("dclass");
			String url=(String)sc.getInitParameter("url");
			String uname=(String)sc.getInitParameter("username");
			String pwd=(String)sc.getInitParameter("password");
			try {
				Class.forName(dclass);
				con=DriverManager.getConnection(url,uname,pwd);
				System.out.println("hi");
			}
			catch(Exception e){
				System.out.println(e);
				
			}
		}

public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	try {
				
				PreparedStatement ps=con.prepareStatement("select * from employees where firstname= ?;");
				ps.setString(1,request.getParameter("username"));
				//ps.setString(2,request. getParameter("password"));
				ResultSet rs =	ps.executeQuery();
				while(rs.next())	
				{
					if(request.getParameter("password").equals(rs.getString(5)))
					{
						chain.doFilter(request, response);
						response.getWriter().println("Servlet");
					}
					else
					{
						RequestDispatcher rd = request.getRequestDispatcher("login.html");
						rd.forward(request, response);
					}
						
				}
			}
			catch(Exception e){
				System.out.println(e);
				
				}
		}
	}

