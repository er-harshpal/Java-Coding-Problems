package Trees.Problems;

class Solution {

	public boolean isValidBST(TreeNode root) {
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode root, long min, long max) {

		if(root == null)
			return true;

		if(root.val <= min || root.val >= max)
			return false;

		return validate(root.left, min, root.val)
				&& validate(root.right, root.val, max);
	}
}



// Inorder
class Solution {

	TreeNode prev = null;

	public boolean isValidBST(TreeNode root) {

		if(root == null)
			return true;

		if(!isValidBST(root.left))
			return false;

		if(prev != null && prev.val >= root.val)
			return false;

		prev = root;

		return isValidBST(root.right);
	}
}