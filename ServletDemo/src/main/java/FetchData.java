import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetchdata")
public class FetchData  extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("Id");
		String name=req.getParameter("Name");
		String pass=req.getParameter("Pass");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(pass);
		
	}

}
