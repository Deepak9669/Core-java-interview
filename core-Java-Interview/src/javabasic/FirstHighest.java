package javabasic;

public class FirstHighest {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 4, 7, 9 };

		int hig = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > hig) {

				hig = ar[i];

			}

		}

		System.out.println(hig);
	}

}
