package pattern_solutions;

import java.util.Scanner;

public class _017_HollowRhombus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the hollow rhombus pattern: ");
		int rows = scanner.nextInt();

		// Print the hollow rhombus pattern
		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Print stars and spaces
			for (int j = 1; j <= rows; j++) {
				if (j == 1 || j == rows || i == 1 || i == rows) {
					System.out.print("*"); // Print stars for edges
				} else {
					System.out.print(" "); // Print spaces in between
				}
			}
			System.out.println(); // Move to the next line
		}

		scanner.close();
	}
}
