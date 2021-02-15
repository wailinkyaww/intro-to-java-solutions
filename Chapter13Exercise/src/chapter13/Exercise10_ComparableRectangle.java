package chapter13;

// Driver class
public class Exercise10_ComparableRectangle {
	public static void main(String[] args) {
		// Create two rectangles
		Rectangle rectangle1 = new Rectangle(2, 3);
		Rectangle rectangle2 = new Rectangle(3, 2);
		Rectangle rectangle3 = new Rectangle(1, 2);
		
		System.out.println("Is rectangle1 equals to rectangle2 ? " + rectangle1.equals(rectangle2));
		System.out.println("Is rectangle1 equals to rectangle3 ? " + rectangle1.equals(rectangle3));
	}
}

class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	private double width;
	private double height;

	public Rectangle() {
		this(1, 1);
	}

	public Rectangle(double width, double height) {
		super();
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int compareTo(Rectangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public boolean equals(Object obj) {
		return compareTo((Rectangle) obj) == 0;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRectangle: width = " + width + ", height = " + height;
	}

}
