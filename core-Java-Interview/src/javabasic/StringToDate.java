package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	
	public static void main(String[] args) throws ParseException {
		
		String s = "2002-06-01";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d = sdf.parse(s);
		
		System.out.println(d);
	}

}
