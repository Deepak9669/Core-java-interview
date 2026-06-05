package oop.inheritance;

public class Circle {

	public int radius;

	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		double cArea = PI * radius * radius;

		System.out.println("Area of Circle = " + cArea);

	}

}
