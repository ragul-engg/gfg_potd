package september;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplications {
	final int MOD = 100000;

	int minimumMultiplications(int[] arr, int start, int end) {
		int n = arr.length;
		int[] dp = new int[100001];
		Arrays.fill(dp, -1);
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start % MOD);
		dp[start] = 0;
		while (!queue.isEmpty()) {
			int top = queue.poll();
			if (top == end) {
				return dp[end];
			} else {
				for (int idx = 0; idx < n; idx++) {
					int newVal = top * arr[idx];
					newVal = newVal % MOD;
					if (dp[newVal] == -1) {
						dp[newVal] = dp[top] + 1;
						queue.add(newVal);
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		MinimumMultiplications obj = new MinimumMultiplications();
		int[] arr = new int[] { 2, 5, 7 };
		int start = 3;
		int end = 30;
		System.out.println(obj.minimumMultiplications(arr, start, end));
	}
}
