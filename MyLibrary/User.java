package MyLibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private static int userCounter;
	
	public int id;
	
	public String name;
	public String dateCreated;
	public int age;
	public String email;
	
	public ArrayList<String> books = new ArrayList<String>();
	
	private Date fecha = new Date();
	private DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	
	public User(String name, int age, String email) {
		
		userCounter++;
		
		this.id = userCounter;	
		this.dateCreated = hourdateFormat.format(fecha);
		this.name = name;
		this.age = age;
		this.email = email;
		
	}
	
	public void addBook(String bookName) {
		
		books.add(bookName);
		
	}
	

}
