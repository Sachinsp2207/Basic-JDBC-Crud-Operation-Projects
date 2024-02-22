package library;
import java.sql.*;

public class Book {
	
	int id;
	String title;
	String Author;
	String ReturnDate;
	
	Book(){}

	public Book(int id, String title, String author, String returnDate) {
		super();
		this.id = id;
		this.title = title;
		this .Author = author;
		this.ReturnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", Author=" + Author + ", ReturnDate=" + ReturnDate + "]";
	}

	public String toString(String title2) {
		// TODO Auto-generated method stub
		return title;
	}
	
	
	
}
