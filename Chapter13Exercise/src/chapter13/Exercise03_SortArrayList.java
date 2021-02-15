package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03_SortArrayList {
	// Create a Scanner
	private static Scanner input;

	// Driver program for SortArrayList
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();

		// Prompt user to enter numbers
		System.out.print("Enter five numbers: ");
		receiveNumbers(list);

		System.out.println("Your inputs : " + list.toString());

		SortArrayList.sort(list);

		System.out.println("Sorted : " + list.toString());
	}

	public static void receiveNumbers(ArrayList<Number> list) {
		input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			double value = input.nextDouble();
			list.add(value);
		}
	}
}

class SortArrayList {

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			Number currentMin = list.get(i);
			int currentMinIndex = i;
			for (int k = i + 1; k < list.size(); k++) {
				if (currentMin.doubleValue() > list.get(k).doubleValue()) {
					currentMin = list.get(k);
					currentMinIndex = k;
				}
			}

			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
	}
}
