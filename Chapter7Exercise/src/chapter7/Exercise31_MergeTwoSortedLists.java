package chapter7;

import java.util.Scanner;

public class Exercise31_MergeTwoSortedLists {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two sorted lists
		System.out.print("Enter list1: ");
		int n = input.nextInt();

		int[] list1 = new int[n];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.print("Enter list2: ");
		n = input.nextInt();

		int[] list2 = new int[n];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		int[] mergedList = merge(list1, list2);

		System.out.print("The merged list is: ");
		display(mergedList);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] x = new int[list1.length + list2.length];
		int i = 0, j = 0, k = 0;

		/**
		 * Check the values from same index of two arrays and add the smaller one first
		 * follow by the another value
		 */
		for (; i < list1.length && j < list2.length;) {
			if (list1[i] < list2[j])
				x[k++] = list1[i++];
			else
				x[k++] = list2[j++];
		}

		for (; i < list1.length;)
			x[k++] = list1[i++];

		for (; j < list2.length;)
			x[k++] = list2[j++];

		return x;
	}
}
