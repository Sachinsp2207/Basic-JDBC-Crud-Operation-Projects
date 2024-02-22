import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/requestdispatcher")
public class ReqDispatch extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String age=req.getParameter("age");
		
		System.out.println(name);
		System.out.println(dob);
		System.out.println(age);
		
	
		RequestDispatcher rd= req.getRequestDispatcher("NewFile1103 2.html");
		rd.forward(req, res);// used to foward the url control..
		//	RD is an interface .
		//	used to forward req one resource to another Resource
		//	getRequestDispatcher();----using this method
		//	 in this method we pass the file namw as url
		//we can not run servlet file on browser because browser understand only html langauge 
	}

}
