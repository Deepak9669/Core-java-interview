package string;

public class CountNoOfIntFromString {

	public static void main(String[] args) {

		String name = "Deepak12249";
		int count = 0;

		int sum = 0;

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {

				sum = sum + Character.getNumericValue(name.charAt(i));

			count++;
			}

		}
		System.out.println("No Of Int From String = " + count);

		System.out.println(sum);

	}
}
