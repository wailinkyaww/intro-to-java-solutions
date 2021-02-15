package chapter9;

public class Example02_SimpleCircle {

	public static void main(String[] args) {
		Example02_SimpleCircle circle1 = new Example02_SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		Example02_SimpleCircle circle2 = new Example02_SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		Example02_SimpleCircle circle3 = new Example02_SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

		circle2.radius = 100;

		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

	}

	double radius;

	Example02_SimpleCircle() {
		radius = 1;
	}

	Example02_SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
