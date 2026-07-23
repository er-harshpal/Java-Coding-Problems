package Trees.Problems;

// Brute FOrce
class Solution {

	public boolean isBalanced(TreeNode root) {

		if(root == null)
			return true;

		int left = height(root.left);
		int right = height(root.right);

		if(Math.abs(left - right) > 1)
			return false;

		return isBalanced(root.left)
				&& isBalanced(root.right);
	}

	private int height(TreeNode root){

		if(root == null)
			return 0;

		return 1 + Math.max(height(root.left), height(root.right));
	}
}






// Optimal
class Solution {

	public boolean isBalanced(TreeNode root) {

		return height(root) != -1;
	}

	private int height(TreeNode root){

		if(root == null)
			return 0;

		int left = height(root.left);

		if(left == -1)
			return -1;

		int right = height(root.right);

		if(right == -1)
			return -1;

		if(Math.abs(left-right) > 1)
			return -1;

		return 1 + Math.max(left, right);
	}
}