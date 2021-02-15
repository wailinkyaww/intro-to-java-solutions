package chapter13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(3445.53);

		// Add a BigInteger
		list.add(new BigInteger("3432323234344343101"));

		// Add a bigDecimal
		list.add(new BigDecimal("2.0909090989091343433344343"));

		System.out.println("The largest number is " + getLargestNumber(list));
	}

	public static Number getLargestNumber(ArrayList<Number> list) {
		if (list == null || list.size() == 0)
			return null;
		Number number = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		}
		return number;
	}
}
