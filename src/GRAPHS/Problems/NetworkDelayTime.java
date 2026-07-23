package GRAPHS.Problems;

// Dijkstra Priority Queue

import java.util.*;

class Solution {

	public int networkDelayTime(int[][] times, int n, int k) {

		Map<Integer, List<int[]>> graph = new HashMap<>();

		for (int i = 1; i <= n; i++)
			graph.put(i, new ArrayList<>());

		for (int[] edge : times) {

			graph.get(edge[0]).add(new int[]{edge[1], edge[2]});

		}

		PriorityQueue<int[]> pq =
				new PriorityQueue<>((a, b) -> a[0] - b[0]);

		int[] dist = new int[n + 1];

		Arrays.fill(dist, Integer.MAX_VALUE);

		dist[k] = 0;

		pq.offer(new int[]{0, k});

		while (!pq.isEmpty()) {

			int[] cur = pq.poll();

			int time = cur[0];
			int node = cur[1];

			if (time > dist[node])
				continue;

			for (int[] nei : graph.get(node)) {

				int next = nei[0];
				int weight = nei[1];

				if (dist[next] > time + weight) {

					dist[next] = time + weight;

					pq.offer(new int[]{dist[next], next});

				}

			}

		}

		int ans = 0;

		for (int i = 1; i <= n; i++) {

			if (dist[i] == Integer.MAX_VALUE)
				return -1;

			ans = Math.max(ans, dist[i]);

		}

		return ans;
	}
}
