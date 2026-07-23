package GRAPHS.Problems;

// KAHN'S Algorithm BFS topological sort
import java.util.*;

class Solution {

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i < numCourses; i++)
			graph.add(new ArrayList<>());

		int[] indegree = new int[numCourses];

		// Build graph
		for (int[] edge : prerequisites) {

			int course = edge[0];
			int pre = edge[1];

			graph.get(pre).add(course);

			indegree[course]++;
		}

		Queue<Integer> q = new LinkedList<>();

		// Add nodes having indegree 0
		for (int i = 0; i < numCourses; i++) {

			if (indegree[i] == 0)
				q.offer(i);

		}

		int count = 0;

		while (!q.isEmpty()) {

			int node = q.poll();

			count++;

			for (int neigh : graph.get(node)) {

				indegree[neigh]--;

				if (indegree[neigh] == 0)
					q.offer(neigh);

			}
		}

		return count == numCourses;
	}
}




// DFS Cycle Detection
import java.util.*;

class Solution {

	List<List<Integer>> graph;

	int[] state;

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		graph = new ArrayList<>();

		for (int i = 0; i < numCourses; i++)
			graph.add(new ArrayList<>());

		for (int[] edge : prerequisites)
			graph.get(edge[1]).add(edge[0]);

		state = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {

			if (dfs(i))
				return false;

		}

		return true;
	}

	private boolean dfs(int node) {

		if (state[node] == 1)
			return true;

		if (state[node] == 2)
			return false;

		state[node] = 1;

		for (int neigh : graph.get(node)) {

			if (dfs(neigh))
				return true;

		}

		state[node] = 2;

		return false;
	}
}

