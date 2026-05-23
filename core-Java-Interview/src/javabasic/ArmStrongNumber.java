package javabasic;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 143;
		int num2 = num;
		int temp = 0;
		int r = 0;

		while (num2 > 0) {

			r = num2 % 10;

			temp = temp + r * r * r;

			num2 = num2 / 10;

		}

		if (num == temp) {
			System.out.println("It is armStrong Nb");

		} else {
			System.out.println("it is not Armstrong nb");
		}

	}

}
