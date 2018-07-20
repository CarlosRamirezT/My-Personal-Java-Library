package MyLibrary;

import java.awt.*;
import MyLibrary.MyArreglo;

public class Graficos {
	
	public static int sumaInts(int[] data) {
		
		int total = 0;
		
		for(int i = 0; i < data.length; i++) {
			
			total += data[i];
			
		}
		
		return total;
		
	}
	
	public static void selectColor(Graphics g, int color) {
				
		switch(color) {
		
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
		default : g.setColor(Color.darkGray); break;
		
		}
				
	}
	
	public static void selectRandomColor(Graphics g) {
		
		int color = (int)(Math.random() * 10) + 1;
		selectColor(g,color);
		
	}
	
	public static int biggestInt(int[] arreglo) {
		
		int mayor = arreglo[0];
		
		for(int i = 0; i < arreglo.length;i++) {
			
			if(arreglo[i] > mayor) {
				
				mayor = arreglo[i];
				
			}
			
		}
		
		return mayor;
		
	}
	
	public static int[] escalarValores(int[] datos, int mayor, int yAltura) {
		
		int[] escalados = new int[datos.length];
		
			for(int i = 0; i < datos.length; i++) {
				
				escalados[i] = (datos[i] * yAltura) / mayor;
				
			}
		
		return escalados;
		
	}
	
	public static int[] escalarValores(int[] datos, int yAltura) {
		
		int mayor = biggestInt(datos);
		
		int[] escalados = new int[datos.length];
		
			for(int i = 0; i < datos.length; i++) {
				
				escalados[i] = (datos[i] * yAltura) / mayor;
				
			}
		
		return escalados;
		
	}
	
	public static int[] escalarValoresCake(int[] datos) {
		
		int suma = sumaInts(datos);		
		int[] escalados = new int[datos.length];
		
			for(int i = 0; i < datos.length; i++) {
			
				escalados[i] = (datos[i] * 360) / suma;
				
			}
		
		return escalados;
		
	}
	
	public static void displayBars(Graphics g,int xG,int yG,int[] datos) {
		
		int mayor;
		int[] datosEscalados = new int[datos.length];
		
		int yInicial = yG;
		int yAltura = 200;
		int xInicial = xG;
		int anchura = 30;
		int hueco = 10;
		
		mayor = biggestInt(datos);	
		datosEscalados = escalarValores(datos, mayor, yAltura);
		
		int x = xInicial;
		
		for(int contador = 0;contador < datosEscalados.length;contador++) {
			
			selectColor(g,contador + 1);
			g.fillRect(x + 25,yInicial + yAltura - datosEscalados[contador],anchura,datosEscalados[contador]);
			
			/* mostrando las cantidades de las barras del lado izquierdo
			 * 
			g.setColor(Color.black);
			g.drawString("" + datos[contador],xInicial,yInicial + yAltura - datosEscalados[contador]);
			g.drawString("" + (contador + 1),x + 25,yInicial + yAltura + 25);
			*/
			
			g.setColor(Color.black);
			// bars data
			g.drawString("" + datos[contador],x + 25,yInicial + yAltura - datosEscalados[contador] - 2);
			// element index data
			g.drawString("" + (contador + 1),x + 25,yInicial + yAltura + 25);
			
			x = x + anchura + hueco;
			
			
		
		}
		
		// testing data flow MyArreglo.printInts(g,50,400,datosEscalados);
		
	}
	
	public static void displayCake(Graphics g,int x, int y, int width,int[] data) {
		
		int[] escalados = escalarValoresCake(data);
		int anguloInicial = 0;
		int xInicial = x + width + 25;
		int widthRect = 15;
			
		for(int i = 0; i < data.length; i++) {
			
			selectColor(g,i + 1);
			g.fillArc(x,y,width,width,anguloInicial,escalados[i]);
			anguloInicial += escalados[i];
			
			g.fillRect(xInicial,y + 2 + widthRect * i,widthRect,widthRect);
			g.setColor(Color.black);
			g.drawString("" + data[i],xInicial + widthRect + 10,y + 15 * (i + 1));
			
		}
		
		
	}
	
	public static void displayFunctionGraphic(Graphics g, int x, int y, int width, float[] data) {
		
		
		
	}
	
	public static int[] histograma(int[] array) {
		
		int[] histograma = new int[10];
		
		/*
		 * histograma[0] = 0 a 9;
		 * histograma[1] = 10 a 19;
		 * histograma[2] = 20 a 29;
		 * histograma[3] = 30 a 39;
		 * histograma[4] = 40 a 49;
		 * histograma[5] = 50 a 59;
		 * histograma[6] = 60 a 69;
		 * histograma[7] = 70 a 79;
		 * histograma[8] = 80 a 89;
		 * histograma[9] = 90 a 99;
		 */
		
		// filling the array with 0 so every value is set to 0 initialy
		MyArreglo.fillInts(histograma,0); 
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] >= 0 && array[i] <= 9) {
				
				histograma[0]++;
				
			}else if(array[i] >= 10 && array[i] <= 19) {
				
				histograma[1]++;
				
			}else if(array[i] >= 20 && array[i] <= 29) {
				
				histograma[2]++;
				
			}else if(array[i] >= 30 && array[i] <= 39) {
				
				histograma[3]++;
				
			}else if(array[i] >= 40 && array[i] <= 49) {
				
				histograma[4]++;
				
			}else if(array[i] >= 50 && array[i] <= 59) {
				
				histograma[5]++;
				
			}else if(array[i] >= 60 && array[i] <= 69) {
				
				histograma[6]++;
				
			}else if(array[i] >= 70 && array[i] <= 79) {
				
				histograma[7]++;
				
			}else if(array[i] >= 80 && array[i] <= 89) {
				
				histograma[8]++;
				
			}else if(array[i] >= 90 && array[i] <= 99) {
				
				histograma[9]++;
				
			}
			
		}
		
		return histograma;
		
	}

}
