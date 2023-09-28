package utils;

public class ArrayUtils {
	public static void swap(int left, int right, int[] arr) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
