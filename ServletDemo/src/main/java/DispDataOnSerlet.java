import java.io.IOException;
import java.lang.reflect.GenericSignatureFormatError;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/DispDataOnServ")
public class DispDataOnSerlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		RequestDispatcher rd= req.getRequestDispatcher("/asdfg");
		rd.forward(req, res);

		
	}
	
}
