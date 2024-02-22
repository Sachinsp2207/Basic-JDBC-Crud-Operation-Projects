import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class LogIn  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");										
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			String name=req.getParameter("Name");
			String pass=req.getParameter("Pass");
			
			PreparedStatement ps=con.prepareStatement("select name,pass from account where name=? and pass=?");
			ps.setString(1,name);
			ps.setString(2,pass);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next())
			{
				System.out.println("Welcome !!  "+name);
			}
			else {
			System.out.println("Invalid Credential..!!");	
			}
			
	}
	
	
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}	
	
	}

}
