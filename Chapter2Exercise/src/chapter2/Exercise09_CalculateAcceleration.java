package chapter2;

import java.util.Scanner;

public class Exercise09_CalculateAcceleration {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter initial and final velocity and time taken
        System.out.print("Enter v0, v1 and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double timeTaken = input.nextDouble();

        //  Calculate acceleration
        double acceleration = (finalVelocity - initialVelocity) / timeTaken;

        /**
         * Display result
         * 0.00005 for rounding four decimal place
         */
        System.out.println("The average acceleration is " + (int)((acceleration + 0.00005) * 10000) / 10000.0);
    }
}
