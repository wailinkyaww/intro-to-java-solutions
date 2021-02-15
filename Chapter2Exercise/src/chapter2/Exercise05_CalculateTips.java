package chapter2;

import java.util.Scanner;

public class Exercise05_CalculateTips {
    public static void main(String[] args) {
        //  Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //  Prompt user to enter subtotal and gratuity
        System.out.print("Enter the subtotal and gratuity rate: ");
        int subTotal = input.nextInt();
        int gratuityRate = input.nextInt();

        //  Compute gratuity and total
        double gratuity = (gratuityRate / 100.0) * subTotal;
        double total = subTotal + gratuity;

        //  Display results
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
