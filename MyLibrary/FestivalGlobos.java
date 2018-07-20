package MyLibrary;

import java.awt.*;

public class FestivalGlobos {
		
	private GloboPlus[] globos;
	
	public FestivalGlobos(int cantidad) {
		
		globos = new GloboPlus[cantidad];
		
		for(int i = 0; i < globos.length; i++) {
			
			globos[i] = new GloboPlus();
			
		}
		
	}
	
	public void display(Graphics g) {
		
		for(int i = 0; i < globos.length; i++) {
			
			globos[i].display(g);
			
		}
		
	}
	
	public void moveRight() {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveRight();
			
		}
		
	}
	
	public void moveLeft() {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveLeft();
			
		}
		
	}
	
	public void moveUp() {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveUp();
			
		}
		
	}
	
	public void moveDown() {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveDown();
			
		}
		
	}
	
	public void moveRight(int desplazamiento) {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveRight(desplazamiento);
			
		}
		
	}
	
	public void moveLeft(int desplazamiento) {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveLeft(desplazamiento);
			
		}
		
	}
	
	public void moveUp(int desplazamiento) {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveUp(desplazamiento);
			
		}
		
	}
	
	public void moveDown(int desplazamiento) {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].moveDown(desplazamiento);
			
		}
		
	}
	
	public void setWidth(int width) {
		
		for(int i = 0; i < globos.length;i++) {
			
			globos[i].setWidth(width);
			
		}
		
	}
	
	

}
