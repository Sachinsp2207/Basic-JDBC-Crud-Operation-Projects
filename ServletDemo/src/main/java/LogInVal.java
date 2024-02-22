import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ssp")
public class LogInVal  extends  GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		String Email="Sachinsp2207@gmail.com";
		String Pass="8855";
		
		if ((email.equals(Email))&&(Pass.equals(pass))) {
			RequestDispatcher rd= req.getRequestDispatcher("LogIN.html");
			rd.forward(req, res);
		}
	
		else {
			PrintWriter ps=res.getWriter();
			ps.write("Invalid Credential..!!!");
			RequestDispatcher rd= req.getRequestDispatcher("LogInFile.html");
			rd.include(req, res);//USED TO FOREARD THE REQUEST ALONG WITH CONTENT
			res.setContentType("text/html");
		}
	}

}
