package MyLibrary;

public class MString {
	
	public static String unformat(String string) {
		
		String newString = string;
		
		newString = newString.toLowerCase();
		newString = newString.trim();
		newString = newString.replace(" ","");
		
		return newString;
		
	}

}
