package MyLibrary;

import java.applet.Applet;
import java.awt.*;

public class Tester extends Applet{
	
	
	
	public void paint(Graphics g) {
		
		
		int[] array = {500,1,2,6000};
		int[] arrayOrganized = MyArreglo.organizeIncreasing(array);
		
		g.drawString("Array Unorganized: ",50,50);
		MyArreglo.printInts(g,50,80,array);
		
		g.drawString("Array organized: ",300,50);
		MyArreglo.printInts(g,300,80,arrayOrganized);
		
	}
	
}