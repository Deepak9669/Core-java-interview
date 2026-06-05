package oop;

public class TestAbsClass extends AbstractClass {

	@Override
	public void show() {
		System.out.println("Show method");
	}

	public TestAbsClass(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {

		TestAbsClass t = new TestAbsClass("Deepak");

		t.simple();
		t.show();
		
		AbstractClass.simple();

	}

}
