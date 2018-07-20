package MyLibrary;

import java.awt.*;
import java.util.ArrayList;

public class DiccionarioBilingue {
	
	private ArrayList<String> espanol = new ArrayList();
	private ArrayList<String> ingles = new ArrayList();
	private String path = "display all elements";
	
	private String spanishWord, englishWord;
	private boolean foundStatus = false;
	
	public void display(Graphics g,int x, int y) {
		
		if(path == "display all elements") {
			
			g.setColor(Color.black);
			
			for(int i = 0; i < espanol.size();i++) {
				
				g.drawString(espanol.get(i) + " === " + ingles.get(i),x,y + 15 * i);
				
			}
		
		}else if(path == "translate") {
			
			if(foundStatus) {
				
				g.setColor(Color.blue);
				g.drawString(spanishWord + " === " + englishWord,x,y);
				
			}else {
				
				g.setColor(Color.red);
				g.drawString("Sorry,Word Not Fund",x,y);
				
				
			}
			
		}else if(path == "add") {
			
			g.setColor(Color.green);
			g.drawString("The element has been successfully added",x,y);
			
		}
		
	}
	
	public void add(String espanolWord, String inglesWord) {
		
		espanol.add(espanolWord);
		ingles.add(inglesWord);
		path = "add";
		
	}
	
	public void translateToEnglish(String espanolWord) {
		
		for(int i = 0; i < espanol.size();i++) {
			
			if(espanol.get(i) == espanolWord) {
				
				spanishWord = espanolWord;
				englishWord = ingles.get(i);
				foundStatus = true;
				
			}else {
				
				foundStatus = false;
				
			}
			
		}
		
		path = "translate";
		
		
	}
	
	public void translateToSpanish(String inglesWord) {
				
		for(int i = 0; i < espanol.size();i++) {
			
			if(ingles.get(i) == inglesWord) {
				
				spanishWord = espanol.get(i);
				englishWord = inglesWord;
				foundStatus = true;
				
			}else {
				
				foundStatus = false;
				
			}
			
		}
		
		path = "translate";
		
		
	}
	
	public void setPath(String path) {
		
		this.path = path;
		
	}

}
