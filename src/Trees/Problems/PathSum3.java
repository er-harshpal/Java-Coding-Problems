package Trees.Problems;

class Solution {

	public int pathSum(TreeNode root, int targetSum) {

		HashMap<Long, Integer> prefixMap = new HashMap<>();
		prefixMap.put(0L, 1);

		return dfs(root, 0L, targetSum, prefixMap);
	}

	private int dfs(TreeNode root,
	                long currentSum,
	                int target,
	                HashMap<Long, Integer> prefixMap) {

		if (root == null)
			return 0;

		currentSum += root.val;

		int count = prefixMap.getOrDefault(currentSum - target, 0);

		prefixMap.put(currentSum,
				prefixMap.getOrDefault(currentSum, 0) + 1);

		count += dfs(root.left, currentSum, target, prefixMap);
		count += dfs(root.right, currentSum, target, prefixMap);

		prefixMap.put(currentSum, prefixMap.get(currentSum) - 1);

		return count;

	}
}