package pattern_solutions;

public class _006_HalfPyramidInvertedRight {

	public static void main(String[] args) {

		int row = 4;

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
