package javabasic;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		int c ;
		
		for(int i = 1 ; i <=10 ; i++) {
			
			System.out.println(a + " ");
			
			c= b+a;
			b=a;
			a=c;
			
		}
	}

}
