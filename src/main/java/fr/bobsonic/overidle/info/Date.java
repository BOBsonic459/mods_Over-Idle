package fr.bobsonic.overidle.info;

import java.util.Calendar;

public class Date
{
	
    public static Calendar cal = Calendar.getInstance();
	
	public static boolean isDecember() {
	    Calendar cal = Calendar.getInstance();
	    int month = cal.get(2);
	    return (month == 12);
  }
  
	public static boolean isOctober() {
	    cal = Calendar.getInstance();
	    int month = cal.get(2);
	    return (month == 9);
  }
  
  	public static int getDate() {
	    cal = Calendar.getInstance();
	    return cal.get(5);	
  }
}
