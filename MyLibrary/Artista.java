package MyLibrary;

import java.awt.*;

public class Artista {
	
	private int altura = 25, anchura = 75;
	private String nombre;
	
	public Artista(String artistaName) {
		
		this.nombre = artistaName;
		
	}
	
	public void mostrar(Graphics g,int x, int y, boolean seleccionado) {
		
		if(seleccionado) {
			
			g.setColor(Color.lightGray);
			g.fillRect(x,y,anchura,altura);
			g.setColor(Color.black);
			
		}else {
			
			g.drawRect(x,y,anchura,altura);
			g.drawString(nombre,x + 5,y + 20);
			
		}
	}

}
