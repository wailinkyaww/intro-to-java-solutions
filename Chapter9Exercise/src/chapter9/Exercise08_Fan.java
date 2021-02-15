package chapter9;

// Test program for Fan class
public class Exercise08_Fan {
	public static void main(String[] args) {
		// Create two Fans
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(Fan.HIGH); // Maximum speed
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		fan2.setSpeed(Fan.SLOW); // Medium speed
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);

		// Display results
		System.out.println("First object(fan1): ");
		System.out.println(fan1.toString());

		System.out.println("\nSecond object(fan2): ");
		System.out.println(fan2.toString());
	}
}

class Fan {
	public static final int SLOW = 1, MEDIUM = 2, HIGH = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {
		speed = Fan.SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String description = "";
		if (isOn())
			description = "Fan \nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius();
		else
			description = "Fan \nColor: " + getColor() + "\nRadius: " + getRadius();

		return description;
	}

}
