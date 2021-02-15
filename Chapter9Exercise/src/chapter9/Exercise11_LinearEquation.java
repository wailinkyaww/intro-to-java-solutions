package chapter9;

import java.util.Scanner;

// Test program for LinearEquation
public class Exercise11_LinearEquation {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		// Create new equation
		LinearEquation equation1 = new LinearEquation(a, b, c, d, e, f);

		if (!equation1.isSolvable())
			System.out.println("The equation has no solution");
		else {
			System.out.println("x is " + equation1.getX() + " and y is " + equation1.getY());
		}
	}
}

class LinearEquation {
	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		return (a * d) - (b * c) != 0;
	}

	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));

	}

	public double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}
}
