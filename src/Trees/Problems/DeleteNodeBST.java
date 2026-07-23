package Trees.Problems;


class Solution {

	public TreeNode deleteNode(TreeNode root, int key) {

		if(root == null)
			return null;

		if(key < root.val){

			root.left = deleteNode(root.left, key);

		}else if(key > root.val){

			root.right = deleteNode(root.right, key);

		}else{

			// Case 1: Leaf
			if(root.left == null && root.right == null)
				return null;

			// Case 2: Only right child
			if(root.left == null)
				return root.right;

			// Case 3: Only left child
			if(root.right == null)
				return root.left;

			// Case 4: Two children
			TreeNode successor = findMin(root.right);

			root.val = successor.val;

			root.right = deleteNode(root.right, successor.val);

		}

		return root;
	}

	private TreeNode findMin(TreeNode node){

		while(node.left != null)
			node = node.left;

		return node;
	}

}