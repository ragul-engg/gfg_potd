package september;

import java.util.ArrayList;

public class BoundaryTraversal {
	private static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
		ArrayList<Integer> result = new ArrayList<>();
		if (m == 1 && n > 0) {
			for (int i = 0; i < n; i++) {
				result.add(matrix[i][0]);
			}
			return result;
		}
		for (int i = 0; i < m; i++) {
			result.add(matrix[0][i]);
		}
		if (n == 1) {
			return result;
		}
		for (int i = 1; i < n - 1; i++) {
			result.add(matrix[i][m - 1]);
		}
		for (int i = m - 1; i >= 0; i--) {
			result.add(matrix[n - 1][i]);
		}
		for (int i = n - 2; i > 0; i--) {
			result.add(matrix[i][0]);
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 4, m = 4;
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		ArrayList<Integer> result = boundaryTraversal(matrix, n, m);
		System.out.println(result);
	}

}
