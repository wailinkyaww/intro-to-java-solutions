package chapter8;

import java.util.Scanner;

public class Exercise21_CentralCity {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the number of cities
		System.out.print("Enter the number of cities: ");
		int n = input.nextInt();

		// Cities
		double[][] cities = new double[n][2];

		// Prompt user to enter the coordinates of cities
		System.out.println("Enter the coordinates of the cities: ");
		for (int i = 0; i < cities.length; i++) {
			cities[i][0] = input.nextDouble();
			cities[i][1] = input.nextDouble();
		}

		int centralCity = 0;
		double shortestTotalDistance = calculateTotalDistance(cities, centralCity);
		for (int i = 0; i < cities.length; i++) {
			double totalDistance = calculateTotalDistance(cities, i);
			if (shortestTotalDistance > totalDistance) {
				shortestTotalDistance = totalDistance;
				centralCity = i;
			}
		}

		// Display results
		System.out.println("The central city is (" + cities[centralCity][0] + ", " + cities[centralCity][1] + ")");
		System.out.println("The total distance to all other cities is " + shortestTotalDistance);
	}

	// Calculate total distance from all cities with given city by index number
	public static double calculateTotalDistance(double[][] cities, int index) {
		double totalDistance = 0;
		for (int i = 0; i < cities.length; i++) {
			if (i == index)
				continue;
			totalDistance += distance(cities[index][0], cities[index][1], cities[i][0], cities[i][1]);
		}
		return Math.round(totalDistance * 100) / 100.0 ;
	}

	// Calculate distance between two points
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
