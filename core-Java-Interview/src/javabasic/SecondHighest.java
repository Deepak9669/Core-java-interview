package javabasic;

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 5, 36, 4, 28, 1 };
		int count = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {

				count = temp;
				temp = arr[i];
			}
			if (count < arr[i] && temp > arr[i]) {
				count = arr[i];
			}
		}
		System.out.println(count);
	}
}