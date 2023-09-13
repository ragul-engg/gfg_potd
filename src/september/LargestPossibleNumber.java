package september;

public class LargestPossibleNumber {
	private static String findLargest(int N, int S) {
		StringBuilder result = new StringBuilder();

		if (S == 0 && N != 1) {
			return "-1";
		}

		while (result.length() < N) {
			int val = S < 9 ? S : 9;
			S -= val;
			result.append((char) (val + '0'));
		}

		return S == 0 ? result.toString() : "-1";
	}

	public static void main(String[] args) {
		System.out.println(findLargest(2, 9));
	}

}
