package Trees.Problems;

// Recursive
class Solution {

	public TreeNode searchBST(TreeNode root, int val) {

		if(root == null)
			return null;

		if(root.val == val)
			return root;

		if(val < root.val)
			return searchBST(root.left, val);

		return searchBST(root.right, val);
	}
}




// Iterative
class Solution {

	public TreeNode searchBST(TreeNode root, int val) {

		while(root != null){

			if(root.val == val)
				return root;

			if(val < root.val)
				root = root.left;

			else
				root = root.right;
		}

		return null;
	}
}