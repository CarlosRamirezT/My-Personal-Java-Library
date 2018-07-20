package MyLibrary;

import java.awt.*;

public class GloboPlus {
	
	public int width,x,y,desplazamiento,color;
	
	public GloboPlus() {
		
		this.x = (int)(Math.random() * 1200) + 1;
		this.y = (int)(Math.random() * 600) + 1;
		this.width = (int)(Math.random() * 500) + 1;
		this.desplazamiento = 10;
		this.color = (int)(Math.random() * 10) + 1;
		
	}
	
	public GloboPlus(int x,int y,int width,int color) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.color = color;
	}
	
	public GloboPlus(int x,int y,int width,String color) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.color = (int)(Math.random() * 10) + 1;
		
		String[] colors = {"blue","red","yellow","orange","green","gray","cyan","magenta","pink","black"};
		
		for(int i = 0; i < colors.length;i++) {
			
			if (color == colors[i]) {
				
				this.color = i + 1;
							
			}
			
		}
	}
	
	public void display(Graphics g) {
		
		switch(this.color) {
		
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
		
		g.fillOval(this.x,this.y,this.width,this.width);
		
	}
	
	public void moveRight() {
		
		this.x += this.desplazamiento;
		
	}
	
	public void moveLeft() {
		
		this.x -= this.desplazamiento;
		
	}
	
	public void moveUp() {
		
		this.y -= this.desplazamiento;
		
	}
	
	public void moveDown() {
		
		this.y += this.desplazamiento;
		
	}
	
			public void moveRight(int desplazamiento) {
		
		this.x += desplazamiento;
		
	}
	
	public void moveLeft(int desplazamiento) {
		
		this.x -= desplazamiento;
		
	}
	
	public void moveUp(int desplazamiento) {
		
		this.y -= desplazamiento;
		
	}
	
	public void moveDown(int desplazamiento) {
		
		this.y += desplazamiento;
		
	}
	
	public void setWidth(int width) {
		
		this.width = width;
		
	}

}
