package chapter2;

import java.util.Scanner;

public class Exercise16_AreaOfAHexagon {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        double side, area;

        // Prompt user to enter the side
        System.out.print("Enter the side: ");
        side = input.nextDouble();

        // Calculate Area
        area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);

        System.out.println("The area of the hexagon is " + area);
    }
}
