package string;

public class PalindromeString {
	// es code ko sawan sir ni banwate h
	public static void main(String[] args) {
		String s = "abcba";
		String ss="";
		for (int i = s.length()-1; i >= 0 ; i--) {
			ss+=s.charAt(i);
		}
		if(s.equals(ss)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}