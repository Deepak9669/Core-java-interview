package oop;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;

	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public long sum(int a, int b, long c, long d) {
		return a + b + c - d;

	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();

		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(10, 20, 30));
		System.out.println(m.sum(10, 20, 30, 30));
	}
}
