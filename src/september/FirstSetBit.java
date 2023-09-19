package september;

public class FirstSetBit {

	private static int getFirstSetBit(int n) {
		int result = 0;
		while (n > 0) {
			result++;
			if ((n & 1) == 1) {
				break;
			}
			n = n >> 1;
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 18;
		System.out.println(getFirstSetBit(n));
	}

}
