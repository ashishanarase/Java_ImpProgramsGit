package starPatterns;

public class Star_HollowRectangle {

	public static void main(String[] args) {

		int r = 4;

		int c = 5;

		// 11 12 13 14 15 16 17
		// 21                27
		// 31                37
		// 41                47
		// 51 52 53 54 55 56 57	

		for (int i = 1; i<=r; i++) {

			for (int j = 1; j<=c; j++) {
				if ((i == 1) || (j == 1) || (i == r) || (j == c)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
