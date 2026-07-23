package GRAPHS.Problems;

// DFS
class Solution {

	public int findCircleNum(int[][] isConnected) {

		int n = isConnected.length;

		boolean[] visited = new boolean[n];

		int provinces = 0;

		for (int i = 0; i < n; i++) {

			if (!visited[i]) {

				provinces++;

				dfs(isConnected, visited, i);

			}
		}

		return provinces;
	}

	private void dfs(int[][] graph,
	                 boolean[] visited,
	                 int city) {

		visited[city] = true;

		for (int next = 0; next < graph.length; next++) {

			if (graph[city][next] == 1 &&
					!visited[next]) {

				dfs(graph, visited, next);

			}
		}
	}
}




// BFS

import java.util.*;

class Solution {

	public int findCircleNum(int[][] graph) {

		int n = graph.length;

		boolean[] visited = new boolean[n];

		int provinces = 0;

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {

			if (!visited[i]) {

				provinces++;

				visited[i] = true;

				queue.offer(i);

				while (!queue.isEmpty()) {

					int city = queue.poll();

					for (int next = 0; next < n; next++) {

						if (graph[city][next] == 1 &&
								!visited[next]) {

							visited[next] = true;

							queue.offer(next);

						}
					}
				}
			}
		}

		return provinces;
	}
}





// Union Find
class Solution {

	public int findCircleNum(int[][] graph) {

		int n = graph.length;

		int[] parent = new int[n];

		for (int i = 0; i < n; i++)
			parent[i] = i;

		int provinces = n;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (graph[i][j] == 1) {

					int p1 = find(parent, i);

					int p2 = find(parent, j);

					if (p1 != p2) {

						parent[p1] = p2;

						provinces--;

					}
				}
			}
		}

		return provinces;
	}

	private int find(int[] parent, int x) {

		if (parent[x] != x)
			parent[x] = find(parent, parent[x]);

		return parent[x];
	}
}