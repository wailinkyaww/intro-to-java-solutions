package chapter4;

import java.util.Scanner;

public class Exercise24_OrderThreeCities {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter three cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();

		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();

		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();

		if (city1.compareTo(city2) < 0) {
			if (city1.compareTo(city3) < 0) {
				if (city2.compareTo(city3) < 0)
					System.out.println(
							"The three cities in alphabetical orders are " + city1 + " " + city2 + " " + city3);
				else
					System.out.println(
							"The three cities in alphabetical orders are " + city1 + " " + city3 + " " + city2);
			} else
				System.out.println("The three cities in alphabetical orders are " + city3 + " " + city1 + " " + city2);
		} else {
			if (city2.compareTo(city3) < 0) {
				if (city1.compareTo(city3) < 0)
					System.out.println(
							"The three cities in alphabetical orders are " + city2 + " " + city1 + " " + city3);
				else
					System.out.println(
							"The three cities in alphabetical orders are " + city2 + " " + city3 + " " + city1);
			} else
				System.out.println("The three cities in alphabetical orders are " + city3 + " " + city2 + " " + city1);
		}
	}
}
