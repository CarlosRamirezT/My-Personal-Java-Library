package MyLibrary;

import java.awt.*;

public class Tabla {
	
	private final int tablaTamaño = 7;
	
	private int[] lluvia = new int[tablaTamaño];
	private int indice;
	private int nuevoValor;
	private int suma = 0;
	
	private final int xInicial = 20;
	private final int yInicial = 60;
	private final int cuadroAltura = 20;
	private final int cuadroAncho = 60;
	
	public void display(Graphics g) {
		
		int y = yInicial;
		
		for(int s = 0; s< lluvia.length;s++) {
			
			g.drawRect(xInicial,y,cuadroAncho,cuadroAltura);
			g.drawString(Integer.toString(lluvia[s]),xInicial,y + cuadroAltura * 3 / 4);
			
			y = y + cuadroAltura;
			
		}
		
		sumarValores();
		g.drawString("La caida pluvial total es " + suma,100,100);
		
	}
	
	public void seleccionarComponente(int y) {
		
		indice = (y - yInicial) / cuadroAltura;
		lluvia[indice] = nuevoValor;
		
	}
	
	public void establecerValor(int valor) {
		
		nuevoValor = valor;
		
	}
	
	private void sumarValores() {
		
		suma = 0;
		
		for(int s = 0;s < lluvia.length;s++) {
			
			suma += lluvia[s];
			
		}
	}

}
