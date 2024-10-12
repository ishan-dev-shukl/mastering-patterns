package pattern_solutions;

import java.util.Scanner;

public class _016_HollowButterfly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the butterfly pattern: ");
		int rows = scanner.nextInt();

		// Upper part of the butterfly
		for (int i = 1; i <= rows; i++) {
			// Left wing
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*"); // Print star at the edges
				} else {
					System.out.print(" "); // Print space in between
				}
			}
			// Spaces in the middle
			for (int j = 1; j <= (2 * (rows - i)); j++) {
				System.out.print(" ");
			}
			// Right wing
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*"); // Print star at the edges
				} else {
					System.out.print(" "); // Print space in between
				}
			}
			System.out.println(); // Move to the next line
		}

		// Lower part of the butterfly
		for (int i = rows; i >= 1; i--) {
			// Left wing
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*"); // Print star at the edges
				} else {
					System.out.print(" "); // Print space in between
				}
			}
			// Spaces in the middle
			for (int j = 1; j <= (2 * (rows - i)); j++) {
				System.out.print(" ");
			}
			// Right wing
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("*"); // Print star at the edges
				} else {
					System.out.print(" "); // Print space in between
				}
			}
			System.out.println(); // Move to the next line
		}

		scanner.close();
	}
}
