package september;

import java.util.Arrays;

public class ReplaceOwithX {
	int[] adjNodesDiff = { 0, 1, 0, -1 };

	private char[][] fill(int n, int m, char[][] mat) {
		boolean[][] visited = new boolean[n][m];
		int idx = 0;
		for (idx = 0; idx < m; idx++) {
			if (!visited[0][idx] && mat[0][idx] == 'O') {
				dfs(0, idx, n, m, mat, visited);
			}
		}
		for (idx = 0; idx < m; idx++) {
			if (!visited[n - 1][idx] && mat[n - 1][idx] == 'O') {
				dfs(n - 1, idx, n, m, mat, visited);
			}
		}
		for (idx = 0; idx < n; idx++) {
			if (!visited[idx][0] && mat[idx][0] == 'O') {
				dfs(idx, 0, n, m, mat, visited);
			}
		}
		for (idx = 0; idx < n; idx++) {
			if (!visited[idx][m - 1] && mat[idx][m - 1] == 'O') {
				dfs(idx, m - 1, n, m, mat, visited);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && mat[i][j] == 'O') {
					mat[i][j] = 'X';
				}
			}
		}

		return mat;
	}

	private void dfs(int i, int j, int n, int m, char[][] mat, boolean[][] visited) {
		visited[i][j] = true;
		for (int idx = 0; idx < 4; idx++) {
			int newi = i + adjNodesDiff[idx];
			int newj = j + adjNodesDiff[3 - idx];
			if (isValid(newi, newj, n, m, mat, visited)) {
				dfs(newi, newj, n, m, mat, visited);
			}
		}
	}

	private boolean isValid(int newi, int newj, int n, int m, char[][] mat, boolean[][] visited) {
		return newi >= 0 && newi < n && newj >= 0 && newj < m && mat[newi][newj] == 'O' && !visited[newi][newj];
	}

	public static void main(String[] args) {
		ReplaceOwithX obj = new ReplaceOwithX();
		int n = 5, m = 4;
		char[][] mat = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'O', 'X', 'X' },
				{ 'X', 'X', 'O', 'O' } };
		mat = obj.fill(n, m, mat);
		System.out.println(Arrays.deepToString(mat));
	}
}
