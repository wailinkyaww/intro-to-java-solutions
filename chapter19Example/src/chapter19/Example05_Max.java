package chapter19;

public class Example05_Max {
	public static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		return o2;
	}
}
