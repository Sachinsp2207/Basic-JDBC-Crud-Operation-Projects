import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class FetchAllDataFromTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Sucesss..!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			System.out.println("Connection Success..!!");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from details");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getLong(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
