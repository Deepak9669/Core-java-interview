package oop.inheritance;

public class Shape {

	public String colour;
	public String borderWidth;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public void area() {
		System.out.println("Shape Area Method");
	}
}
