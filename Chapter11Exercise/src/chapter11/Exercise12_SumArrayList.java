package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

// Test program
public class Exercise12_SumArrayList {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter five numbers: ");
		for (int i = 0; i < 5; i++) {
			Double d = input.nextDouble();
			list.add(d);
		}

		System.out.println("The sum of the numbers is " + SumArrayList.sum(list));
	}
}

class SumArrayList {
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		int i = list.size() - 1;
		for (;;) {
			if (i < 0)
				break;
			sum += list.get(i--);
		}
		return sum;
	}
}
