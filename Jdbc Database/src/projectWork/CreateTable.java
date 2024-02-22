package projectWork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CreateTable {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Registered Sucesss..!!"); 
														
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/BankDB","root","Sachinsp@4");
				System.out.println("Connection Success..!!");
				Statement st=con.createStatement();

				st.execute("Create table BankDB(id int primary key,Accno long,name varchar(30),Bal  double,cont long,pin int,IFSC varchar(10),Pan varchar(10),adhar  long)");
		System.out.println("Table Created");
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

