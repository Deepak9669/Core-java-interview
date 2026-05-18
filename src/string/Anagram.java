package string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String a = "deepak";
		
		String b = "apideek";
		
	char [] c =	a.toCharArray();
	
	char [] d = b.toCharArray();
	
	Arrays.sort(c);
	
	Arrays.sort(d);
	
	if(Arrays.equals(c , d)) {
		System.out.println(a + " and " + b + "=" + "is anagrame");
		
	} else {
		System.out.println("this is not anagram");
	}
	
	}

}
