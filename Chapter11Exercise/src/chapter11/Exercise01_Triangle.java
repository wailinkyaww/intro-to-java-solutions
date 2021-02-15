package chapter11;

import java.util.Scanner;

// Driver class for triangle
public class Exercise01_Triangle {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three sides of the triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		input = new Scanner(System.in);

		System.out.print("Enter the color of the triangle: ");
		String color = input.nextLine();

		System.out.print("The triangle is filled or not (boolean value): ");
		boolean filled = input.nextBoolean();

		// Create new Triangle
		Triangle t = new Triangle(s1, s2, s3);
		t.setColor(color);
		t.setFilled(filled);

		// Display results
		System.out.println(t.toString());
		System.out.println("The area of the traingle: \t" + t.getArea());
		System.out.println("The perimeter of the triangle: \t" + t.getPerimeter());
		System.out.println("The color of the triangle: \t" + t.getColor());
		System.out.println("The triangle is filled ? \t" + t.isFilled());

	}
}

class Triangle extends GeometricObject {
	private double side1, side2, side3;

	public Triangle() {
		this(1, 1, 1);
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return Math.round(area * 1000) / 1000.0;
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
