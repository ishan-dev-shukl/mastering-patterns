package pattern_solutions;

public class _007_HalfPyramidNumbers {

	public static void main(String[] args) {

		int n = 5;
		// outer Loop
		for (int i = 1; i <= n; i++) {
			// 1st inner Loop for space
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
