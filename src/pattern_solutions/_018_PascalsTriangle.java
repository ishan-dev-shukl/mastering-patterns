package pattern_solutions;

import java.util.Scanner;

public class _018_PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        
        // Loop to print each row of Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print the values in the row
            int value = 1; // The first value in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Calculate the next value
            }
            
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}
