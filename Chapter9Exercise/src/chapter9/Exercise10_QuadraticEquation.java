package chapter9;

import java.util.Scanner;

// Driver program for QuaraticEquation Class
public class Exercise10_QuadraticEquation {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c for quadratic equation (ax^2 + bx + c = 0): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation equation1 = new QuadraticEquation(a, b, c);

		double discriminant = equation1.getDiscriminant();
		if (discriminant > 0) {
			System.out.println("The equation has two roots " + equation1.getRoot1() + " and " + equation1.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("The equation has one root " + equation1.getRoot1());
		} else {
			System.out.println("The equation has no real root");
		}
	}
}

class QuadraticEquation {
	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	public double getRoot1() {
		double discriminant = getDiscriminant();
		if (discriminant < 0)
			return 0;
		return (-b + Math.sqrt(discriminant)) / (2 * a);
	}

	public double getRoot2() {
		double discriminant = getDiscriminant();
		if (discriminant < 0)
			return 0;
		return (-b - Math.sqrt(discriminant)) / (2 * a);
	}

}
