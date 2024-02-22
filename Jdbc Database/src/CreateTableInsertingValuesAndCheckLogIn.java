import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class CreateTableInsertingValuesAndCheckLogIn {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered Sucesss..!!");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
			System.out.println("Connection Success..!!");
			Statement st=con.createStatement();
			//st.execute("Create table Account(id int,name varchar(30),email varchar(30),pass int)");
			System.out.println("Table Created  !!");
			
//			st.execute("insert into Account(id,name,email,pass)values(1,'Sachin','sachinsp2207@gmail.com',8855)");
//			st.execute("insert into Account(id,name,email,pass)values(2,'Akash','akashp3005@gmail.com',8866)");
//			st.execute("insert into Account(id,name,email,pass)values(3,'Mayur','mayur1203@gmail.com',8877)");
		//	st.execute("insert into Account(id,name,email,pass)values(4,'Rajas','rajas2211@gmail.com','')");
			System.out.println("Values inserted  !!");
			Scanner s=new Scanner (System.in);
			ResultSet rs= st.executeQuery("select * from account where id=1");
			
	
			
			System.out.println("-----");
			rs.next();
			System.out.println(rs.getString(3));
			String email=(rs.getString(3));
			int pass=(rs.getInt(4));
			System.out.println(rs.getInt(4));
			System.out.println("Enter your mail Id");
			String mail=s.next();
			System.out.println("Enter the Pass");
			int pas=s.nextInt();
			
			logIN(email, mail, pass, pas);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void logIN(String mail,String email,int pass,int pas) 
	{
		if ((email.equals(mail))&&(pas==pass)){
			System.out.println("Log In Sucess..!!");
		}
		else {
			System.out.println("Invalid Credentials..!!");
		}
	   
	    
	}
	
}
	
