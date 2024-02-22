package savingCookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SACHIN")
public class File1503 extends HttpServlet{

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String em=req.getParameter("Email");
		 String ps=req.getParameter("Pass");
		 
		 Cookie c1=new Cookie("Emailid", em);
		 Cookie c2=new Cookie("Password", ps);
	
		resp.addCookie(c1);
		resp.addCookie(c2);
		RequestDispatcher rd= req.getRequestDispatcher("File15032.html");
		rd.forward(req, resp);
	}
	

}
