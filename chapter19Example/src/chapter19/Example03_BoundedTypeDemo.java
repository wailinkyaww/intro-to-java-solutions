package chapter19;

public class Example03_BoundedTypeDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 2);
		Circle circle = new Circle(2);

		System.out.println("Same area ? " + equalArea(circle, rectangle));
	}

	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}
}

abstract class GeometricObject {
	protected abstract double getArea();

	protected abstract double getPerimeter();
}

class Circle extends GeometricObject {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	protected double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	protected double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends GeometricObject {
	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	protected double getArea() {
		return width * height;
	}

	@Override
	protected double getPerimeter() {
		return 2 * (width + height);
	}

}