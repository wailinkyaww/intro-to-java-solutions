package chapter13;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;

	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	@Override
	public String toString() {
		return "Width: " + width + " Height: " + height;
	}
}
