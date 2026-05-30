package oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.area();
	
		Shape shape = new Rectangle();

		Rectangle rectangle = (Rectangle) shape;

		rectangle.setLength(5);
		rectangle.setWidth(5);
		
		rectangle.area();

		shape.area();
		
		shape.setColour("Red");
		shape.setBorderWidth("Five");
		System.out.println(shape.getColour() + " " + shape.getBorderWidth());
	}
}
