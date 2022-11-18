package pattern;

import java.util.Scanner;

public class twoTriangleInSquare {
	/*
11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888
	 */

	public static void main(String[] args) {
		twoTriangleInSquare pattern = new twoTriangleInSquare();
		pattern.toPrintPattern();
	}

	void toPrintPattern() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number..");
			int n = scan.nextInt();
			int[][] ar = new int[n][n];
			int end = n - 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j < end) {
						ar[i][j] = 1;
					} else {
						ar[i][j] = i + 1;
					}
				}
				end--;
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(ar[i][j]);
				}
				System.out.println();
			}
		}
	}
}
