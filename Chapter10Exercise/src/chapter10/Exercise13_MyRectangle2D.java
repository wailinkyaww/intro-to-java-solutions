package chapter10;

// Test Program for MyRectangle2D class
public class Exercise13_MyRectangle2D {
	public static void main(String[] args) {
		// Create new Rectangles
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

		System.out.println("The area of r1 is " + r1.getArea());
		System.out.println("The perimeter of r1 is " + r1.getPerimeter());

		System.out.println(r1.contains(3, 3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}
}

class MyRectangle2D {
	private double x, y, width, height;

	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	public MyRectangle2D(double x, double y, double width, double height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
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

	public double getArea() {
		return Math.round(width * height * 100) / 100.0;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		double horizontalDistance = Math.abs(x - this.x);
		double verticalDistance = Math.abs(y - this.y);

		return horizontalDistance <= width / 2 && verticalDistance <= height / 2;
	}

	public boolean contains(MyRectangle2D r) {
		double horizontalDistance = Math.abs(r.getX() - x) + r.getWidth() / 2;
		double verticalDistance = Math.abs(r.getY() - y) + r.getHeight() / 2;

		return horizontalDistance <= width / 2 && verticalDistance <= height / 2;
	}

	public boolean overlaps(MyRectangle2D r) {
		double horizontalDistance = Math.abs(r.getX() - x) - r.getWidth() / 2;
		double verticalDistance = Math.abs(r.getY() - y) - r.getHeight() / 2;

		return !contains(r) && horizontalDistance <= width / 2 && verticalDistance <= height / 2;
	}

}
