package september;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

	private static int solve(int idx, int N, int sum, int[] arr, int[][] dp) {
		if (idx == N) {
			return sum == 0 ? 1 : 0;
		}
		if (sum == 0) {
			return 1;
		}
		if (dp[idx][sum] != -1) {
			return dp[idx][sum];
		}

		int pick = 0;
		if (arr[idx] <= sum) {
			pick = solve(idx + 1, N, sum - arr[idx], arr, dp);
		}
		return dp[idx][sum] = pick | solve(idx + 1, N, sum, arr, dp);
	}

	private static int equalPartition(int N, int[] arr) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
		if (sum % 2 != 0) {
			return 0;
		}
		int[][] dp = new int[N][sum + 1];
		Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
		return solve(0, N, sum / 2, arr, dp) > 0 ? 1 : 0;
	}

	public static void main(String[] args) {
		int N = 4;
		int[] arr = { 1, 5, 11, 5 };
		System.out.println(equalPartition(N, arr));
	}

}
