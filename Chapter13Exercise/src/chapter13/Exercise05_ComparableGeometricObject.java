//package chapter13;
//
//import java.util.Date;
//
//public class Exercise13_05 {
//	// Driver program for finding max from ComparableGeometricObjects
//	public static void main(String[] args) {
//		// Create two new Circles
//		ComparableGeometricObject circle1 = new Circle(1);
//		ComparableGeometricObject circle2 = new Circle(2);
//
//		// Create two new Rectangles
//		ComparableGeometricObject rectangle1 = new Rectangle(2, 2);
//		ComparableGeometricObject rectangle2 = new Rectangle(3, 2);
//
//		System.out.println("The larger circle is " + ComparableGeometricObject.max(circle1, circle2).toString());
//		System.out
//				.println("The larger rectangle is " + ComparableGeometricObject.max(rectangle1, rectangle2).toString());
//	}
//}
//
//abstract class ComparableGeometricObject implements Comparable<ComparableGeometricObject> {
//
//	private String color = "white";
//	private boolean filled = false;
//	private Date dateCreated;
//
//	public ComparableGeometricObject() {
//		dateCreated = new Date();
//	}
//
//	public ComparableGeometricObject(String color, boolean filled) {
//		this.color = color;
//		this.filled = filled;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public boolean isFilled() {
//		return filled;
//	}
//
//	public void setFilled(boolean filled) {
//		this.filled = filled;
//	}
//
//	public Date getDateCreated() {
//		return dateCreated;
//	}
//
//	public static ComparableGeometricObject max(ComparableGeometricObject object1, ComparableGeometricObject object2) {
//		if (object1.compareTo(object2) == -1)
//			return object2;
//		else
//			return object1;
//	}
//
//	@Override
//	public int compareTo(ComparableGeometricObject o) {
//		if (getArea() > o.getArea())
//			return 1;
//		else if (getArea() < o.getArea())
//			return -1;
//		else
//			return 0;
//	}
//
//	@Override
//	public String toString() {
//		return "Created on: " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
//	}
//
//	protected abstract double getArea();
//
//	protected abstract double getPerimeter();
//}
//
//class Circle extends ComparableGeometricObject {
//
//	private double radius;
//
//	public Circle() {
//		this(1);
//	}
//
//	/** Construct a Constructor using radius field **/
//	public Circle(double radius) {
//		super();
//		this.radius = radius;
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
//	protected double getArea() {
//		return radius * radius * Math.PI;
//	}
//
//	@Override
//	protected double getPerimeter() {
//		return radius * 2 * Math.PI;
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + "\nCircle : radius = " + radius;
//	}
//
//}
//
//class Rectangle extends ComparableGeometricObject {
//	private double width;
//	private double height;
//
//	public Rectangle() {
//		this(1, 1);
//	}
//
//	public Rectangle(double width, double height) {
//		super();
//		setWidth(width);
//		setHeight(height);
//	}
//
//	public double getWidth() {
//		return width;
//	}
//
//	public void setWidth(double width) {
//		this.width = width;
//	}
//
//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	@Override
//	protected double getArea() {
//		return width * height;
//	}
//
//	@Override
//	protected double getPerimeter() {
//		return 2 * (width + height);
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + "\nRectangle width = " + width + ", height = " + height;
//	}
//
//}
