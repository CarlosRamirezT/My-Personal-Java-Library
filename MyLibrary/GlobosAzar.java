package MyLibrary;

import java.awt.*;

public class GlobosAzar {
	
	private int[] xGlobos;
	private int[] yGlobos;
	private int[] widthGlobos;
	private int[] colorGlobos;
	
	public GlobosAzar(int cant) {
		
		xGlobos = new int[cant];
		yGlobos = new int[cant];
		widthGlobos = new int[cant];
		colorGlobos = new int[cant];
		
		for(int i = 0; i < cant; i++) {
			
			xGlobos[i] = (int)(Math.random() * 900) + 1;
			yGlobos[i] = (int)(Math.random() * 400) + 1;
			widthGlobos[i] = (int)(Math.random() * 400) + 1;
			colorGlobos[i] = (int)(Math.random() * 10) + 1;
			
		}
		
	}
	
	public void display(Graphics g) {
		
		for(int i = 0; i < xGlobos.length; i++) {
			
			switch(colorGlobos[i]) {
			
			case 1 : g.setColor(Color.blue); break;
			case 2 : g.setColor(Color.red); break;
			case 3 : g.setColor(Color.yellow); break;
			case 4 : g.setColor(Color.orange); break;
			case 5 : g.setColor(Color.green); break;
			case 6 : g.setColor(Color.gray); break;
			case 7 : g.setColor(Color.cyan); break;
			case 8 : g.setColor(Color.magenta); break;
			case 9 : g.setColor(Color.pink); break;
			case 10 : g.setColor(Color.black); break;
			
			}
			
			g.fillOval(xGlobos[i],yGlobos[i],widthGlobos[i],widthGlobos[i]);
			
		}
	}
	
	public void inflate(int width) {
		
		for(int i = 0; i < widthGlobos.length; i++) {
			
			widthGlobos[i] = width;
			
		}
		
	}
	
	public void moveDown(int move) {
		
		for (int i = 0; i < yGlobos.length; i++) {
			
			yGlobos[i] += move;
			
		}
		
	}
	
	public void moveUp(int move) {
		
		for (int i = 0; i < yGlobos.length; i++) {
			
			yGlobos[i] -= move;
			
		}
		
	}

	public void moveLeft(int move) {
		
		for (int i = 0; i < xGlobos.length; i++) {
			
			xGlobos[i] -= move;
			
		}
	
	}

	public void moveRight(int move) {
		
		for (int i = 0; i < xGlobos.length; i++) {
			
			xGlobos[i] += move;
			
		}
	
	}

}
