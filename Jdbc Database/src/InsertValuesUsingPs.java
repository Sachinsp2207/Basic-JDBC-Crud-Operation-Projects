import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertValuesUsingPs {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");//Registering & loading the driver//url of jdbc driver
				System.out.println("Driver Registered Sucesss..!!"); //Mandetory
														//present in java .sql package 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
				System.out.println("Connection Success..!!");// making Connection using id and pass
				PreparedStatement ps=con.prepareStatement("insert into details(id ,name,age,cont)values(?,?,?,?)");//place holder
				Scanner sc =new Scanner (System.in);
				
				System.out.println("Enter the id :");
				int id=sc.nextInt();
				System.out.println("Enter the Name : ");
				String name=sc.next();
				System.out.println("Enter the age: ");
				int age=sc.nextInt();
				System.out.println("Enter the Contact no: ");
				long cont=sc.nextLong();
				
				ps.setInt(1, id);//values  position 1 && what values is to be inserted..
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.setLong(4, cont);
				
				ps.execute();
				System.out.println("Value inserted");
				
				System.out.println("ALL Values Inserted");
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
