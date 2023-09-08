package september;

import utils.TreeNode;

public class CheckIsomorphicTree {

	boolean isIsomorphic(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.data != root2.data) {
			return false;
		}

		return (isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right))
				|| (isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left));
	}

	public static void main(String[] args) {
		CheckIsomorphicTree obj = new CheckIsomorphicTree();
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 1, 3, 2, -1, -1, -1, 4 };
		TreeNode root1 = TreeNode.insert(0, arr1.length, arr1);
		TreeNode root2 = TreeNode.insert(0, arr2.length, arr2);
		if (obj.isIsomorphic(root1, root2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
