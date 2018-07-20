package MyLibrary;

import java.awt.*;


public class GloboUltimate {
	
	private int cantidadGlobos;
	
	private int[] colorGlobos;
	private int[] xGlobos;
	private int[] yGlobos;
	private int[] widthGlobos;
	
	private int distancia = 100;
	
	public GloboUltimate(int cantidad) {
		
		this.cantidadGlobos = cantidad;
		
		 colorGlobos = new int[cantidadGlobos];
		 xGlobos = new int[cantidadGlobos];
		 yGlobos = new int[cantidadGlobos];
		 widthGlobos = new int[cantidadGlobos];
		 
		 for(int i = 0; i < this.cantidadGlobos;i++) {
			 
			 colorGlobos[i] = (int)(Math.random() * 10) + 1;
			 widthGlobos[i] = 200;
			 xGlobos[i] = 50 + widthGlobos[i] +  distancia * 2 * i;
			 yGlobos[i] = 50;
			 
					 
		 }
		
	}
		
	public void display(Graphics g) {
		
		for(int i = 0; i < colorGlobos.length; i++) {
						
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
	
	public void setCantidad(int cantidad) {
		
		this.cantidadGlobos = cantidad;
		
	}
	
	public void setColor(int index,int color) {
		
		colorGlobos[index] = color;
		
	}
	
	public void setX(int index, int x) {
		
		xGlobos[index] = x;
		
	}
	
	public void setY(int index, int y) {
		
		yGlobos[index] = y;
		
	}

	public void setWidth(int index, int width) {
	
		widthGlobos[index] = width;
	
	}
	
	public void setValuesClick(int x, int y) {
		
		for(int i = 0;i < xGlobos.length;i++) {
		
		this.xGlobos[i] = x - widthGlobos[i] / 2;
		this.yGlobos[i] = y - widthGlobos[i] / 2;
		
		}
		
	}
	
	public int getIndex(int x,int y) {
		
		int value = 0;
		
		for(int i = 0; i < xGlobos.length;i++) {
			
			if(x > xGlobos[i] && x < xGlobos[i] + widthGlobos[i]) {
				
				if(y > yGlobos[i] && x < yGlobos[i] + widthGlobos[i]) {
					
					value = i;
					
				}else {
					
					value = 0;
				}
								
			}else {
				
				value = 0;
			}
			
		}
		
		return value;
		
	}
	
	public int selectColorNumber(String colorSelected) {
		
		int colorValue = 0;
		
		switch(colorSelected) {
		
		case "blue": colorValue = 1; break;
		case "red" : colorValue = 2; break;
		case "yellow" : colorValue = 3; break;
		case "orange" : colorValue = 4; break;
		case "green" : colorValue = 5; break;
		case "gray" : colorValue = 6; break;
		case "cyan" : colorValue = 7; break;
		case "magenta" : colorValue = 8; break;
		case "pink" : colorValue = 9; break;
		case "black" : colorValue = 10; break;
		default: colorValue = 0;
		
		}
		
		return colorValue;
		
	}

}
