package string;

public class CountChar {

	public static void main(String[] args) {
		String val = "Introducooution";
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			String ss = Character.toString(val.charAt(i));
			if (ss.equals("o")) {
				count++;
			}
		}
		System.out.println("o = " + count);
	}
}