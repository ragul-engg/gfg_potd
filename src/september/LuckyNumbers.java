package september;

public class LuckyNumbers {
	private static boolean isLucky(int n) {
		if (n % 2 == 0) {
			return false;
		}
		int x = 2;
		while (n >= x) {
			if (n % x == 0) {
				return false;
			}
			n -= n / x;
			x++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isLucky(19));
	}

}
