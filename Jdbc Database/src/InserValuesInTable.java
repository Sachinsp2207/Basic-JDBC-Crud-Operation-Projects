import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InserValuesInTable {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");//Registering & loading the driver//url of jdbc driver
				System.out.println("Driver Registered Sucesss..!!"); //Mandetory
														//present in java .sql package 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
				System.out.println("Connection Success..!!");// making Connection using id and pass
				Statement st=con.createStatement();//Create Statements .
				
				st.execute("insert into details(id,name,age,cont)values(6,'Kiran',24,8876543876)");
				System.out.println("Values Inserted");
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
