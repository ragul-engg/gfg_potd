package september;

import java.util.Arrays;

import utils.ArrayUtils;

public class WaveArray {

	private static void convertToWave(int n, int[] arr) {
		int idx = 0;
		while (idx < n - 1) {
			if (((idx & 1) != 1 && arr[idx] < arr[idx + 1]) || ((idx & 1) == 1 && arr[idx] > arr[idx + 1])) {
				ArrayUtils.swap(idx, idx + 1, arr);
			}
			idx++;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int[] arr = { 1, 2, 3, 4, 5 };
		convertToWave(n, arr);
		System.out.println(Arrays.toString(arr));
	}

}
