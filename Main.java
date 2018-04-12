package integrationproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Integration Project");
		System.out.println("Author: Romanov Andre");
		System.out.println("Last Edit: 04-03-18");

		Encryption basic = new BasicEncryption();
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 4) {
			System.out.println();

			System.out.println(" - Menu - ");
			System.out.println("1. Encrypt");
			System.out.println("2. Decrypt");
			System.out.println("3. Debug");
			System.out.println("4. Exit");

			System.out.print("Please choose a selection: ");
			choice = input.nextInt();
			input.nextLine(); // consumes empty character

			if (choice > 4 || choice < 1) { // invalid
				System.out.println("Invalid option. Try again");
				continue;
			} else if (choice == 4) {// exit
				break;
			} else if (choice == 3) { // debug
				basic.setDebug(!basic.getDebug());
				continue;
			} else {
				System.out.print("Type your message: ");
				String message = input.nextLine();
				if (choice == 1)
					System.out.println("Encrypted Message: " + basic.encrypt(message));//Access the methods of an object 
				else if (choice == 2)
					System.out.println("Decrypted Message: " + basic.decrypt(message));//Access the methods of an object
			}
		}
		System.out.println("The program has ended.");
		input.close();

	}
}

