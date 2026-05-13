package string;

public class AccuranceOfString {

	public static void main(String[] args) {
		String str = "introduction";
		for (char j = 'a'; j <= 'z'; j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==j) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(j + " = " + count);
			}
		}
	}
}