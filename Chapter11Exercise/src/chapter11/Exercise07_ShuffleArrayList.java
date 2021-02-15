package chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise07_ShuffleArrayList {
	// Shuffling the items in ArrayList
	public static void shuffle(ArrayList<Integer> list) {
		int k, temp = 0, i = 0;
		for (; i < list.size();) {
			k = (int) (Math.random() * list.size());
			temp = list.get(k);
			list.set(k, list.get(i));
			list.set(i++, temp);
		}
	}

	/**
	 * You can also use shuffle method support in java.util.Colltections
	 */
//	public static void shuffle(ArrayList<Integer> list) {
//		java.util.Collections.shuffle(list);
//	}

	public static void assignItems(ArrayList<Integer> list) {
		for (int i = 0; i < 15; i++) {
			list.add(i, i);
		}
	}

	// Driver program
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// assign item 0-14
		assignItems(list);

		// Before shuffling
		System.out.println("Before shuffling: ");
		System.out.println(list);

		shuffle(list);

		// After shuffling
		System.out.println("After shuffling: ");
		System.out.println(list);
	}
}
