package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13_RemoveDuplicates {
	public static void main(String[] args) {
		RemoveDuplicates.main(args);
	}
}

class RemoveDuplicates {
	public static void removeDuplicates(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int temp = list.get(i);
			for (int j = i + 1; j < list.size();) {
				if (temp == list.get(j))
					list.remove(j);
				else
					j++;

			}
		}
	}

	// Driver program
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create new ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		System.out.print("Enter ten integers: ");
	
		for (int i = 0; i < 10;)
			list.add(i++, input.nextInt());
	

		removeDuplicates(list);

		System.out.println("The distinct integers are: " + list.toString());
	}
}
