package chapter13;

public class Exercise12_AreasOfGeometricObjects {
	public static void main(String[] args) {
		GeometricObject[] geometricObjects = { new Circle(3), new Circle(6), new Rectangle(2, 2), new Rectangle(3, 2) };

		double sum = sumArea(geometricObjects);
		
		System.out.println("The sum of the area of two circles and two rectangles is " + sum);
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;

		for (GeometricObject object : a) {
			sum += object.getArea();
		}

		return sum;
	}
}
