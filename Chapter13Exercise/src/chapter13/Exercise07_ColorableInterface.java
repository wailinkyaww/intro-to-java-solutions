package chapter13;

// Driver class for Colorable Square
public class Exercise07_ColorableInterface {
	public static void main(String[] args) {
		// Create an array of GeometricObject
		GeometricObject[] geometricObjects = { new Square(5), new Circle(2), new Square(3), new Square(),
				new Circle() };

		displayResult(geometricObjects);
	}

	public static void displayResult(GeometricObject[] objects) {
		for (GeometricObject object : objects) {
			System.out.println("The area is " + object.getArea());
			if (object instanceof Colorable) {
				System.out.print("How to color: ");
				((Colorable) object).howToColor();
			}
			System.out.println();
		}
	}
}

interface Colorable {
	void howToColor();
}

class Square extends GeometricObject implements Colorable {

	private double side;

	public Square() {
		this(1);
	}

	// Construct a constructor with specified side
	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

}