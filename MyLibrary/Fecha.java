package MyLibrary;

import java.awt.*;

public class Fecha {
	
	public String intToMonth(int month) {
		
		month--;
		String monthName;
		String[] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};
		monthName = months[month];
		
		return monthName;
		
	}
	
	public String intToMonthSwitch(int month) {
		
		String monthName = "Month not Found";
		
		switch(month) {
		
		case 1 : monthName = "january";break;
		case 2 : monthName = "february";break;
		case 3 : monthName = "march";break;
		case 4 : monthName = "april";break;
		case 5 : monthName = "may";break;
		case 6 : monthName = "june";break;
		case 7 : monthName = "july";break;
		case 8 : monthName = "august";break;
		case 9 : monthName = "september";break;
		case 10 : monthName = "october";break;
		case 11 : monthName = "november";break;
		case 12 : monthName = "december";break;
		
		}
		
		return monthName;
		
	}

}
