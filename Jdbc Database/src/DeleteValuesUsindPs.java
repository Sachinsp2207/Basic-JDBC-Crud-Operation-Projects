import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class DeleteValuesUsindPs {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Sucesss..!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			System.out.println("Connection Success..!!");
			PreparedStatement ps=con.prepareStatement("delete from details where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the ID:");
			int id=sc.nextInt();
			ps.setInt(1, id);
			ps.execute();//////imp
			System.out.println("Values Deleted..!!");
			
			
			
					} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
