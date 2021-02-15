package chapter2;

import java.util.Scanner;

public class Exercise23_CostOfDriving {
    public static void main(String[] args) {
        double distance, cost;
        final double MILES_PER_GALLON, PRICE_PER_GALLON;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        MILES_PER_GALLON = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        PRICE_PER_GALLON = input.nextDouble();

        // Calculate cost
        cost = (distance / MILES_PER_GALLON) * PRICE_PER_GALLON;
        System.out.println("The cost of driving is $" + (int)(cost * 100) / 100.0);
    }
}
