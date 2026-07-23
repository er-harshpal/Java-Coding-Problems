package Trees.Problems;

// Recursive
class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;

		if (p == null || q == null)
			return false;

		if (p.val != q.val)
			return false;

		return isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right);
	}
}






// Iterative Queue
class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(p);
		queue.offer(q);

		while (!queue.isEmpty()) {

			TreeNode n1 = queue.poll();
			TreeNode n2 = queue.poll();

			if (n1 == null && n2 == null)
				continue;

			if (n1 == null || n2 == null)
				return false;

			if (n1.val != n2.val)
				return false;

			queue.offer(n1.left);
			queue.offer(n2.left);

			queue.offer(n1.right);
			queue.offer(n2.right);
		}

		return true;
	}
}