package september;

public class PowerOfTwo {
	private static boolean isPowerOfTwo(long n) {
		if (n == 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		long n = 1024;
		System.out.println(isPowerOfTwo(n));
	}
}
