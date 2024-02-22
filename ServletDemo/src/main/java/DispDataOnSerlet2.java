import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/asdfg")
public class DispDataOnSerlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String age=req.getParameter("age");
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(pass);
		System.out.println(age);
		
//		PrintWriter ps=res.getWriter();
//		ps.write(id);
//		ps.println();
//		ps.write(name);						///  for print on browser..
//		ps.println();
//		ps.write(pass);
//		ps.println();
//		ps.write(age);
		//res.setContentType("text/html");
	}
}
