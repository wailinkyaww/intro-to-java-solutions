package chapter2;

import java.util.Scanner;

public class Exercise20_CalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance, annualInterestRate, interest;

        System.out.print("Enter balance and interest rate(e.g., 3 for 3%): ");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();

        // Calculate interest
        interest = balance * (annualInterestRate / 1200);

        System.out.println("The interest is " + (int)((interest + 0.000005) * 100000) / 100000.0);
    }
}
