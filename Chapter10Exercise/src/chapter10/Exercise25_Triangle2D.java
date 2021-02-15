package chapter10;

// Driver class for Triangle2D
public class Exercise25_Triangle2D {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint(2, 1);
		MyPoint p2 = new MyPoint(5, 8);
		MyPoint p3 = new MyPoint(8, 1);

		MyPoint tp1 = new MyPoint(5, 4); // inside
		MyPoint tp2 = new MyPoint(8, 6); // outside

		Triangle2D triangle = new Triangle2D(p1, p2, p3);

		Triangle2D triangle1 = new Triangle2D(p1, p2, tp2);
		Triangle2D triangle2 = new Triangle2D(p1, p2, tp1);
		Triangle2D triangle3 = new Triangle2D(tp1, new MyPoint(8, 6), new MyPoint(8, 4));
		Triangle2D triangle4 = new Triangle2D(new MyPoint(8, 6), new MyPoint(8, 4), new MyPoint(10, 1));

		System.out.println("tp1 contains in triangle? " + triangle.contains(tp1));
		System.out.println("tp2 contains in triangle? " + triangle.contains(tp2));

		System.out.println("triangle1 contains in triangle: " + triangle.contains(triangle1));
		System.out.println("triangle2 contains in triangle: " + triangle.contains(triangle2));
//		System.out.println("triangle3 overlaps triangle: " + triangle.overlaps(triangle3));
//		System.out.println("triangle4 overlaps triangle: " + triangle.overlaps(triangle4));
	}
}

class Triangle2D {
	private MyPoint p1, p2, p3;

	public Triangle2D() {
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}

	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	public double getArea() {
		double s1 = p2.distance(p3);
		double s2 = p1.distance(p3);
		double s3 = p1.distance(p2);
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return Math.round(area);
	}

	public double getPerimeter() {
		double perimeter = p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
		return Math.round(perimeter * 1000) / 1000.0;
	}

	public boolean contains(MyPoint p) {
		if (onSide(p))
			return true;
		Counter positionCounter = new Counter();

		double position = MyPoint.checkPosition(p1, p2, p);
		checkPositionAndAssign(position, positionCounter);

		position = MyPoint.checkPosition(p1, p3, p);
		checkPositionAndAssign(position, positionCounter);

		position = MyPoint.checkPosition(p2, p3, p);
		checkPositionAndAssign(position, positionCounter);

		return positionCounter.getLeft() == 1 && positionCounter.getRight() == 2;
	}

	public boolean contains(Triangle2D t) {
		return contains(t.p1) && contains(t.p2) && contains(t.p3);
	}


	private void checkPositionAndAssign(double position, Counter counter) {
		if (position > 0)
			counter.increaseLeft();
		else if (position < 0)
			counter.increasetRight();
	}

	public boolean onSide(MyPoint p) {
		return MyPoint.onLineSegment(p1, p2, p) || MyPoint.onLineSegment(p1, p3, p) || MyPoint.onLineSegment(p2, p3, p);
	}

}

class Counter {
	private int left = 0, right = 0;

	Counter() {

	}

	public void increaseLeft() {
		left++;
	}

	public void increasetRight() {
		right++;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}
}
