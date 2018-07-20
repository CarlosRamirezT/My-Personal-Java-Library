package MyLibrary;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Interes {
	
	private float cantidad,tasaInteres;
	
	public Interes() {
		
		this.cantidad = 0;
		this.tasaInteres = 0;
		
	}
	
	public Interes(float cantidad, float tasaInteres) {
		
		this.cantidad = cantidad;
		this.tasaInteres = tasaInteres;
		
	}
	
	public static float calcularGanacia(float cantidad, float tasaInteres, float año) {
		
		return cantidad + (cantidad * (tasaInteres / 100) * año);
		
	}

}
