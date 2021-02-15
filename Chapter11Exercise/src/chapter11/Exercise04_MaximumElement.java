package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Test program
public class Exercise04_MaximumElement {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter sequence of numbers (input ends with 0): ");

		int value;
		do {
			value = input.nextInt();
			if (value != 0)
				list.add(value);
		} while (value != 0);

		System.out.println("The largest number is " + MaximumElement.max(list));
	}
}

class MaximumElement {
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0 || list == null)
			return null;

		int max = list.get(0);
		
		for (int item : list) {
			if (max < item)
				max = item;
		}
		return max;
	}

}
