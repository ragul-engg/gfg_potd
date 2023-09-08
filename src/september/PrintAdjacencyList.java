package september;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjacencyList {
	private List<List<Integer>> printGraph(int V, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<>();

		for (int idx = 0; idx < V; idx++) {
			adj.add(new ArrayList<>());
		}

		for (int[] edge : edges) {
			adj.get(edge[0]).add(edge[1]);
			adj.get(edge[1]).add(edge[0]);
		}

		return adj;
	}

	public static void main(String[] args) {
		PrintAdjacencyList obj = new PrintAdjacencyList();
		int V = 5;
		int[][] edges = { { 0, 1 }, { 0, 4 }, { 4, 1 }, { 4, 3 }, { 1, 3 }, { 1, 2 }, { 3, 2 } };
		List<List<Integer>> adj = obj.printGraph(V, edges);
		System.out.println(adj);
	}
}
