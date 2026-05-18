package string;

public class LowerUpperCase {
public static void main(String[] args) {
	String s = "deepakverma";
	
	for (int i = 0; i < s.length(); i++) {
		if(i%2==0) {
			String ss=String.valueOf(s.charAt(i));
			System.out.print(ss.toUpperCase());
		}else {
			String ss=String.valueOf(s.charAt(i));
			System.out.print(ss.toLowerCase());
		}
		
	}
}
}