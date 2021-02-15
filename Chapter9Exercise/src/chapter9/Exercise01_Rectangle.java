package chapter9;

public class Exercise01_Rectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("For rectangle1: ");
		System.out.println("[ width = " + rectangle1.width + ", height = " + rectangle1.height + ", area = "
				+ rectangle1.getArea() + ", perimeter = " + rectangle1.getPerimeter() + "]");

		System.out.println("\nFor rectangle2: ");
		System.out.println("[ width = " + rectangle2.width + ", height = " + rectangle2.height + ", area = "
				+ rectangle2.getArea() + ", perimeter = " + rectangle2.getPerimeter() + "]");
	}
}

class Rectangle {
	double width, height;

	Rectangle() {
		width = 1.0;
		height = 1.0;
	}

	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}
