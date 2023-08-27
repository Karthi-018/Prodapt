package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie2 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		Cookie c[]=req.getCookies();
        for(Cookie i:c) {
        	out.println(i.getName()+":"+i.getValue());
        }
        
	}
}	