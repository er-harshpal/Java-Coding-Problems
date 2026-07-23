package GRAPHS.Problems;

// (Union Find + Path Compression + Union by Rank)
class Solution {

	int[] parent;
	int[] rank;

	public int[] findRedundantConnection(int[][] edges) {

		int n = edges.length;

		parent = new int[n + 1];
		rank = new int[n + 1];

		for (int i = 1; i <= n; i++)
			parent[i] = i;

		for (int[] edge : edges) {

			int u = edge[0];
			int v = edge[1];

			if (!union(u, v))
				return edge;
		}

		return new int[0];
	}

	private int find(int x) {

		if (parent[x] != x)
			parent[x] = find(parent[x]);

		return parent[x];
	}

	private boolean union(int x, int y) {

		int px = find(x);
		int py = find(y);

		if (px == py)
			return false;

		if (rank[px] < rank[py]) {

			parent[px] = py;

		} else if (rank[px] > rank[py]) {

			parent[py] = px;

		} else {

			parent[py] = px;

			rank[px]++;
		}

		return true;
	}
}




// Simple Union Find
class Solution {

	public int[] findRedundantConnection(int[][] edges) {

		int n = edges.length;

		int[] parent = new int[n + 1];

		for (int i = 1; i <= n; i++)
			parent[i] = i;

		for (int[] edge : edges) {

			int p1 = find(parent, edge[0]);
			int p2 = find(parent, edge[1]);

			if (p1 == p2)
				return edge;

			parent[p1] = p2;
		}

		return new int[0];
	}

	private int find(int[] parent, int x) {

		if (parent[x] != x)
			parent[x] = find(parent, parent[x]);

		return parent[x];
	}
}