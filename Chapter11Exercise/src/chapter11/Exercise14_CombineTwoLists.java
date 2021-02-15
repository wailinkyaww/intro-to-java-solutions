package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise14_CombineTwoLists {

	private static Scanner input;

	public static void main(String[] args) {
		// Create two ArrayList
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		// Prompt user to enter ten integers for list1 and list2
		System.out.print("Enter five integers for list1: ");
		receiveInput(list1, 5);

		System.out.print("Enter five integers for list2: ");
		receiveInput(list2, 5);

		ArrayList<Integer> combineList = CombineTwoLists.union(list1, list2);

		// Display result
		System.out.println("The combine list is: " + combineList);
	}

	public static void receiveInput(ArrayList<Integer> list, int length) {
		input = new Scanner(System.in);
		int value;
		for (int i = 0; i < length; i++) {
			value = input.nextInt();
			list.add(value);
		}
	}
}

class CombineTwoLists {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list = new ArrayList<>();

		int i = 0, j = 0;
		for (;;) {
			if (list.size() >= list1.size() + list2.size())
				break;
			if (i < list1.size())
				list.add(list1.get(i++));
			else if (j < list2.size())
				list.add(list2.get(j++));
		}

		return list;
	}
}
