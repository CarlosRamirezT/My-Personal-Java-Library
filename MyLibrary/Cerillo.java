package MyLibrary;

import java.awt.*;

public class Cerillo {
	
	public int x,y,width,heigth;
	
	public Cerillo() {
		
		this.x = 50;
		this.y = 50;
		this.width = 90;
		this.heigth = 30;
		
	}
	
	public Cerillo(int x,int y, int width, int heigth) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
		
	}
	
	public void display(Graphics g) {
		
		g.setColor(Color.black);
		g.drawRect(this.x,this.y,this.width,this.heigth);
		g.setColor(Color.red);
		g.fillRect(this.x,this.y,this.heigth / 3, this.width);
		
	}

}
