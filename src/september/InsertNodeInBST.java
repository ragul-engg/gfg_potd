package september;

import utils.TreeNode;

public class InsertNodeInBST {
	private TreeNode insert(TreeNode root, int key) {
		if (root == null) {
			return new TreeNode(key);
		}
		if (root.data == key) {
			return root;
		} else if (root.data > key) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	private void print(TreeNode root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.data + " ");
			print(root.right);
		}
	}

	public static void main(String[] args) {
		InsertNodeInBST obj = new InsertNodeInBST();
		TreeNode root = null;
		root = obj.insert(root, 2);
		root = obj.insert(root, 3);
		root = obj.insert(root, 1);
		root = obj.insert(root, 10);
		obj.print(root);
	}
}
