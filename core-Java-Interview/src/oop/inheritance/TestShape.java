package oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setLength(5);
		r.setWidth(5);

		Circle c = new Circle();

		c.setRadius(5);

		r.setColour("Red");
		r.setBorderWidth("Five");
		System.out.println(r.getColour() + "\n" + r.getBorderWidth());
		r.area();
		c.area();
	}
}
