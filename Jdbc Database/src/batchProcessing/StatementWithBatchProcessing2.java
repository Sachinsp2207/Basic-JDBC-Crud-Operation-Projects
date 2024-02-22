package batchProcessing;
import java.sql.*;
import java.util.Scanner;
public class StatementWithBatchProcessing2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Sucesss..!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			System.out.println("Connection Success..!!");
			Statement st=con.createStatement();
			st.addBatch("insert into Account(id,name,email,pass)values(9,'Mohit','mohit232@gmail.com',7766)");
			st.addBatch("insert into Account(id,name,email,pass)values(10,'Akshay','moreakshay1232@gmail.com',9988)");
			st.addBatch("delete from Account where id=9");
			st.addBatch("delete from Account where id=10");
			st.addBatch("update Account set name='Akki' where name='Akshay'");
			st.addBatch("update Account set name='Nams' where name='Namdev'");

			st.executeBatch();
			System.out.println("values Inserted  !!");
			Scanner s=new Scanner (System.in);				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
