package chapter12;

import java.util.Scanner;

// Driver class
public class Exercise05_IllegalTriangleException {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the three sides of the triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		try {
			Triangle triangle = new Triangle(s1, s2, s3);

			System.out.println("The area of the triangle is " + triangle.getArea());
			System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());

		} catch (IllegalTriangleExpection ex) {
			System.out.println(ex);
		}
	}
}

// Custom IllegalTriangle Exception
class IllegalTriangleExpection extends Exception {
	
	private double side1, side2, side3;
	
	public IllegalTriangleExpection() {
		super("Invalid input");
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
}

class Triangle extends GeometricObject {
	private double side1, side2, side3;

	public Triangle() throws IllegalTriangleExpection {
		this(1, 1, 1);
	}

	public Triangle(double side1, double side2, double side3) throws IllegalTriangleExpection {
		super();
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2)
			throw new IllegalTriangleExpection();
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
