package chapter13;

public class Circle extends GeometricObject {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public void circleInfo() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return super.toString() + "\nradius is " + radius;
	}

}
