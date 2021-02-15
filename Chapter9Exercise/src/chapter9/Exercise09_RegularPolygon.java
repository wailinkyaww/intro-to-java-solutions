package chapter9;

// Test program for RegularPolygon
public class Exercise09_RegularPolygon {
	public static void main(String[] args) {
		// Create three RegularPolygon objects
		RegularPolygon obj1 = new RegularPolygon();
		RegularPolygon obj2 = new RegularPolygon(6, 4);
		RegularPolygon obj3 = new RegularPolygon(10, 4, 5.6, 7.8);

		// For obj1
		System.out.println("For polygon with no-args constructor: ");
		System.out.println("Perimeter: " + obj1.getPerimeter());
		System.out.println("Area: " + obj1.getArea());

		// For obj2
		System.out.println("\nFor polygon with args (6,4) constructor: ");
		System.out.println("Perimeter: " + obj2.getPerimeter());
		System.out.println("Area: " + obj2.getArea());

		// For obj3
		System.out.println("\nFor polygon with args (10, 4, 5.6, 7.8) constructor: ");
		System.out.println("Perimeter: " + obj3.getPerimeter());
		System.out.println("Area: " + obj3.getArea());
	}
}

class RegularPolygon {
	private int n;
	private double side;
	private double x, y;

	public RegularPolygon() {
		this(3, 1);
	}

	public RegularPolygon(int n, double side) {
		this(n, side, 0, 0);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		setN(n);
		setSide(side);
		setX(x);
		setY(y);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return n * side;
	}

	public double getArea() {
		return n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
	}
}
