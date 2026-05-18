package string;

public class MissingChar {
	
	public static void main(String[] args) {
		
		String str = "Deepak";
		
		for(char i = 'a' ; i <='z' ; i++) {
			if(str.indexOf(i)== -1) {
				System.out.println(i);
				
			}
			
		}
		
	}

}
