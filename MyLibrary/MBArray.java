package MyLibrary;

import java.awt.*;

public class MBArray {
	
	public static void displayBInts(Graphics g,int x, int y, int[][] bArray) {
		
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		int width = 25;
		int heigth = 25;
		
		int xInicial = x + width;
		int yInicial = y + heigth;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				g.drawString("" + o,xInicial + width / 2,y + heigth / 2);
				g.drawString("" + i,x + width / 2,yInicial + heigth / 2);
				
				g.drawRect(xInicial,yInicial,width,heigth);
				g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
				xInicial += width;
				
			}
			
			xInicial = x + width;
			yInicial += heigth;
			
		}
		
		
	}
	
	public static void displayBInts(Graphics g,int x, int y, int width, int heigth, int[][] bArray) {
		
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		
		
		int xInicial = x + width;
		int yInicial = y + heigth;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				g.drawString("" + o,xInicial + width / 2,y + heigth / 2);
				g.drawString("" + i,x + width / 2,yInicial + heigth / 2);
				
				g.drawRect(xInicial,yInicial,width,heigth);
				g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
				xInicial += width;
				
			}
			
			xInicial = x + width;
			yInicial += heigth;
			
		}
		
		
	}
	
	public static void displayChessboard(Graphics g,int x, int y, int[][] bArray) {
		
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		int width = 50;
		int heigth = 50;
		
		int xInicial = x + width;
		int yInicial = y + heigth;
		int counter = 1;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				g.setColor(Color.black);
				
				g.drawString("" + o,xInicial + width / 2,y + heigth / 2);
				g.drawString("" + i,x + width / 2,yInicial + heigth / 2);
				
				if(counter % 2 == 0) {
					
					g.setColor(Color.black);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.white);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
				
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
					
				}
				
				counter++;
				
			}
			
			counter++;
			xInicial = x + width;
			yInicial += heigth;
			
		}
		
		
	}

	public static void displayChessboard(Graphics g,int x, int y, int width, int[][] bArray) {
	
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		int heigth = width;
		
		int xInicial = x + width;
		int yInicial = y + heigth;
		int counter = 1;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				g.setColor(Color.black);
				
				g.drawString("" + o,xInicial + width / 2,y + heigth / 2);
				g.drawString("" + i,x + width / 2,yInicial + heigth / 2);
				
				if(counter % 2 == 0) {
					
					g.setColor(Color.black);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.white);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
				
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
					
				}
				
				counter++;
				
			}
			
			counter++;
			xInicial = x + width;
			yInicial += heigth;
			
		}
	
	
	}
	
	public static void displayChessboardIndex(Graphics g,int x, int y, int width, String[][] bArray) {
		
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		int heigth = width;
		
		int xInicial = x + width;
		int yInicial = y + heigth;
		int counter = 1;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				g.setColor(Color.black);
				
				g.drawString("" + o,xInicial + width / 2,y + heigth / 2);
				g.drawString("" + i,x + width / 2,yInicial + heigth / 2);
				
				if(counter % 2 == 0) {
					
					g.setColor(Color.black);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.white);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
				
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					xInicial += width;
					
				}
				
				counter++;
				
			}
			
			counter++;
			xInicial = x + width;
			yInicial += heigth;
			
		}
	
	
	}
	
	public static void displayChessboard(Graphics g,int x, int y, int width, String[][] bArray) {
		
		/*
		 * this methos displays a bidimensional array using a table
		 */
		
		//int [][] bArraydos = new int[4][7];
		int heigth = width;
		
		int xInicial = x;
		int yInicial = y;
		int counter = 1;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				if(counter % 2 == 0) {
					
					g.setColor(Color.black);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.white);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					
				
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					
				}
				
				xInicial += width;
				counter++;
				
			}
			
			counter++;
			xInicial = x;
			yInicial += heigth;
			
		}
	
	
	}
	
	public static void displayChessboard(Graphics g,int x, int y, int width) {

		String[][] bArray = new String[8][8];
		int heigth = width;
		
		int xInicial = x;
		int yInicial = y;
		int counter = 1;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
				if(counter % 2 == 0) {
					
					g.setColor(Color.black);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.white);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					
				
				}else {
					
					g.setColor(Color.white);
					g.fillRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
					
				}
				
				xInicial += width;
				counter++;
				
			}
			
			counter++;
			xInicial = x;
			yInicial += heigth;
			
		}
	
	
	}
	
	public static void displayBStrings(Graphics g,int x, int y, int width, String[][] bArray) {

		int heigth = width;
		
		int xInicial = x;
		int yInicial = y;
		
		for(int i = 0; i < bArray.length; i++) {
				
			for(int o = 0; o < bArray.length; o++) {
				
					g.drawRect(xInicial,yInicial,width,heigth);
					g.setColor(Color.black);
					g.drawString("" + bArray[i][o],xInicial + 2,yInicial + heigth / 2 + 2);
	
				
				xInicial += width;
				
				
			}
			
			xInicial = x;
			yInicial += heigth;
			
		}
	
	
	}
	
	public static void fillBInts(int[][] array) {
		
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
				
			for(int o = 0; o < array.length; o++) {
				
				array[o][i] = counter;
				counter++;
				
			}
			
		}
		
	}
	
	public static void fillBStrings(String[][] array, String counter) {
				
		for(int i = 0; i < array.length; i++) {
				
			for(int o = 0; o < array.length; o++) {
				
				array[o][i] = counter;
				
			}
			
		}
		
	}
	
	public static void multiplyBInts(int[][] array, int element) {
		
		for(int i = 0; i < array.length; i++) {
				
			for(int o = 0; o < array.length; o++) {
				
				array[o][i] *= element;
				
			}
			
		}
		
	}
	
	public static int addBInts(int[][] array) {
		
		int addition = 0;
		
		for(int i = 0; i < array.length; i++) {
				
			for(int o = 0; o < array.length; o++) {
				
				addition += array[o][i];
				
				
			}
			
		}
		
		return addition;
		
	}
	
	public static int addBLine(int[][] array, int line) {
		
		int addition = 0;
				
			for(int o = 0; o < array[line].length; o++) {
				
				addition += array[line][o];
				
				
			}
			
		return addition;
		
	}
	
	public static int addBcolum(int[][] array, int colum) {
		
		int addition = 0;
				
			for(int o = 0; o < array.length; o++) {
				
				addition += array[o][colum];
				
				
			}
			
		return addition;
		
	}

}
