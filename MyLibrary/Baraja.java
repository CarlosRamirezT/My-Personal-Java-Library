package MyLibrary;

import java.awt.*;

class Carta {
	
	public int rango;
	public String palo;
	
	public void displayCarta(Graphics g,int x, int y) {
		
		g.drawString(rango + " " + palo,x,y);
		
	}

}

public class Baraja{
	
	private Carta[] baraja = new Carta[52];
	final String[] palo = {"corazones","diamantes","espadas","bastos"};
	
	public Baraja() {
		
		int cartaNumero = 0;
		
		for(int paloNum = 0; paloNum < 4;paloNum++) {
			
			for(int rango = 1; rango < 14; rango++) {
				
				baraja[cartaNumero] = new Carta();
				baraja[cartaNumero].palo = palo[paloNum];
				baraja[cartaNumero].rango = rango;
				cartaNumero++;
				
			}
		}
		
	}
	
	public void displayBaraja(Graphics g,int x,int y) {
		
		
		for(int i = 0;i < baraja .length;i++) {
			
			g.drawString(baraja[i].rango + " " + baraja[i].palo,x,y);
			y += 15;
			
		}
		
	}
	
	public void consoleDisplayBaraja() {
		
		for(int i = 0;i < baraja.length;i++) {
			
			System.out.println(baraja[i].rango + " " + baraja[i].palo);
			
		}
		
	}
}
