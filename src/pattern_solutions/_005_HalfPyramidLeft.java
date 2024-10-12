package pattern_solutions;

public class _005_HalfPyramidLeft {
	public static void main(String[] args) {

		int n = 4;

		// outer Loop
		for (int i = 1; i <= n; i++) {

			// 1st inner Loop for space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// 2nd inner Loop for Star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
