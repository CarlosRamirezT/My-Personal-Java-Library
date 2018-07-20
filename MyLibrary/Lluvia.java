package MyLibrary;

import java.awt.*;

public class Lluvia {
	
	protected int[] caidas = new int[7];
	protected int squareWidth,squareHeigth,x,y,caidaTotal;
	
	public Lluvia() {
		
		this.squareWidth = 100;
		this.squareHeigth = 30;
		this.x = 50;
		this.y = 50;
		
	}
	
	public Lluvia(int x, int y, int squareWidth, int squareHeigth) {
		
		this.x = x;
		this.y = y;
		this.squareWidth = squareWidth;
		this.squareHeigth = squareHeigth;
		
		for(int i = 0; i < caidas.length; i++) {
			
			caidas[i] = 10;
			
		}
		
	}
	
	public void setDataRamdon() {
		
		for(int i = 0; i < caidas.length; i++) {
			
			caidas[i] = (int)(Math.random() * 100) + 1;
			
		}
		
	}

	public void display(Graphics g) {
		
		int xInicial = this.x;
		int yInicial = this.y;
		int biggestIndex = getIndexByElement(getBiggest());
		int smallestIndex = getIndexByElement(getSmallest());
		
		for(int i = 0;i < caidas.length; i++) {
			
			if(i == biggestIndex) {
				
				g.setColor(Color.blue);
				g.fillRect(xInicial,yInicial,this.squareWidth,this.squareHeigth);
				g.drawString(i + 1 +  " Año",xInicial + this.squareWidth + 25,yInicial + (this.squareHeigth / 2));
				g.setColor(Color.white);
				g.drawString("" + caidas[i],xInicial + 15,yInicial + (this.squareHeigth / 2));
				
				
			}else if(i == smallestIndex) {
				
				g.setColor(Color.green);
				g.fillRect(xInicial,yInicial,this.squareWidth,this.squareHeigth);
				g.drawString(i + 1 +  " Año",xInicial + this.squareWidth + 25,yInicial + (this.squareHeigth / 2));
				g.setColor(Color.white);
				g.drawString("" + caidas[i],xInicial + 15,yInicial + (this.squareHeigth / 2));
				
			}else {
				
				g.setColor(Color.black);
			
				g.drawRect(xInicial,yInicial,this.squareWidth,this.squareHeigth);
				g.drawString("" + caidas[i],xInicial + 15,yInicial + (this.squareHeigth / 2));
				g.drawString(i + 1 +  " Año",xInicial + this.squareWidth + 25,yInicial + (this.squareHeigth / 2));
			
			}
			
			yInicial += this.squareHeigth;
			
		}
		
		
		yInicial += 25;
		g.setColor(Color.black);
		g.drawString("La Precipitacion Total es de : " + caidaTotal(),xInicial + 15,yInicial);
		g.setColor(Color.blue);
		g.drawString("La Precipitacion Mayor es de : " + getBiggest(),xInicial + 15,yInicial + 15);
		g.setColor(Color.green);
		g.drawString("La Precipitacion Menor es de : " + getSmallest(),xInicial + 15,yInicial + 15 * 2);
		
		
	}
	
	private int caidaTotal() {
		
		int caidaTotal = 0;
		
		for(int i = 0;i < caidas.length; i++) {
			
			caidaTotal += caidas[i];
			
		}
		
		return caidaTotal;
		
	}
	
	public int selectIndex(int xPosition, int yPosition) {
		
		int index = 404;
		
		if(xPosition >= this.x && xPosition <= this.x + this.squareWidth) {
			
			index = (yPosition - this.y) / this.squareHeigth;
			
		}
		
		return index;
		
	}
	
	public void setElement(int index,int value) {
		
		try {
		
		this.caidas[index] = value; 
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			// continue executing
			
		}
		
	}
	
	public void setAllElements(int value) {
		
		for(int i = 0; i < caidas.length; i++ ) {
			
			this.caidas[i] = value; 
			
		}
		
	}
	
	public int getIndexByElement(int element){
		
		int index = 404;
		
		for(int i = 0; i < caidas.length; i++) {
			
			if(caidas[i] == element) {
				
				index = i;
				break;
				
			}
			
		}
		
		return index;
		
	}
	
	public int getBiggest() {
		
		int biggest = this.caidas[0];
		
		for(int i = 0; i < caidas.length; i++ ) {
			
			if(this.caidas[i] > biggest) {
				
				biggest = this.caidas[i];
				
			}
			
		}
		
		return biggest;
		
	}
	
	public int getSmallest() {
		
		int smallest = this.caidas[0];
		
		for(int i = 0; i < caidas.length; i++ ) {
			
			if(this.caidas[i] < smallest) {
				
				smallest = this.caidas[i];
				
			}
			
		}
		
		return smallest;
		
	}
	
	public int[] getData() {
		
		return this.caidas;
		
	}

}
