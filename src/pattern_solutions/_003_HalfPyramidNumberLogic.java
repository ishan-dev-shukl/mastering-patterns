package pattern_solutions;

public class _003_HalfPyramidNumberLogic {

	public static void main(String[] args) {

		int row = 4;
		int col = 5;

		// outer loop
		for (int i = 1; i <= row; i++) {
			// inner loop
			for (int j = 1; j <= col; j++) {
				// cell (i,j)
				if (i > j || i == j) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
