package september;

public class NumberOfEnclaves {
	private static void dfs(int[][] grid, int i, int j, int N, int M) {
		grid[i][j] = 0;
		int[] dx = { 0, 0, -1, 1 };
		int[] dy = { 1, -1, 0, 0 };
		for (int k = 0; k < 4; k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if (x >= 0 && x < N && y >= 0 && y < M && grid[x][y] == 1) {
				dfs(grid, x, y, N, M);
			}
		}
	}

	private static int numberOfEnclaves(int[][] grid) {
		int N = grid.length;
		int M = grid[0].length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (grid[i][j] == 1) {
					if (j == 0 || i == 0 || i == N - 1 || j == M - 1) {
						dfs(grid, i, j, N, M);
					}
				}
			}
		}
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (grid[i][j] == 1) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } };
		System.out.println(numberOfEnclaves(grid));
	}
}
