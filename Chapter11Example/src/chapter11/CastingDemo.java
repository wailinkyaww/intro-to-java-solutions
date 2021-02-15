package chapter11;

public class CastingDemo {
	public static void main(String[] args) {
		// Create and initialize two objects
		Object object1 = new CircleFromSimpleGeometricObject(1);
		Object object2 = new RectangleFromSimpleGeometricObject(1, 1);

		displayObject(object1);
		displayObject(object2);
	}

	public static void displayObject(Object object) {
		if (object instanceof CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject) object).getArea());
			System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricObject) object).getDiameter());
		} else if (object instanceof RectangleFromSimpleGeometricObject) {
			System.out.println("The rectangle area is " + ((RectangleFromSimpleGeometricObject) object).getArea());
		}
	}
}
