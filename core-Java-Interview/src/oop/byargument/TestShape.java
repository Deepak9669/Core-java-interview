package oop.byargument;

public class TestShape {

	public static void calcArea(Shape[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
//			System.out.println("area: " + s[i].area());
			totalArea = totalArea + s[i].area();

		}
		System.out.println("Total Area =" + totalArea);
	}

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Rectangle();
		Rectangle r = (Rectangle) s[0];
		r.setLength(5);
		r.setWidth(4);

		s[1] = new Circle();
		Circle c = (Circle) s[1];
		c.setRadius(5);

		s[2] = new Triangle();
		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(5);

		calcArea(s);

	}

}
