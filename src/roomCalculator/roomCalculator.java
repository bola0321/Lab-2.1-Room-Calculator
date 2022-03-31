package roomCalculator;

import java.util.Scanner;

public class roomCalculator {

	public static void main(String[] args) {
		// get user input doubles(length and width)
		// display area to user
		// display perimeter
		// ask to continue

		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		boolean cont = true;
		String yesNo;
		Scanner scnr = new Scanner(System.in);
		// while loop to check condition of cont (true/false)
		// get values from user

		System.out.println("Welcome to the Room Calculator by Bolanle Aduroja" );
		do {
			System.out.print("\n" + "Enter room Length in feet: ");
			length = scnr.nextDouble();
			System.out.print("Enter room Width in feet: ");
			width = scnr.nextDouble();
			// do math
			area = length * width;
			perimeter = ((length * 2) + (width * 2));
			// print area and perimeter to user
			System.out.println("Area: " + area + " square ft");
			System.out.println("Perimeter: " + perimeter + " ft");
			System.out.println("");

			// Ask user if they would like to know the volume of room?
			do {
				System.out.print("Would you like to know the volume of the room? (y/n): ");
				yesNo = scnr.next().trim().toLowerCase();
			} while (!yesNo.equals("n") && !yesNo.equals("y"));

			if (yesNo.equals("y")) {
				System.out.print("Enter room Height in feet: ");
				height = scnr.nextDouble();
				volume = length * width * height;
				System.out.println("Volume: " + volume + " cubic ft");
			}

			// ask user to continue
			do {
				System.out.print("Continue? (y/n): ");
				yesNo = scnr.next().trim().toLowerCase();

			} while (!yesNo.equals("n") && !yesNo.equals("y"));

			if (yesNo.equals("n")) {
				cont = false;
				System.out.println("\n" + "Thank you for using the Room Calculator.");

			}
		} while (cont == true);
		scnr.close();

	}

}
