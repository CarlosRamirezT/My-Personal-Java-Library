package MyLibrary;

import java.awt.*;

public class Globo {
	
	private int x;
	private int y;
	private int radio;
	
	public Globo() {
		
		this.x = 50;
		this.y = 50;
		this.radio = 20;
		
	}
	
	public void mostrar(Graphics g) {
		
		g.drawOval(this.x - radio,this.y - radio,this.radio * 2,this.radio * 2);
		
	}
	
	public void cambiarTamaño(float factor) {
		
		radio = (int) (radio * factor);
				
	}
	
	
	
	

}
