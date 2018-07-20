package MyLibrary;

import java.applet.Applet;
import java.awt.*;

public class Account extends Applet {
	
	protected int accountNumber, balance;
	protected String clientName;
	
	protected static int classCounter;
	
	public Account() {
		
		classCounter++;
		
		this.accountNumber = classCounter;
		this.balance = 0;
		this.clientName = "N/A";
		
	}
	
	public Account(int accountNumber, String clientName) {
		
		classCounter++;
		
		this.accountNumber = accountNumber;
		this.clientName = clientName;
		this.balance = 0;
		
	}
	
	public void show(Graphics g) {
		
		g.drawString("La cuenta numero: " + this.accountNumber + ", a nombre  de: " + clientName + ", Cuenta con un balance de: " + this.balance,50,50);
		
	}
	
	public void reset() {
				
		this.balance = 0;
		this.clientName = "N/A";
		
	}
	
	public void deposit(int depositValue) {
		
		this.balance += depositValue;
		
	}
	
	public void withdraw(int widthdrawValue) {
		
		this.balance -= widthdrawValue;
		
	}
	
	public void changeClient(String newClient) {
		
		this.clientName = newClient;
		
	}
	
	public int getBalance() {
		
		return this.balance;
		
	}
	
	public String getClientName() {
		
		return this.clientName;
		
	}
	
	public int getAccountNumber() {
		
		return this.accountNumber;
		
	}

}
