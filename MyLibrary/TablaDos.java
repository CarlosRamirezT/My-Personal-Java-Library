package MyLibrary;

import java.awt.*;
import MyLibrary.MyArreglo;

public class TablaDos{
	
	private int tableLength;
	private int xInicial;
	private int yInicial;
	private int tableWidth;
	private int tableHeight;
	
	private String[] names;
	
	private String value;
	
	private int indice;
	
	public TablaDos(int xInicial,int yInicial,int tableWidth,int tableHeight,int tableLength) {
		
		this.tableLength = tableLength;
		this.xInicial = xInicial;
		this.yInicial = yInicial;
		this.tableWidth = tableWidth;
		this.tableHeight = tableHeight;
		
		this.names = new String[tableLength];
		
		MyArreglo.fillStrings(names,"Empty");
		
	}
	
	public void show(Graphics g) {
		
		int y = yInicial;
		
		for(int i = 0; i < names.length; i++) {
			
			g.drawRect(xInicial,y,tableWidth,tableHeight);
			g.drawString(names[i],xInicial + 15,y + tableHeight * 3 / 4);
			
			y += tableHeight;
			
		}
		
	}
	
	public void selectComponent(int y) {
		
		indice = (y - yInicial) / tableHeight;
		names[indice] = value;
		
	}
	
	public void selectValue(String value) {
		
		this.value = value;
		
	}
	
}
