package MyLibrary;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Registradora extends Applet{
	
	private ArrayList<String> articulos;
	private ArrayList<Integer> cantidades,precios,subtotales;
	private int precio,cantidad,subtotal,total;
	private String articulo;
	private int linea, distancia = 150,distanciaf = 50, totalFactura;
	private static int conteoFactura = 0;
	private Date fecha = new Date();
	private DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	
	public Registradora() {
		
		cantidades = new ArrayList<Integer>();
		articulos = new ArrayList<String>();
		precios = new ArrayList<Integer>();
		subtotales = new ArrayList<Integer>();
		
	}
	
	public void show(Graphics g) {
		
		linea = 6;
		
		g.drawString("Cantidad",50,15 * linea);
		g.drawString("Articulo",50 + distancia,15 * linea);
		g.drawString("Precio",50 + distancia * 2,15 * linea);
		g.drawString("Subtotal",50 + distancia * 3,15 * linea);
		
		linea = 8;
		
		for(int cant : cantidades) {
			
			g.drawString("" + cant,50,15 * linea);
			linea++;
			
		}
		
		linea = 8;
		
		for(String art : articulos) {
			
			g.drawString(art,50 + distancia,15 * linea);
			linea++;
			
		}
		
		linea = 8;

		for(int prec : precios) {
			
			g.drawString("RD$ " + prec,50 + distancia * 2,15 * linea);
			linea++;
	
		}
		
		linea = 8;

		for(int sub : subtotales) {
			
			g.drawString("RD$ " + sub,50 + distancia * 3,15 * linea);
			linea++;
			total += sub;
	
		}
		
		linea += 2;
		g.drawString("Total: RD$ " + total,distancia * 3 + 15,15 * linea);
		
		total = 0;
		
	}
	
	public void reset() {
		
		cantidades.clear();
		articulos.clear();
		precios.clear();
		subtotales.clear();
		
	}
	
	public void addItem(int cantidad,String articulo,int precio,int subtotal) {
		
		cantidades.add(cantidad);
		articulos.add(articulo);
		precios.add(precio);
		subtotales.add(subtotal);
		
	}
	
	
	public void eraseItem() {
		
		int index = articulos.size() - 1;
		
		cantidades.remove(index);
		articulos.remove(index);
		precios.remove(index);
		subtotales.remove(index);
		
	}
	
	public void printRecipe(Graphics g) {
		
		int x = 600,y = 80,width = 400,height = 520, l = 2;
		g.drawRect(x,y,width,height);
		
		if(articulos.size() > 0) {
			
			conteoFactura++;
			
			String nombreCajero = "Carlos Daniel Ramirez";
			String date = "" + hourdateFormat.format(fecha);			
		
			g.drawString("Cadara Supermarket",x + width / 3,y + 15 * l);
			l = 3;
			g.drawString("Factura Valida para consumidor final",x + width / 4,y + 15 * l);
			l  = 5;
			
			g.drawString("Cajero: " + nombreCajero,x + 15,y + 15 * l);
			l = 6;
			g.drawString("Fecha: " + date,x + 15,y + 15 * l);
			l = 7;
			g.drawString("Factura Numero: " + conteoFactura,x + 15,y + 15 * l);
			l = 9;
			g.drawString("Cant.",x + 15,y + 15 * l);
			g.drawString("Art.",x + 15 + distanciaf,y + 15 * l);
			g.drawString("Pre.",x + 15 + distanciaf * 4,y + 15 * l);
			g.drawString("Sub.",x + 15 + distanciaf * 5 + 15,y + 15 * l);
			
			l = 11;
			
			for(int c : cantidades) {
				
				g.drawString("" + c,x + 15,y + 15 * l);
				l++;
			}
			
			l = 11;
			
			for(String a : articulos) {
				
				g.drawString(a,x + 15 + distanciaf,y + 15 * l);
				l++;
			}
			
			l = 11;
			
			for(int p : precios) {
				
				g.drawString("RD$ " + p,x + 15 + distanciaf * 4,y + 15 * l);
				l++;
			}
			
			l = 11;
			
			for(int s : subtotales) {
				
				g.drawString("RD$ " + s,x + 15 + distanciaf * 5 + 15,y + 15 * l);
				l++;
				totalFactura += s;
				
			}
			
			l += 2;
			g.drawString("Total: RD$ " + totalFactura,x + 15 + distanciaf * 4 + 30,y + 15 * l);
			totalFactura = 0;
			
		
		}else {
			
			g.setColor(Color.red);
			g.drawString("No ha ingresado ningun articulo",x + width / 3,y + 15 * 2);
			g.setColor(Color.black);
			
		}
		
	}
	

}
