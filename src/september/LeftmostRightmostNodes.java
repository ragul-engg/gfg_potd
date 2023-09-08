package september;

import java.util.LinkedList;
import java.util.Queue;

import utils.TreeNode;

public class LeftmostRightmostNodes {
	public void printCorner(TreeNode node) {
		if (node == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(node);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int idx = 0; idx < size; idx++) {
				TreeNode popped = queue.poll();
				if (idx == 0 || idx == size - 1) {
					System.out.print(popped.data + " ");
				}
				if (popped.left != null) {
					queue.offer(popped.left);
				}
				if (popped.right != null) {
					queue.offer(popped.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		LeftmostRightmostNodes obj = new LeftmostRightmostNodes();
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		TreeNode root = TreeNode.insert(0, arr.length, arr);
		obj.printCorner(root);
	}
}