package Trees.Problems;

// Recursive
class Solution {

	public boolean isSymmetric(TreeNode root) {

		if(root == null)
			return true;

		return mirror(root.left, root.right);
	}

	private boolean mirror(TreeNode left, TreeNode right){

		if(left == null && right == null)
			return true;

		if(left == null || right == null)
			return false;

		if(left.val != right.val)
			return false;

		return mirror(left.left, right.right)
				&& mirror(left.right, right.left);
	}
}




// Iterative Queue
class Solution {

	public boolean isSymmetric(TreeNode root) {

		if(root == null)
			return true;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root.left);
		queue.offer(root.right);

		while(!queue.isEmpty()){

			TreeNode left = queue.poll();
			TreeNode right = queue.poll();

			if(left == null && right == null)
				continue;

			if(left == null || right == null)
				return false;

			if(left.val != right.val)
				return false;

			queue.offer(left.left);
			queue.offer(right.right);

			queue.offer(left.right);
			queue.offer(right.left);
		}

		return true;
	}
}