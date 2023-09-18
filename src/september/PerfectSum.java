package september;

import java.util.Arrays;

public class PerfectSum {
	private final static int MOD = (int) (1e9 + 7);

	private int solve(int idx, int sum, int[] arr, int[][] dp) {
		if (sum < 0) {
			return 0;
		}
		if (idx < 0) {
			return sum == 0 ? 1 : 0;
		}
		if (arr[idx] != 0 && sum == 0) {
			return 1;
		}
		if (dp[idx][sum] != -1) {
			return dp[idx][sum];
		}

		return dp[idx][sum] = ((solve(idx - 1, sum - arr[idx], arr, dp) % MOD) + (solve(idx - 1, sum, arr, dp) % MOD))
				% MOD;
	}

	private int perfectSum(int n, int sum, int[] arr) {
		int[][] dp = new int[n][sum + 1];
		Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
		return solve(n - 1, sum, arr, dp);
	}

	public static void main(String[] args) {
		PerfectSum obj = new PerfectSum();
		int n = 6;
		int sum = 10;
		int[] arr = { 2, 3, 5, 6, 8, 10 };
		System.out.println(obj.perfectSum(n, sum, arr));
	}
}
