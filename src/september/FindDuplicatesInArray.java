package september;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicatesInArray {

	private static ArrayList<Integer> duplicates(int n, int[] arr) {
		ArrayList<Integer> duplicates = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int val : arr) {
			hashMap.put(val, hashMap.getOrDefault(val, 0) + 1);
		}
		for (int val = 0; val < n; val++) {
			if (hashMap.getOrDefault(val, 0) > 1) {
				duplicates.add(val);
			}
		}
		if (duplicates.size() == 0) {
			duplicates.add(-1);
		}
		return duplicates;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 3 };
		int n = arr.length;
		System.out.println(duplicates(n, arr));
	}

}
