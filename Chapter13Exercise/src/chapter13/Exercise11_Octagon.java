package chapter13;

// Driver class for Octagon
public class Exercise11_Octagon {
	public static void main(String[] args) {
		// Create new Octagon with
		Octagon octagon1 = new Octagon(5);

		// Displays results
		System.out.println("The area of the octagon is " + octagon1.getArea());
		System.out.println("The perimeter of the octagon is " + octagon1.getPerimeter());

		try {
			Octagon octagon2 = (Octagon) octagon1.clone();
			int status = octagon1.compareTo(octagon2);
			if (status == 1)
				System.out.println("Octagon1 is larger");
			else if (status == -1)
				System.out.println("Octagon2 is larger");
			else
				System.out.println("Two octagons are equal");
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex.getMessage());
		}

	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	private double side;

	public Octagon() {
		this(1);
	}

	public Octagon(double side) {
		super();
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOctagon: side = " + side + ", area = " + getArea() + ", perimeter = "
				+ getPerimeter();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
