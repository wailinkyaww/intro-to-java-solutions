package chapter10;

//Test program for Circle2D class
public class Exercise11_Circle2D {
	public static void main(String[] args) {

		// Create a new Circle2D object
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("The area of c1 is " + c1.getArea());
		System.out.println("The perimeter of c1 is " + c1.getPerimeter());

		System.out.println("The point (3, 3) is inside c1 ? " + c1.contains(3, 3));
		System.out.println("The circle with radius 10.5 is inside c1 ? " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("The circle with radius 2.3 overlaps c1 ? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}

class Circle2D {
	private double x, y, radius;

	public Circle2D() {
		this(0, 0, 1);
	}

	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	// Check if the specified point is inside this circle
	public boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		return distance <= radius;
	}

	// Check if the specified circle is inside this circle
	public boolean contains(Circle2D circle) {
		double distance = calculateDistance(circle);
		return distance <= Math.abs(radius - circle.getRadius());
	}

	// Check if the specified circle overlaps this circle
	public boolean overlaps(Circle2D circle) {
		double distance = calculateDistance(circle);
		return distance <= radius + circle.getRadius();
	}

	// Compute distance between two centers of different circles
	private double calculateDistance(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
	}

}
