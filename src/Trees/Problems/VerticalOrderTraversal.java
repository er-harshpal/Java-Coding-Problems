package Trees.Problems;

class Solution {

	class NodeInfo {
		int row;
		int col;
		int val;

		NodeInfo(int row, int col, int val) {
			this.row = row;
			this.col = col;
			this.val = val;
		}
	}

	List<NodeInfo> nodes = new ArrayList<>();

	public List<List<Integer>> verticalTraversal(TreeNode root) {

		dfs(root, 0, 0);

		Collections.sort(nodes, (a, b) -> {

			if (a.col != b.col)
				return a.col - b.col;

			if (a.row != b.row)
				return a.row - b.row;

			return a.val - b.val;
		});

		List<List<Integer>> answer = new ArrayList<>();

		int prevCol = Integer.MIN_VALUE;

		for (NodeInfo node : nodes) {

			if (node.col != prevCol) {
				answer.add(new ArrayList<>());
				prevCol = node.col;
			}

			answer.get(answer.size() - 1).add(node.val);
		}

		return answer;
	}

	private void dfs(TreeNode root, int row, int col) {

		if (root == null)
			return;

		nodes.add(new NodeInfo(row, col, root.val));

		dfs(root.left, row + 1, col - 1);
		dfs(root.right, row + 1, col + 1);
	}
}