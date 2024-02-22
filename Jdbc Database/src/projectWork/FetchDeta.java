package projectWork;
import java.sql.*;
import java.util.*;

	public class FetchDeta {

	    //declaring necessary variables  ///   Making Datamember private..
	    private static Connection con;
	    private static Scanner sc;
	    private static double balance;
	    private static long accno;
	    private static int pin;

	    public static void main(String args[]) {
	        try {
	            //establishing connection with MySQL database
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver Registered Sucesss..!!");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:8855/BankDB","root","Sachinsp@4");
	            System.out.println("Connection Success..!!");
	            sc = new Scanner(System.in);
	            boolean flag = true;
	            while(flag==true) {
	                System.out.println("Welcome to the Bank App");
	                System.out.println("Please select an option:");
                    System.out.println("1. Log In");
                    System.out.println("2. Create new Account");
                    int option1 = sc.nextInt();
                    
                    switch(option1) {
                    case 1:
                        logIn();
                        break;
                    case 2:
                        createAccount();
                        break;
                    }
	            }
	        }
	        catch (Exception e) {
				e.printStackTrace();
			}
        }
	    
	    public static void logIn()
	    {
	    	System.out.println("Please enter your Account Number: ");
            accno = sc.nextLong();
            System.out.println("Please enter your PIN: ");
            pin = sc.nextInt();
            																	//validating the credentials
            try {
				if(validateCredentials()) {
				    System.out.println("Login Successful");
				 
				    boolean flag1 = true;
				    while(flag1) {
				        System.out.println("Please select an option:");
				        System.out.println("1. Check Balance");
				        System.out.println("2. Deposit");
				        System.out.println("3. Withdraw");
				        System.out.println("4. Exit");
				        int option = sc.nextInt();
				        switch(option) {
				            case 1:
				                checkBalance();
				                break;
				            case 2:
				                deposit();
				                break;
				            case 3:
				                withdraw();
				                break;
				            case 4:
				                flag1 = false;
				                break;
				            default:
				                System.out.println("Please enter a valid option");
				                break;
				        }
				    }
				} else {
				    System.out.println("Invalid Credentials");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
        }
	
    
	    //function to validate credentials
	    public static boolean validateCredentials() throws Exception {
	        PreparedStatement ps = con.prepareStatement("SELECT Bal FROM BankDB WHERE accno = ? && pin = ?");
	        ps.setLong(1, accno);
	        ps.setInt(2, pin);
	        ResultSet rs = ps.executeQuery();
	        if(rs.next()) {
	            balance = rs.getInt("Bal");
	            return true;
	        } else {
	            return false;
	        }
	    }

	    //function to check balance
	    public static void checkBalance() throws Exception {
	        System.out.println("Your Balance is: " + balance);
	    }

	    //function to deposit money
	    public static void deposit() throws Exception {
	        System.out.println("Please enter the amount you want to deposit: ");
	        double deposit_amount = sc.nextInt();
	        balance += deposit_amount;
	        PreparedStatement ps = con.prepareStatement("UPDATE BankDB SET Bal = ? WHERE accno = ? && pin = ?");
	        ps.setDouble(1, balance);
	        ps.setLong(2, accno);
	        ps.setInt(3, pin);
	        ps.executeUpdate();
	        System.out.println("Your updated balance is: " + balance);
	    }

	    //function to withdraw money
	    public static void withdraw() throws Exception {
	        System.out.println("Please enter the amount you want to withdraw: ");
	        int withdraw_amount = sc.nextInt();
	        if(withdraw_amount <= balance) {
	            balance -= withdraw_amount;
	            PreparedStatement ps = con.prepareStatement("UPDATE BankDB SET Bal = ? WHERE accno = ? && pin = ?");
	            ps.setDouble(1, balance);
	            ps.setLong(2, accno);
	            ps.setInt(3, pin);
	            ps.executeUpdate();
	            System.out.println("Your updated balance is: " + balance);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }
	    public static void createAccount()
	    {
	    	
			try {
				
				
				PreparedStatement ps=con.prepareStatement("insert into BankDB(id,Accno,name,Bal,cont,pin,IFSC,Pan,adhar)values(?,?,?,?,?,?,?,?,?)");
				System.out.println("Enter the id :");
				int id1=sc.nextInt();
				System.out.println("Enter the Accno : ");
				long Accno1=sc.nextLong();
				System.out.println("Enter the Name: ");
				String name1=sc.next();
				System.out.println("Enter the First Amount : ");
				double Bal1=sc.nextDouble();
				System.out.println("Enter the cont:");
				long cont1=sc.nextLong();
				System.out.println("Enter the pin : ");
				int pin1=sc.nextInt();
				System.out.println("Enter the IFSC: ");
				String IFSC=sc.next();
				System.out.println("Enter the PanNo: ");
				String Pan1=sc.next();
				System.out.println("Enter the AdharNo :");
				long adhar1=sc.nextLong();
				
				ps.setInt(1, id1);
				ps.setLong(2, Accno1);
				ps.setString(3, name1);
				ps.setDouble(4, Bal1);
				ps.setLong(5, cont1);
				ps.setInt(6, pin1);
				ps.setString(7, IFSC);
				ps.setString(8, Pan1);
				ps.setLong(9, adhar1);
				
				ps.execute();
				System.out.println("Account Created Sucess..!!");
			}
			catch (SQLException e1) {
				e1.printStackTrace();
			//Create Statements .
			
	    }
	}
	}
