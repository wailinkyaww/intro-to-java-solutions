package chapter13;

import java.util.Scanner;

// Driver program for ComparableCircle 
public class Exercise06_ComparableCircle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two radius for two new circles: ");
		double r1 = input.nextDouble();
		double r2 = input.nextDouble();

		input.close();

		// Create two new Circles
		ComparableCircle c1 = new ComparableCircle(r1);
		ComparableCircle c2 = new ComparableCircle(r2);

		// Compare and display results
		if (c1.compareTo(c2) == 1)
			System.out.println("The larger circle is \n" + c1.toString());
		else if (c1.compareTo(c2) == -1)
			System.out.println("The larger circle is \n" + c2);
		else
			System.out.println("The two circles are of equal");

	}
}

class Circle extends GeometricObject {

	private double radius;

	public Circle() {
		this(1);
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	protected double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	protected double getPerimeter() {
		return radius * Math.PI * 2;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCircle: radius = " + radius + ", area = " + getArea() + ", perimeter = "
				+ getPerimeter();
	}

}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	public ComparableCircle() {
		this(1);
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	@Override
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

}
