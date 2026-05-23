package string;

public class CountVowel {
	public static void main(String[] args) {
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };
		String val = "akerk.asbas";

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < val.length(); j++) {
				if (ch[i] == val.charAt(j)) {

					count++;
				}
			}
			if (count >0) {
				System.out.println(ch[i] + "=" + count);
			}
		}

	}
}