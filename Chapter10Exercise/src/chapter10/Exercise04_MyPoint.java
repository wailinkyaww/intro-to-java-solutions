package chapter10;

public class Exercise04_MyPoint {
	public static void main(String[] args) {
		// Create two Points
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(10, 30.5);

		double distance = p1.distance(p2);

		System.out.println("The distance between (" + p1.getX() + ", " + p1.getY() + ") and (" + p2.getX() + ", "
				+ p2.getY() + ") is : " + distance);
	}
}

class MyPoint {
	private double x, y;
	private static final double EPSILON = 1E-16;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance(double x1, double y1) {
		double distance = Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		return Math.round(distance * 100) / 100.0;
	}

	public double distance(MyPoint p) {
		double distance = Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
		return Math.round(distance * 100) / 100.0;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return Math.abs(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) - 0) <= EPSILON;
	}

	public static boolean onTheSameLine(MyPoint p0, MyPoint p1, MyPoint p2) {
		return onTheSameLine(p0.getX(), p0.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	public static boolean onLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		return onTheSameLine(x0, y0, x1, y1, x2, y2) && ((x2 >= x0 && x2 <= x1) || (x2 <= x0 && x2 >= x1))
				&& ((y2 <= y0 && y2 >= y1) || (y2 >= y0 && y2 <= y1));
	}

	public static boolean onLineSegment(MyPoint p0, MyPoint p1, MyPoint p2) {
		return onLineSegment(p0.getX(), p0.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	public static double checkPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}

	public static double checkPosition(MyPoint p0, MyPoint p1, MyPoint p2) {
		return checkPosition(p0.getX(), p0.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

}
