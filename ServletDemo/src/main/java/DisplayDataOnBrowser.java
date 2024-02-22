import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/browser")
public class DisplayDataOnBrowser  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String i=req.getParameter("id");
		int id=Integer.parseInt(i);
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String age=req.getParameter("age");
		
		PrintWriter ps=res.getWriter();///present in servlet responce interface...
		
		ps.write("Welcome    :" + name );
		ps.println();
		ps.write("   Your Id Is  : "+id);
		ps.println();
		ps.write("Password Is : "+pass);
		ps.println();
		ps.write("And Your Age Is  :"+age);
	}

}
