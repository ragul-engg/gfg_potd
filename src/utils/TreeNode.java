package utils;

public class TreeNode {
	public int data;
	public TreeNode left, right;

	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public static TreeNode insert(int idx, int n, int[] arr) {
		TreeNode root = null;
		if (idx < n && arr[idx] != -1) {
			root = new TreeNode(arr[idx]);
			root.left = insert(2 * idx + 1, n, arr);
			root.right = insert(2 * idx + 2, n, arr);
		}
		return root;
	}

}
