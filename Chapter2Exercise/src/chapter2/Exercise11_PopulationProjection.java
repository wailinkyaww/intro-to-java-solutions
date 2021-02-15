package chapter2;

import java.util.Scanner;

public class Exercise11_PopulationProjection {
    public static void main(String[] args) {
        final long TOTAL_SECONDS_PER_YEAR = 3600 * 24 * 365;

        double birth = TOTAL_SECONDS_PER_YEAR / 7.0,
                death = TOTAL_SECONDS_PER_YEAR / 13.0,
                immigrant = TOTAL_SECONDS_PER_YEAR / 45.0;

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        // Calculate net population after specified year
        long netPopulation = (long) ((312_032_486 + (birth - death + immigrant) * numberOfYears) + 0.5);

        System.out.print("The population in " + numberOfYears + " years is " + netPopulation);
    }
}
