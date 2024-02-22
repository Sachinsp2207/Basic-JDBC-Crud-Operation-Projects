 package http;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/HTTPSESSION")
public class HttptSess extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession h1=req.getSession();
		HttpSession h2=req.getSession();
		h1.setAttribute("Name","Sachin");
		h1.setAttribute("Email","Sachin2207@gmail.com");
		h1.setAttribute("Cont",8530939218l);
		
		
		String s=(String)h1.getAttribute("Name");
		System.out.println(s);
		// fetching data  using another object  ref h2....because the object ref is same
		String s2=(String)h2.getAttribute("Name");
		long a=(Long)h2.getAttribute("Cont");
		
		System.out.println(s2);
		System.out.println(a);
	}

}
