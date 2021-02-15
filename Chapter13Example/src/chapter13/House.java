package chapter13;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {

	private int id;
	private double area;
	private Date whenBuilt;

	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}

	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public Date getWhenBuilt() {
		return whenBuilt;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(House o) {
		if (area > o.getArea())
			return 1;
		else if (area < o.getArea())
			return -1;
		else
			return 0;
	}

}
