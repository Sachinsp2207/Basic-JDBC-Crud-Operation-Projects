package batchProcessing;
import java.sql.*;

import java.util.Scanner;
public class StatementWithBatchProcessing {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Sucesss..!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			System.out.println("Connection Success..!!");
			Statement st=con.createStatement();
//			st.addBatch("insert into Account(id,name,email,pass)values(4,'Mohit','mohit232@gmail.com',7766)");
//			st.addBatch("insert into Account(id,name,email,pass)values(5,'Akshay','moreakshay1232@gmail.com',9988)");
//			st.addBatch("insert into Account(id,name,email,pass)values(6,'Namdev','namdev12@gmail.com',9977)");
//			st.addBatch("insert into Account(id,name,email,pass)values(7,'Jagdish','jagdish22@gmail.com',9567)");
//			st.addBatch("insert into Account(id,name,email,pass)values(8,'Abhi','abhi25@gmail.com',9888)");
			st.executeBatch();
			System.out.println("values Inserted  !!");
			Scanner s=new Scanner (System.in);
			//ResultSet rs= st.executeQuery("select * from account where id=4");
			
	
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
