package oop.inheritance;

public class Rectangle extends Shape {

	public int length;
	public int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		int rArea = length * width;
		System.out.println("Rectanglr Area = "+ rArea);
	}
}
