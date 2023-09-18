package september;

import java.util.Arrays;

public class PrintNFibonacciNumebrs {
	private static long[] printFibb(int n) {
		long[] ans = new long[n];
		ans[0] = 1;
		if (n > 1) {
			ans[1] = 1;
		}
		for (int i = 2; i < n; i++) {
			ans[i] = ans[i - 1] + ans[i - 2];
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 5;
		long[] res = printFibb(n);
		System.out.println(Arrays.toString(res));
	}
}
