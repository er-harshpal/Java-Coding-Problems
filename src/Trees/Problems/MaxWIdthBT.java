package Trees.Problems;

class Solution {

	class Pair {
		TreeNode node;
		long index;

		Pair(TreeNode node, long index) {
			this.node = node;
			this.index = index;
		}
	}

	public int widthOfBinaryTree(TreeNode root) {

		if (root == null)
			return 0;

		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(root, 0));

		int maxWidth = 0;

		while (!queue.isEmpty()) {

			int size = queue.size();

			long first = queue.peek().index;
			long last = first;

			for (int i = 0; i < size; i++) {

				Pair curr = queue.poll();

				long index = curr.index - first; // normalize

				last = index;

				if (curr.node.left != null)
					queue.offer(new Pair(curr.node.left, 2 * index));

				if (curr.node.right != null)
					queue.offer(new Pair(curr.node.right, 2 * index + 1));
			}

			maxWidth = Math.max(maxWidth, (int)(last + 1));
		}

		return maxWidth;
	}
}