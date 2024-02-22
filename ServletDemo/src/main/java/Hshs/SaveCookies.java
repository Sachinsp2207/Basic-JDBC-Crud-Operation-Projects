package Hshs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/xxxxx")
public class SaveCookies extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail=req.getParameter("email");
		String pas=req.getParameter("pass");
		
		Cookie c= new Cookie ("emai",mail);
		Cookie c1= new Cookie ("pass",pas);
		
		RequestDispatcher rd= req.getRequestDispatcher("Welcome.html");
		rd.forward(req, resp);
	}
}
