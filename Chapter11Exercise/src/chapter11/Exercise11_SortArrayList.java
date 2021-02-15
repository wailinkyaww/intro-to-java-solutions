package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

// Test Program
public class Exercise11_SortArrayList {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter five integers: ");
		int count = 0, value;

		for (;;) {
			if (++count > 5)
				break;
			value = input.nextInt();
			list.add(value);
		}

		// Sort the ArrayList
		SortArrayList.sort(list);

		// Display result
		System.out.println(list.toString());
	}
}

class SortArrayList {
	public static void sort(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					Integer temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
