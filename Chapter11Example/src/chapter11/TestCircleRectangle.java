package chapter11;

public class TestCircleRectangle {
	public static void main(String[] args) {
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);

		System.out.println("A circle is " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		System.out.println("The perimeter is " + circle.getPerimeter());

		RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);

		System.out.println("\nA rectangle is " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
