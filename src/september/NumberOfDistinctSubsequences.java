package september;

public class NumberOfDistinctSubsequences {
	private static final int MOD = (int) (1e9 + 7);

	private static int distinctSubsequences(String S) {
		int result = 1;
		int[] freq = new int[26];
		for (char ch : S.toCharArray()) {
			int rep = freq[ch - 'a'];
			freq[ch - 'a'] = result;
			result = (int) (((long) result * 2 - rep + MOD) % MOD);
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "gfg";
		System.out.println(distinctSubsequences(str));
	}
}