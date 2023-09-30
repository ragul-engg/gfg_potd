package september;

import java.util.Arrays;

public class BooleanMatrix {
	private static void booleanMatrix(int matrix[][]) {
		int R = matrix.length;
		int C = matrix[0].length;
		int[] rowFlag = new int[R];
		int[] colFlag = new int[C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (matrix[i][j] == 1) {
					rowFlag[i] = 1;
					colFlag[j] = 1;
				}
			}
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (rowFlag[i] == 1 || colFlag[j] == 1) {
					matrix[i][j] = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 0 }, { 0, 0 } };
		booleanMatrix(mat);
		System.out.println(Arrays.deepToString(mat));
	}

}
