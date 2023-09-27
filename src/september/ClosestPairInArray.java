package september;

import java.util.ArrayList;

public class ClosestPairInArray {

	private static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
		ArrayList<Integer> result = new ArrayList<>();

		int i = 0, j = m - 1;
		int first = 0, second = 0;
		int diff = Integer.MAX_VALUE, sum = 0, currDiff = 0;

		while (i < n && j >= 0) {
			sum = arr[i] + brr[j];
			currDiff = Math.abs(x - sum);
			if (currDiff < diff) {
				first = arr[i];
				second = brr[j];
				diff = currDiff;
			}
			if (sum < x) {
				i++;
			} else {
				j--;
			}
		}

		result.add(first);
		result.add(second);
		return result;
	}

	public static void main(String[] args) {
		int N = 4, M = 4;
		int[] arr = { 1, 4, 5, 7 };
		int[] brr = { 10, 20, 30, 40 };
		int x = 32;
		System.out.println(printClosest(arr, brr, N, M, x));
	}

}
