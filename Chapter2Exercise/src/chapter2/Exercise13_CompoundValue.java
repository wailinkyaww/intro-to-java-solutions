package chapter2;

import java.util.Scanner;

public class Exercise13_CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter saving amount
        System.out.print("Enter the monthly saving amount: ");
        int baseAmount = input.nextInt();

        // Monthly interest rate
        final double ANNUAL_INTEREST_RATE = 0.05;
        double monthlyInterestRate = ANNUAL_INTEREST_RATE / 12;

        double amount = baseAmount * (1 + monthlyInterestRate); // 1st month
        amount = (baseAmount + amount) * (1 + monthlyInterestRate); // 2nd month
        amount = (baseAmount + amount) * (1 + monthlyInterestRate); // 3rd month
        amount = (baseAmount + amount) * (1 + monthlyInterestRate); // 4th month
        amount = (baseAmount + amount) * (1 + monthlyInterestRate); // 5th month
        amount = (baseAmount + amount) * (1 + monthlyInterestRate); // 6th month

        // Display result
        System.out.println("After the sixth month, the account value is $" + (int)(amount * 100) / 100.0);
    }
}
