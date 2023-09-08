package utils;

import java.util.ArrayList;
import java.util.List;

public class GraphUtils {
	public static List<List<Integer>> getAdjList(int V, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<>();
		for (int v = 0; v < V; v++) {
			adj.add(new ArrayList<>());
		}
		for (int[] edge : edges) {
			adj.get(edge[0]).add(edge[1]);
			adj.get(edge[1]).add(edge[0]);
		}
		return adj;
	}

	public static List<List<Integer>> getAdjListDirectedGraph(int V, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<>();
		for (int v = 0; v < V; v++) {
			adj.add(new ArrayList<>());
		}
		for (int[] edge : edges) {
			adj.get(edge[0]).add(edge[1]);
		}
		return adj;
	}

	public static void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
		visited[node] = true;
		for (int neigh : adj.get(node)) {
			if (!visited[neigh]) {
				dfs(neigh, adj, visited);
			}
		}
	}
}
