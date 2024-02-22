package Hshs;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Hshs1")
public class Hshs extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd= req.getRequestDispatcher("Hshs11.html");
		rd.forward(req, res);
		rd.include(req, res);
		
	}

}
