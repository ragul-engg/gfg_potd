package september;

public class PerfectNumbers {
	private static int isPerfectNumber(long N) {
		long factSum = 1;

		for (long val = 2; val * val <= N; val++) {
			if (N % val == 0) {
				factSum += val;
				if (N / val != val) {
					factSum += N / val;
				}
			}
		}

		return factSum == N && N > 1 ? 1 : 0;
	}

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
	}

}
