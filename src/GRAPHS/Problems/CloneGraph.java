package GRAPHS.Problems;

// DFS + HashMap
import java.util.*;

class Solution {

	Map<Node, Node> map = new HashMap<>();

	public Node cloneGraph(Node node) {

		if (node == null)
			return null;

		if (map.containsKey(node))
			return map.get(node);

		Node clone = new Node(node.val);

		map.put(node, clone);

		for (Node neighbor : node.neighbors) {

			clone.neighbors.add(cloneGraph(neighbor));

		}

		return clone;
	}
}





// BFS
import java.util.*;

class Solution {

	public Node cloneGraph(Node node) {

		if (node == null)
			return null;

		Map<Node, Node> map = new HashMap<>();

		Queue<Node> q = new LinkedList<>();

		q.offer(node);

		map.put(node, new Node(node.val));

		while (!q.isEmpty()) {

			Node curr = q.poll();

			for (Node neigh : curr.neighbors) {

				if (!map.containsKey(neigh)) {

					map.put(neigh, new Node(neigh.val));

					q.offer(neigh);

				}

				map.get(curr).neighbors.add(map.get(neigh));

			}
		}

		return map.get(node);
	}
}