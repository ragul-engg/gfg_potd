package september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumSumCombination {
	private static List<Integer> maxCombinations(int N, int K, int[] A, int[] B) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		List<Integer> result = new ArrayList<>();
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = N - 1; i >= 0; i--) {
			for (int j = N - 1; j >= 0; j--) {
				int val = A[i] + B[j];
				if (heap.size() < K) {
					heap.add(val);
				} else if (heap.peek() < val) {
					heap.poll();
					heap.add(val);
				} else {
					break;
				}
			}
		}
		while (!heap.isEmpty()) {
			result.add(heap.poll());
		}
		Collections.reverse(result);
		return result;
	}

	public static void main(String[] args) {
		int N = 4;
		int K = 3;
		int[] A = { 1, 4, 2, 3 };
		int[] B = { 2, 5, 1, 6 };
		System.out.println(maxCombinations(N, K, A, B));
	}

}
