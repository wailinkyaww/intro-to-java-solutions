package chapter10;

import java.util.Scanner;

public class Exercise07_ATMMachine {
	private static Account[] users = new Account[10];
	private static Scanner input;

	public static void main(String[] args) {
		// Create ten accounts with initial balance of 100
		for (int i = 0; i < users.length; i++) {
			users[i] = new Account(i, 100);
		}

		input = new Scanner(System.in);

		for (;;) {
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (id < 0 || id > 9)
				continue;

			while (true) {
				displayMainMenu();
				System.out.print("Enter a choice: ");
				int choice = input.nextInt();

				if (choice == 1) {
					System.out.println("The balance is " + users[id].getBalance());
				} else if (choice == 2) {
					System.out.print("Enter an amount to withdraw: ");
					double amount = input.nextDouble();
					users[id].withdraw(amount);
				} else if (choice == 3) {
					System.out.print("Enter an amount to deposit: ");
					double amount = input.nextDouble();
					users[id].depoist(amount);
				} else if (choice == 4) {
					System.out.println();
					break;
				} else
					System.out.println("Invalid choidce");
			}

		}

	}

	public static void displayMainMenu() {
		System.out.println("\nMain Menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
	}
}
