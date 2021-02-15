package chapter13;

import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	protected GeometricObject() {
		dateCreated = new Date();
	}

	protected GeometricObject(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}


	@Override
	public String toString() {
		return "Created on: " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	protected abstract double getArea();

	protected abstract double getPerimeter();
}
