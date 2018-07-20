package MyLibrary;

import MyLibrary.Cerillo;
import java.awt.*;

public class Nim {
	
	private Cerillo[] cerillo1;
	private Cerillo[] cerillo2;
	private Cerillo[] cerillo3;
	private int distancia = 0;
	private int widthCerillo = 30;
	private int heigthCerillo = 90;
	private int xInicial = 50;
	private int yInicial = 200;
	private int cantidadMaxima = 20;
	
	public Nim() {
		
		cerillo1 = new Cerillo[(int)(Math.random() * cantidadMaxima) + 1];
		cerillo2 = new Cerillo[(int)(Math.random() * cantidadMaxima) + 1];
		cerillo3 = new Cerillo[(int)(Math.random() * cantidadMaxima) + 1];
		
		int xCerillo = xInicial;
		int yCerillo = yInicial;
		
		for(int i = 0; i < cerillo1.length ;i++) {
			
			cerillo1[i] = new Cerillo(xCerillo,yCerillo,widthCerillo,heigthCerillo);
			xCerillo += widthCerillo + distancia;
			
		}
		
		xCerillo = xInicial;
		yCerillo += heigthCerillo + distancia;
		
		for(int i = 0; i < cerillo2.length ;i++) {
			
			cerillo2[i] = new Cerillo(xCerillo,yCerillo,widthCerillo,heigthCerillo);
			xCerillo += widthCerillo + distancia;
			
		}
		
		xCerillo = xInicial;
		yCerillo += heigthCerillo + distancia;
		
		for(int i = 0; i < cerillo3.length ;i++) {
			
			cerillo3[i] = new Cerillo(xCerillo,yCerillo,widthCerillo,heigthCerillo);
			xCerillo += widthCerillo + distancia;
			
		}
		
		
	}
	
	public void display(Graphics g) {
		
		for(int i = 0; i < cerillo1.length;i++){
			
			cerillo1[i].display(g);
			
		}
		
		for(int i = 0; i < cerillo2.length;i++){
			
			cerillo2[i].display(g);
			
		}

		for(int i = 0; i < cerillo3.length;i++){
	
			cerillo3[i].display(g);
	
		}
		
	}
	
	public int getIndex(int xPosition) {
		
		
		int index = (xPosition - this.xInicial) / this.widthCerillo;
		return index;	
		
	}
	
	public int getLine(int yPosition) {
		
		int index = (yPosition - this.yInicial) / this.heigthCerillo;
		return index;
		
	}
	
	public void deleteItem(int line,int index) {
		
		switch(line) {
		
		case 0 : cerillo1[index].width = 0; cerillo1[index].heigth = 0; break;
		case 1 : cerillo2[index].width = 0; cerillo1[index].heigth = 0; break;
		case 2 : cerillo3[index].width = 0; cerillo1[index].heigth = 0; break;
		
		}
		
	}

}
