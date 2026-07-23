package GRAPHS.Problems;

// Priority Queue
import java.util.*;

class Solution {

	public int findCheapestPrice(int n,
	                             int[][] flights,
	                             int src,
	                             int dst,
	                             int k) {

		Map<Integer, List<int[]>> graph = new HashMap<>();

		for (int i = 0; i < n; i++)
			graph.put(i, new ArrayList<>());

		for (int[] flight : flights) {

			graph.get(flight[0])
					.add(new int[]{
							flight[1],
							flight[2]
					});

		}

		PriorityQueue<int[]> pq =
				new PriorityQueue<>(
						(a, b) -> a[0] - b[0]);

		pq.offer(new int[]{
				0,
				src,
				0
		});

		int[] bestStops = new int[n];

		Arrays.fill(bestStops, Integer.MAX_VALUE);

		while (!pq.isEmpty()) {

			int[] cur = pq.poll();

			int cost = cur[0];
			int node = cur[1];
			int stops = cur[2];

			if (node == dst)
				return cost;

			if (stops > k)
				continue;

			if (stops > bestStops[node])
				continue;

			bestStops[node] = stops;

			for (int[] nei : graph.get(node)) {

				pq.offer(new int[]{
						cost + nei[1],
						nei[0],
						stops + 1
				});

			}

		}

		return -1;
	}
}




// BFS
import java.util.*;

class Solution {

	public int findCheapestPrice(int n,
	                             int[][] flights,
	                             int src,
	                             int dst,
	                             int k) {

		List<List<int[]>> graph = new ArrayList<>();

		for (int i = 0; i < n; i++)
			graph.add(new ArrayList<>());

		for (int[] f : flights)
			graph.get(f[0]).add(new int[]{f[1], f[2]});

		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{src, 0});

		cost[src] = 0;

		int stops = 0;

		while (!queue.isEmpty() && stops <= k) {

			int size = queue.size();

			int[] temp = cost.clone();

			while (size-- > 0) {

				int[] cur = queue.poll();

				int node = cur[0];
				int currCost = cur[1];

				for (int[] nei : graph.get(node)) {

					int next = nei[0];
					int price = nei[1];

					if (currCost + price < temp[next]) {

						temp[next] = currCost + price;

						queue.offer(new int[]{next, temp[next]});
					}
				}
			}

			cost = temp;
			stops++;
		}

		return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
	}
}

