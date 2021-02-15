package chapter12;

public class CircleWithException {
	private double radius;
	private static int numberOfObjects;

	public CircleWithException() {
		this(1.0);
	}
	
	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException {
		if (radius >= 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double findArea() {
		return radius * radius * Math.PI;
	}
}
