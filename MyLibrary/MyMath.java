package MyLibrary;

public class MyMath {
	
	public static int area(int width, int height) {
		
		return width * height;
		
	}
	
	public static int sumaEnterosC(int n) {
		
		int suma = 0;
		
		for(int s = 1; s <= n; s++) {
			
			suma += s;
			
		}
		
		return suma;
		
	}
	
	public static int sumaEnterosF(int n) {
		
		return n * (n+1) / 2;
		
	}

}
