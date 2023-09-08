package september;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.TreeNode;

public class BinaryTreeToBST {

	void addDataByInorder(TreeNode root, List<Integer> arr) {
		if (root != null) {
			addDataByInorder(root.left, arr);
			arr.add(root.data);
			addDataByInorder(root.right, arr);
		}
	}

	void insertInTree(TreeNode root, List<Integer> arr, int[] index) {
		if (root != null) {
			insertInTree(root.left, arr, index);
			root.data = arr.get(index[0]);
			index[0]++;
			insertInTree(root.right, arr, index);
		}
	}

	TreeNode binaryTreeToBST(TreeNode root) {
		List<Integer> arr = new ArrayList<>();
		int[] index = new int[1];
		addDataByInorder(root, arr);
		Collections.sort(arr);
		insertInTree(root, arr, index);
		return root;
	}

	public static void main(String[] args) {
	}

}