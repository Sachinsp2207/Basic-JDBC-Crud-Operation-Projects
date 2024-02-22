import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBasic {
	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");//Registering & loading the driver//url of jdbc driver
				System.out.println("Driver Registered Sucesss..!!"); //Mandetory
														//present in java .sql package 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8855/student","root","Sachinsp@4");
				System.out.println("Connection Success..!!");// making Connection using id and pass
				
				Statement st=con.createStatement();//Create Statements .
//				st.execute("Create table student1(id int,name varchar(30))");
				System.out.println("Table Created");
				
//				st.execute("insert into student1(id,name)values(102,'raju')");
//				st.execute("insert into student1(id,name)values(103,'rachi')");
//				st.execute("insert into student1(id,name)values(104,'ramu')");
//				st.execute("insert into student1(id,name)values(105,'samu')");
				System.out.println("Values Inserted");
				
				st.execute("update student1 set name='kunal'where name='raju'");
				System.out.println("values updated!!");
				st.execute("delete from student1 where id=102");
				System.out.println("Values deleted !!");
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
