package chapter13;

import java.util.ArrayList;

public class Exercise02_ShuffleArrayList {
	// Driver program for shuffling ArrayList
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);

		// Before shuffling
		System.out.print("Before shuffling the list: ");
		System.out.println(list.toString());

		// Shuffle the ArrayList
		ShuffleArrayList.shuffle(list);

		// After shuffling
		System.out.print("After shuffling the list: ");
		System.out.println(list.toString());
	}
}

class ShuffleArrayList {
	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			Number temp = list.get(i);
			int k = (int) (Math.random() * list.size());
			list.set(i, list.get(k));
			list.set(k, temp);
		}
	}
}
