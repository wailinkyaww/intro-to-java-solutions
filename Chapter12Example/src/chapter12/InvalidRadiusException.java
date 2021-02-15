package chapter12;

public class InvalidRadiusException extends Exception {
	private double radius;

	// Construct an exception
	public InvalidRadiusException(double radius) {
		super("Invalid radius " + radius);
	}

	// return the radius
	public double getRadius() {
		return radius;
	}
}
