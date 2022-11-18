package pattern;

import java.util.Scanner;

public class squareInSquare {
	/*
7777777777777
7666666666667
7655555555567
7654444444567
7654333334567
7654322234567
7654321234567
7654322234567
7654333334567
7654444444567
7655555555567
7666666666667
7777777777777
	 */
	public static void main(String args[]) {
		squareInSquare pattern = new squareInSquare();
		pattern.toPrintPattern();
	}
	void toPrintPattern() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number..");
			int n = scan.nextInt();
			int l = n * 2 - 1;
			int[][] ar = new int[l][l];
			int[][] visit = new int[l][l];
			int start = 0, end = l - 1;
			while (n > 0) {
				for (int i = 0; i < l; i++) {
					for (int j = 0; j < l; j++) {
						if ((visit[i][j] == 0) && (i == start | i == end | j == start | j == end)) {
							ar[i][j] = n;
							visit[i][j] = 1;
						}
					}
				}
				start++;
				end--;
				n--;
			}
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < l; j++) {
					System.out.print(ar[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
