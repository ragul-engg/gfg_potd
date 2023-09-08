package september;

import java.util.Arrays;
import java.util.List;

import utils.GraphUtils;

public class MotherVertex {
	private int findMotherVertex(int V, List<List<Integer>> adj) {
		int mother = -1;
		boolean[] visited = new boolean[V];
		for (int v = 0; v < V; v++) {
			if (!visited[v]) {
				GraphUtils.dfs(v, adj, visited);
				mother = v;
			}
		}
		Arrays.fill(visited, false);
		GraphUtils.dfs(mother, adj, visited);
		for (int v = 0; v < V; v++) {
			if (!visited[v]) {
				return -1;
			}
		}
		return mother;
	}

	public static void main(String[] args) {
		MotherVertex obj = new MotherVertex();
		int V = 5;
		int[][] edges = { { 0, 2 }, { 0, 3 }, { 2, 1 }, { 1, 0 }, { 3, 4 } };
		List<List<Integer>> adj = GraphUtils.getAdjListDirectedGraph(V, edges);
		System.out.println(obj.findMotherVertex(V, adj));
	}

}
