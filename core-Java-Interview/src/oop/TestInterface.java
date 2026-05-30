package oop;

public class TestInterface implements MakeInterface {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		TestInterface t = new TestInterface();

		System.out.println(t.sum(10, 20));

		MakeInterface.staticMethod();
		
		t.defaultMethod();

	}

}
