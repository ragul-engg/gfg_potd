package september;

import java.util.ArrayList;

public class FirstLastOccurrence {
	private int lowerBound(int n, int x, int[] arr) {
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] >= x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	private ArrayList<Integer> find(int n, int x, int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int start = lowerBound(n, x, arr);
		int end = lowerBound(n, x + 1, arr);
		if (start == n || (start < n && arr[start] != x)) {
			result.add(-1);
			result.add(-1);
		} else {
			result.add(start);
			result.add(end - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		FirstLastOccurrence obj = new FirstLastOccurrence();
		int n = 9;
		int x = 5;
		int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		System.out.print(obj.find(n, x, arr));
	}

}
