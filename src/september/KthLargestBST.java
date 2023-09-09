package september;

import utils.TreeNode;

public class KthLargestBST {

	private int kthLargest(TreeNode root, int K, int[] index) {
		if (root == null) {
			return -1;
		}
		int right = kthLargest(root.right, K, index);
		if (right != -1) {
			return right;
		}
		if (index[0] == K) {
			return root.data;
		}
		index[0]++;
		return kthLargest(root.left, K, index);
	}

	private int kthLargest(TreeNode root, int K) {
		int[] index = { 1 };
		return kthLargest(root, K, index);
	}

	public static void main(String[] args) {
		KthLargestBST obj = new KthLargestBST();
		int[] arr = { 4, 2, 9 };
		TreeNode root = TreeNode.insert(0, arr.length, arr);
		System.out.println(obj.kthLargest(root, 1));
	}

}
