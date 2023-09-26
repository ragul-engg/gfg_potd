package september;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {

	private static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = 0; i < n - 3; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n - 2; j++) {
				if (j > i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}
				int l = j + 1, r = n - 1;
				while (l < r) {
					int sum = arr[i] + arr[j] + arr[l] + arr[r];
					if (sum == k) {
						result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[l], arr[r])));
						l++;
						r--;
						while (l < r && arr[l] == arr[l - 1]) {
							l++;
						}
						while (l < r && arr[r] == arr[r + 1]) {
							r--;
						}
					} else {
						if (sum < k) {
							l++;
						} else {
							r--;
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int K = 3;
		int[] arr = { 0, 0, 2, 1, 1 };
		System.out.println(fourSum(arr, K));
	}

}
