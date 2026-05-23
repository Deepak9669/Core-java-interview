package javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalDate bDate = LocalDate.of(2002, 06, 01);
		
		Period p = Period.between(bDate, date);
		
		System.out.println("Age = " + p.getYears());
		
	}

}
