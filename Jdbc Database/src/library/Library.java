package library ;

import java.util.ArrayList;

public class Library {//extends Book{
public static void main(String[] args) {
	ArrayList<Book>l1=new ArrayList<>();
	
	l1.add(new Book(1, "Java","Shubham","12-12-2012"));
	l1.add(new Book(2, "c","Rushikesh","12-01-2015"));
	l1.add(new Book(3, "Java","Harishankar","01-03-2023"));
	
	Book temp=l1.get(0);
	String name=temp.toString(temp.title);
	Book tem=l1.get(2);
	String nam=temp.toString(temp.title);
	System.out.println(nam);
	if (name==nam) {
		l1.remove(0);
	}
	System.out.println(l1);
	}
}

