package pattern;

import java.util.Scanner;

public class TriangleNumber {

	public static void main(String[] args) {
		new TriangleNumber().getStart();
	}

	private void getStart() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scanner.nextInt();
		scanner.close();
		int[][] matrix = new int[num][num];
		int startingRow = 0, endingRow = num - 1;
		int startingColumn = 0, endingColumn = num - 1;
		int count = 1;
		while (count <= (num * (num + 1) / 2)) {
			int tem = startingRow;
			for (int index = startingColumn; index <= endingColumn; index++)
				matrix[tem++][index] = count++;
			endingRow--;
			startingColumn++;
			for (int index = endingRow; index >= startingRow; index--)
				matrix[index][endingColumn] = count++;
			endingColumn--;
			endingRow--;
			for (int index = endingColumn; index >= startingColumn; index--)
				matrix[startingRow][index] = count++;
			startingColumn++;
			startingRow++;
		}
//		System.out.println(Arrays.deepToString(matrix));
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (matrix[i][j] != 0)
					System.out.printf("%3d", matrix[i][j]);
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
