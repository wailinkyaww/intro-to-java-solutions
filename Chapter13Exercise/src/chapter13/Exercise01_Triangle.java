package chapter13;

import java.util.Scanner;

public class Exercise01_Triangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three sides, and other data
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Enter the color of the triangle: ");
		String color = input.next();

		System.out.print("Enter triangle is filled ? (true or false): ");
		boolean filled = input.nextBoolean();

		// Close scanner object
		input.close();

		// Create a new Triangle object
		GeometricObject triangle = new Triangle(side1, side2, side3);

		// Set color and filled
		triangle.setColor(color);
		triangle.setFilled(filled);

		// Display results
		displayGeometricObject(triangle);
	}

	public static void displayGeometricObject(GeometricObject object) {
		if (object instanceof Triangle) {
			System.out.println("The area of the triangle: \t" + object.getArea());
			System.out.println("The perimeter of the triangle: \t" + object.getPerimeter());
			System.out.println(
					"The color of the triangle is " + object.getColor() + " and it is filled ?" + object.isFilled());
		}
	}
}

class Triangle extends GeometricObject {
	// Data fields for Triangle
	private double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	protected double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	protected double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "\nTriangle: area = " + getArea() + ", perimeter = " + getPerimeter();
	}

}
