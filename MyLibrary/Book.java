package MyLibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	
	private static int bookId;
	
	public String name;
	public String author;
	public int pages;
	public int id;
	public String dateCreated;
	
	private Date fecha = new Date();
	private DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	
	public Book(String name, String author, int pages) {
		
		bookId++;
		
		this.id = bookId;
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.dateCreated = hourdateFormat.format(fecha);
		
	}
	
}
