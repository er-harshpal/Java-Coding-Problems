package Trees.Problems;

public class BalancedBinaryTreee {
	///  Binary Tree Node
	class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	///  Insert into BinarySearchTree
	public BinaryTreeNode insert(BinaryTreeNode root, int data){
		if(root == null){
			return new BinaryTreeNode(data);
		}

		if(data< root.data){
			root.left = insert(root.left, data);
		}
		else if(data>root.data){
			root.right = insert(root.right, data);
		}

		return root;
	}

	/// Check Balanced Tree - Brute Force
	public boolean isBalanced(BinaryTreeNode root){

		// Empty tree is balanced
		if(root == null) {
			return true;
		}

		// Calculate height of left and right
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		// Check current node
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		// Check Left and right
		return isBalanced(root.left) && isBalanced(root.right);
	}

	/// Calculate Height
	private int height(BinaryTreeNode root) {
		if(root == null){
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}


	/// Print Tree Sideways
	public void printTree(BinaryTreeNode root, int level){
		if(root == null) {
			return;
		}
		// Right Subtree
		printTree(root.right, level + 1);

		// Indentation
		for(int i = 0; i<level; i++){
			System.out.println("  ");
		}

		// Current node
		System.out.println(root.data);

		// Left Subtree
		printTree(root.left, level + 1);
	}


	/// Main
	public static void main(String[] args) {

		BalancedBinaryTree tree =
				new BalancedBinaryTree();

		BalancedBinaryTree.BinaryTreeNode root = null;

		root = tree.insert(root, 10);
		root = tree.insert(root, 5);
		root = tree.insert(root, 15);
		root = tree.insert(root, 3);
		root = tree.insert(root, 7);
		root = tree.insert(root, 12);
		root = tree.insert(root, 18);

		System.out.println("Binary Tree:");
		tree.printTree(root, 0);

		System.out.println();

		if (tree.isBalanced(root)) {
			System.out.println("Tree is Balanced");
		}
		else {
			System.out.println("Tree is NOT Balanced");
		}
	}
}