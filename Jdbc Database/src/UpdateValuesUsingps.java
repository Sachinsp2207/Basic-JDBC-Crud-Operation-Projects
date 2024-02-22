import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateValuesUsingps {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");//Registering & loading the driver//url of jdbc driver
				System.out.println("Driver Registered Sucesss..!!"); //Mandetory
														//present in java .sql package 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
				System.out.println("Connection Success..!!");// making Connection using id and pass
				PreparedStatement ps=con.prepareStatement("update details set name=? where name='kiran'");
				Scanner sc =new Scanner (System.in);
				System.out.println("Enter NEW name");
				String name=sc.next();
				System.out.println("Values Inserted");
				ps.setString(1, name);
				ps.execute();
			
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
