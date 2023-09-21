package september;

import java.util.Arrays;

public class SticklerThief {
	private int findMaxSum(int n, int[] arr) {
		int len = arr.length;
		int[] dp = new int[len];
		Arrays.fill(dp, -1);
		return maximizeMoney(0, len, dp, arr);
	}

	private int maximizeMoney(int idx, int len, int[] dp, int[] arr) {
		if (idx >= len) {
			return 0;
		}
		if (dp[idx] != -1) {
			return dp[idx];
		}
		return dp[idx] = Math.max(arr[idx] + maximizeMoney(idx + 2, len, dp, arr),
				maximizeMoney(idx + 1, len, dp, arr));
	}

	public static void main(String[] args) {
		SticklerThief obj = new SticklerThief();
		int n = 5;
		int[] arr = { 6, 5, 5, 7, 4 };
		System.out.println(obj.findMaxSum(n, arr));
	}
}
