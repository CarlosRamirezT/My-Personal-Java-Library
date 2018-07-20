package MyLibrary;

import java.applet.Applet;
import java.awt.*;


public class Motion{
	
	/*
	 * Motion class describes an object able to:
	 * 
	 * move up, down, left, right, 
	 * to have  a color
	 * to change the color to a random one and to set the color to an specific one
	 * to have a width and a height and change it
	 * and to be able to be reseted to default values seted
	 */
	
	protected int x , y , width , height;
	protected int cambio = 50;
	protected int color;
	
	public Motion(){
		
		this.x = 50;
		this.y = 50;
		this.width = 50;
		this.height = 50;
		this.color = 10;
		
	}
	
	public Motion(int x, int y, int width, int height, int color) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		
	}
	
	public void show(Graphics g) {
		
		g.drawRect(this.x,this.y,this.width,this.height);
		
	}
	
	public void reset() {
		
		this.x = 50;
		this.y = 50;
		this.width = 50;
		this.height = 50;
		this.color = 10;
		
	}
	
	public void moveUp() {
		
		this.y -= cambio;
		
	}
	
	public void moveDown() {
		
		this.y += cambio;
		
	}
	
	public void moveRight() {
		
		this.x += cambio;
		
	}
	
	public void moveLeft() {
		
		this.x -= cambio;
		
	}
	
	public void moveUp(int desplazamiento) {
		
		this.y -= desplazamiento;
		
	}
	
	public void moveDown(int desplazamiento) {
		
		this.y += desplazamiento;
		
	}
	
	public void moveRight(int desplazamiento) {
		
		this.x += desplazamiento;
		
	}
	
	public void moveLeft(int desplazamiento) {
		
		this.x -= desplazamiento;
		
	}
	
	public void changeWidth(int width) {
		
		this.width = width;
		
	}
	
	public void changeHeight(int height) {
		
		this.height = height;
		
	}
	
	public void setColor(int color) {
		
		this.color = color;
		
	}
	
	public void changeColor() {
		
		this.color = (int)(Math.random() * 10) + 1;
		
	}
	
}
