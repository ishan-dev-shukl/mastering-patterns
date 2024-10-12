package pattern_solutions;

public class _012_Rhombus {

	public static void main(String[] args) {

		int n = 5;
		int m = 9;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				if ((i + j) > 5 && (i + j) < 10) {

					System.out.print("*");
				} else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
