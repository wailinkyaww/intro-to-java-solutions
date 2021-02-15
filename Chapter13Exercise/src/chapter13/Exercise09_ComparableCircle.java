//package chapter13;
//
//// Driver class for Circle 
//public class Exercise09_ComparableCircle {
//	public static void main(String[] args) {
//		// Create new Circle
//		Circle circle1 = new Circle(3);
//		Circle circle2 = new Circle(5);
//		Circle circle3 = new Circle(3);
//
//		// compateTo
//		int status = circle1.compareTo(circle2);
//		if (status == 1)
//			System.out.println("The first circle is larger");
//		else if (status == -1)
//			System.out.println("The second circle is the larger one");
//		else
//			System.out.println("The two circles of equal");
//
//		// Display results of equals method
//		System.out.println("Is circle1 equal to circle2 ? " + circle1.equals(circle2));
//		System.out.println("Is circle2 equal to circle3 ? " + circle1.equals(circle3));
//	}
//}
//
//class Circle extends GeometricObject implements Comparable<Circle> {
//
//	private double radius;
//
//	public Circle() {
//
//	}
//
//	public Circle(double radius) {
//		super();
//		setRadius(radius);
//	}
//
//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//
//	@Override
//	public double getArea() {
//		return radius * radius * Math.PI;
//	}
//
//	@Override
//	public double getPerimeter() {
//		return 2 * Math.PI * radius;
//	}
//
//	@Override
//	public int compareTo(Circle o) {
//		if (getArea() > o.getArea())
//			return 1;
//		else if (getArea() < o.getArea())
//			return -1;
//		else
//			return 0;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		return radius == ((Circle) obj).getRadius();
//	}
//
//}
