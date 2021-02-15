package chapter4;

public class Exercise06_RandomPointsOnACircle {
	public static void main(String[] args) {
		// Generate three random angles
		double angle1 = Math.random() * (2 * Math.PI);
		double angle2 = Math.random() * (2 * Math.PI);
		double angle3 = Math.random() * (2 * Math.PI);

		double radius = 40;

		// Compute coordinates for a triangle
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);

		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);

		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);

		// Compute three sides of the triangle
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		// Compute three angles of the triangle
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - a * a - b * b) / (-2 * a * b)));

		// Display three angles
		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + ", " + Math.round(B * 100) / 100.0
				+ ", " + Math.round(C * 100) / 100.0);
	}
}
