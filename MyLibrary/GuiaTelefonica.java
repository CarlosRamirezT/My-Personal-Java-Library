package MyLibrary;


import java.awt.*;
import MyLibrary.Contacto;

public class GuiaTelefonica {
	
	private Contacto[] phoneAgenda;
	
	public GuiaTelefonica(int cantidad) {
		
		phoneAgenda = new Contacto[cantidad];
		
		for(int i = 0; i < cantidad;i++) {
			
			phoneAgenda[i] = new Contacto();
			
		}
	}
	
	public void display(Graphics g,int x,int y) {
		
		for(int i = 0; i < phoneAgenda.length;i++) {
			
			if(phoneAgenda[i].name != "empty") {
		
			g.drawString(i + " --> Name: " + phoneAgenda[i].name + " Number: " + phoneAgenda[i].number,x,y + 15 * i);
			
			}
			
		}
	}
	
	public void addContact(String nombre, String numero) {
		
		for(int i = 0; i < phoneAgenda.length;i++) {
			
			if(phoneAgenda[i].name == "empty") {
				
				phoneAgenda[i].name = nombre;
				phoneAgenda[i].number = numero;
				break;
				
			}else {
				
				continue;
				
			}
			
		}
		
	}
	
	public String search(String nameGiven) {
		
		String numberValue = "Number not Found";
		
		for(int i = 0; i < phoneAgenda.length;i++) {
			
			if(phoneAgenda[i].name == nameGiven) {
				
				numberValue = phoneAgenda[i].number;
				break;
				
			}else {
				
				continue;
				
			}
	
		}
		
		return numberValue;
		
	}

}
