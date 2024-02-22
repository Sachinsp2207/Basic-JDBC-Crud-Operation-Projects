package projectWork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InserValuesInTable {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Registered Sucesss..!!");
														
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/BankDB","root","Sachinsp@4");
				System.out.println("Connection Success..!!");
				Statement st=con.createStatement();//Create Statements .
				
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(1,72003316,'Sachin Pawar'"
						+ ",400000.00,8530939218,3333,'MAHB000424','GZSPP6688A',909143009248)");
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(2,54638293,'Akash Pawar'"
						+ ",230000.00,5544778899,5467,'MAHB000424','GRSPP6688A',546789763456)");
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(3,75436258,'Harshvardhan Shinde'"
						+ ",430000.00,678096789,6578,'MAHB000424','TZSPP6689A',678568987623)");
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(4,56538265,'Mayur Musale'"
						+ ",210000.00,8533456785,2345,'MAHB000424','UZSPP6681A',345678903245)");
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(5,2127647346,'Sumit Thoke'"
						+ ",320000.00,8530935678,6577,'MAHB000424','TZSPP6683A',879605465789)");
				st.execute("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(6,5626568928,'Akshay More'"
						+ ",700000.00,7780939218,3421,'MAHB000424','BZSPP6685A',768566785677)");
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
