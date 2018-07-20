package MyLibrary;

import MyLibrary.User;
import java.util.ArrayList;
import java.awt.*;

public class Bibliotec {
	
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Book> books = new ArrayList<Book>();
	
	private int x = 50;
	private int y = 100;
	private int boxHeigth = 20;
	private int boxWidth = 1365 - (x * 2);
	private int indexSelected;

	
	public void displayUsers(Graphics g) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += boxHeigth + 1;
		
		for(int i = 1; i <= users.size(); i++) {
			
			if(i - 1 == indexSelected) {
				
				g.setColor(Color.yellow);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				indexSelected = -1;
				
			}else if(i % 2 == 0) {
				
				g.setColor(Color.lightGray);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				
				
				
			}else {
				
				g.setColor(Color.white);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				
			}
			
			g.setColor(Color.black);
			
			g.drawString("" + users.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + users.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + users.get(i - 1).age,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + users.get(i - 1).email,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + users.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
			
			yInicial += boxHeigth + 1;
			
		}
		
		
	}
	
	public void displayBooks(Graphics g) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.blue);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Book Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Author",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Pages",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Added",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += boxHeigth + 1;
		
		for(int i = 1; i <= books.size(); i++) {
			
			if(i - 1 == indexSelected) {
				
				g.setColor(Color.yellow);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				indexSelected = -1;
				
			}else if(i % 2 == 0) {
				
				g.setColor(Color.lightGray);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				
				
				
			}else {
				
				g.setColor(Color.white);
				g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
				
			}
			
			g.setColor(Color.black);
			
			g.drawString("" + books.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + books.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + books.get(i - 1).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + books.get(i - 1).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
			g.drawString("" + books.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
			
			yInicial += boxHeigth + 1;
			
		}
		
	}
	
	public void createNewUser(String name, int age, String email) {
		
		User newUser = new User(name,age,email);
		users.add(newUser);
		
	}
	
	public void addBook(String name,String author, int pages) {
		
		Book newBook = new Book(name, author, pages);
		books.add(newBook);
		
	}
	
	public int getIndex(int yPosition) {
		
		int index = (yPosition - this.y - this.boxHeigth) / this.boxHeigth;
		return index;
			
		
	}
	
	public void setIndexSelected(int index) {
		
		this.indexSelected = index;
		
	}
	
	public void eraseUser(int index) {
		
		this.users.remove(index);
		
	}
	
	public void eraseBook(int index) {
		
		this.books.remove(index);
		
	}
	
	public void changeUser(int index) {
		
		//this.users.remove(index);
		
	}
	
	public void changeBook(int index) {
		
		//this.books.remove(index);
		
	}
	
	public String getUserName(int index) {
		
		String userName = users.get(index).name;
		return userName;
		
	}
	
	public int getUserAge(int index) {
		
		int userAge = users.get(index).age;
		return userAge;
		
	}
	
	public void searchUserId(Graphics g, int id) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);

		g.drawString("ID Received: " + id, 50,50);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(id == users.get(i).id) {
									
				g.setColor(Color.black);
				
				g.drawString("" + users.get(i).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).age,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).email,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				
			}
			
		}
		
	}
	
	public void searchUserName(Graphics g, String name) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);

		g.drawString("Name Received: " + name, 50,50);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(name.equalsIgnoreCase(users.get(i).name)) {
									
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
				
				g.setColor(Color.black);
				
				g.drawString("" + users.get(i).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).age,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).email,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
			}
			
		}
		
	}
	
	public void searchUserAge(Graphics g, int age) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);

		g.drawString("Age Received: " + age, 50,50);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(age == users.get(i).age) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + users.get(i).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).age,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).email,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
			}
			
		}
		
	}

	public void searchUserDateCreated(Graphics g, String date) {
		/*
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);*/

		g.drawString("Date Received: " + date, 50,50);
		/*
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(date == users.get(i).dateCreated) {
									
				g.setColor(Color.black);
				
				g.drawString("" + users.get(i).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).age,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).email,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + users.get(i).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				
			}
			
		}*/
		
	}
	
	public void searchBookId(Graphics g, int id) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		g.drawString("Id Received: " + id, 50,50);
		
		g.setColor(Color.blue);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Book Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Author",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Pages",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Added",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
	
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(id == books.get(i).id) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + books.get(i).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
			}
			
		}
		
	}
	
	public void searchBookName(Graphics g, String name) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		g.drawString("Name Received: " + name, 50,50);
		
		g.setColor(Color.blue);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Book Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Author",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Pages",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Added",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(name.equalsIgnoreCase(books.get(i).name)) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + books.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
			}
			
		}
		
	}
	
	public void searchBookAuthor(Graphics g, String author) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		g.drawString("Author Received: " + author, 50,50);
		
		g.setColor(Color.blue);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Book Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Author",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Pages",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Added",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(author.equalsIgnoreCase(books.get(i).author)) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + books.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
			}
			
		}
		
	}
	
	public void searchBookPages(Graphics g, int pages) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		g.drawString("Pages Received: " + pages, 50,50);
		
		g.setColor(Color.blue);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Book Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Author",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Pages",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Added",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(pages == books.get(i).pages) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + books.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
			}
			
		}
		
	}
	
	public void searchUserEmail(Graphics g, String email) {
		
		int xInicial = x;
		int yInicial = y;
		int elementNumber = 5;
		int distance = boxWidth / elementNumber;
		
		g.setColor(Color.black);
		g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);

		g.drawString("Email Received: " + email, 50,50);
		
		g.setColor(Color.white);
		g.drawString("ID",xInicial + 10,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Name",xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Age",xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Email",xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
		g.drawString("Date Created",xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
		
		yInicial += this.boxHeigth + 1;
		int counter = 0;
		
		for(int i = 0; i < users.size(); i++) {
			
			if(email.equalsIgnoreCase(users.get(i).email)) {
				
				if(counter % 2 != 0) {
					
					g.setColor(Color.lightGray);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
					
					
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,boxWidth,boxHeigth);
					
				}
									
				g.setColor(Color.black);
				
				g.drawString("" + books.get(i - 1).id,xInicial + 10,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).name,xInicial + 10 + distance,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).author,xInicial + 10 + distance * 2,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).pages,xInicial + 10 + distance * 3,yInicial + (boxHeigth / 2) + 5);
				g.drawString("" + books.get(i - 1).dateCreated,xInicial + 10 + distance * 4,yInicial + (boxHeigth / 2) + 5);
				
				yInicial += boxHeigth + 1;
				counter++;
				
				
			}
			
		}
		
	}

}
