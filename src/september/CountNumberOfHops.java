package september;

public class CountNumberOfHops {
	private final static int MOD = (int) (1e9 + 7);

	private static long countWays(int n) {
		if (n <= 0) {
			return 1;
		}
		long prev3 = 0;
		long prev2 = 0;
		long prev1 = 1;
		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum = (prev1 + prev2 + prev3) + MOD;
			prev3 = prev2;
			prev2 = prev1;
			prev1 = sum;
		}

		return prev1 % MOD;
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(countWays(n));
	}
}
