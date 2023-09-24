package september;

public class EquilibriumPoint {
	private static int equilibriumPoint(int n, long[] arr) {
		long totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += arr[i];
		}
		long leftSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum -= arr[i];
			if (leftSum == totalSum) {
				return i + 1;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		long[] arr = { 1, 3, 5, 2, 2 };
		int n = arr.length;
		System.out.print(equilibriumPoint(n, arr));
	}

}
