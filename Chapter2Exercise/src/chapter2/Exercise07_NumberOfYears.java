package chapter2;

import java.util.Scanner;

public class Exercise07_NumberOfYears {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt User to enter minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        //  Calculate years and days
        int days = minutes / (60 * 24);
        int years = days / 365;
        days %= 365;

        // Display results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
