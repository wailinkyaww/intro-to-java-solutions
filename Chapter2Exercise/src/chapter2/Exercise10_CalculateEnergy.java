package chapter2;

import java.util.Scanner;

public class Exercise10_CalculateEnergy {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt User to enter mass and temperatures
        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        //  Calculate Energy needed
        double energyNeeded = amountOfWater *  (finalTemperature - initialTemperature) * 4184;

        //  Display result
        System.out.println("The energy needed is : " + energyNeeded);
    }
}
