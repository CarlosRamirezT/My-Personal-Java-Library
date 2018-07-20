package MyLibrary;

import java.awt.*;
import java.util.Arrays;
import java.util.Vector;

public class PermutacionPalabras {
	
	private String[] words = new String[4];
	
	public PermutacionPalabras() {
		
		MyArreglo.fillStrings(words,"Palabra");
		
	}
	
	public PermutacionPalabras(String word){
		
		MyArreglo.fillStrings(words,word);
		
	}
	
	public void setWord(int index, String word) {
		
		words[index] = word;
		
	}
	
	public void display(Graphics g,int x, int y) {
		
		int xInicial = x;
		int yInicial = y;
		
		g.drawString(words[0] + " " + words[1] + " " + words[2] + " " + words[3], xInicial,yInicial + 15 * 0);
		g.drawString(words[3] + " " + words[2] + " " + words[1] + " " + words[0], xInicial,yInicial + 15 * 1);
		g.drawString(words[1] + " " + words[2] + " " + words[3] + " " + words[0], xInicial,yInicial + 15 * 2);
		g.drawString(words[2] + " " + words[3] + " " + words[0] + " " + words[1], xInicial,yInicial + 15 * 3);
		g.drawString(words[3] + " " + words[0] + " " + words[1] + " " + words[2], xInicial,yInicial + 15 * 4);
		g.drawString(words[0] + " " + words[2] + " " + words[1] + " " + words[3], xInicial,yInicial + 15 * 5);
		g.drawString(words[1] + " " + words[3] + " " + words[2] + " " + words[0], xInicial,yInicial + 15 * 6);
		g.drawString(words[0] + " " + words[3] + " " + words[1] + " " + words[2], xInicial,yInicial + 15 * 7);
		g.drawString(words[3] + " " + words[0] + " " + words[2] + " " + words[1], xInicial,yInicial + 15 * 8);
		g.drawString(words[2] + " " + words[0] + " " + words[3] + " " + words[1], xInicial,yInicial + 15 * 9);
		
		/*
		
		for(int i = 1; i < 10; i++) {
			
			if(yInicial < 600) {
								
				yInicial += 15 * i;
				
			}else {
				
				yInicial = y;
				xInicial += 200;
				
			}
			
		}*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	
	 private void generateR(Vector source, Vector partial,Vector > out){
		 
	        Vector newPartial=new Vector (partial);
	        Vector newSource = new Vector ();
	        
	        if (source.size()==0){
	        	
	            out.add(newPartial);
	            return;
	            
	        }
	        
	        for(int i=0;i < ){
	        	
	            newPartial = new Vector (partial);
	            newPartial.addAll(source.subList(i, i+1));
	            newSource = new Vector (source.subList(0,i));
	            
	            if (i<(source.size()+1)){
	            	
	                newSource.addAll(source.subList(i+1, source.size()));
	                
	            }
	            
	            generateR(newSource, newPartial, out);
	        }
	 }

	    public Vector > generate(Vector source)
	    {
	        Vector out=new Vector>();
	        Vector partial=new Vector ();
	        generateR(source, partial, out);
	        return out;
	    }

	    public static void main(String[] args)
	    {
	        GenerarCombinaciones a = new GenerarCombinaciones();
	        Vector in = new Vector ();
	        in.add("Hola");
	        in.add("como");
	        in.add("estas");
	       
	        Vector > v = a.generate(in);

	        System.out.println ("Elementos: "+v.size());
	        for (Vector elemento : v){
	            System.out.println (Arrays.toString(elemento.toArray()));
	        }
	    }*/

}
