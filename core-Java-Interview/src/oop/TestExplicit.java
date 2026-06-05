package oop;

public class TestExplicit extends Explicit {

	public TestExplicit(String name) {
//		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {

		TestExplicit t = new TestExplicit("Deepak");
	}
}
