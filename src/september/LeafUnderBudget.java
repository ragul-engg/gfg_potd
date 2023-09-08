package september;

import java.util.LinkedList;
import java.util.Queue;

import utils.TreeNode;
import utils.TreeNodeLevelPair;

public class LeafUnderBudget {
	public int getCount(TreeNode node, int budget) {
		int result = 0;
		Queue<TreeNodeLevelPair> queue = new LinkedList<>();
		queue.offer(new TreeNodeLevelPair(node, 1));

		while (!queue.isEmpty()) {
			TreeNodeLevelPair levelPair = queue.poll();
			TreeNode pairNode = levelPair.node;
			int pairLevel = levelPair.level;
			if (pairNode.left == null && pairNode.right == null) {
				if (pairLevel <= budget) {
					budget -= pairLevel;
					result++;
				}
				continue;
			}
			if (pairNode.left != null) {
				queue.offer(new TreeNodeLevelPair(pairNode.left, pairLevel + 1));
			}
			if (pairNode.right != null) {
				queue.offer(new TreeNodeLevelPair(pairNode.right, pairLevel + 1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		LeafUnderBudget obj = new LeafUnderBudget();
		int[] arr = new int[] { 10, 8, 2, 3, -1, 3, 6, -1, -1, -1, 4 };
		TreeNode root = TreeNode.insert(0, arr.length, arr);
		int budget = 8;
		System.out.println(obj.getCount(root, budget));
	}
}
