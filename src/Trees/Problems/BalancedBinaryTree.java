package Trees.Problems;

public class BalancedBinaryTree {

	// =========================================================
	// 1. Binary Tree Node
	// =========================================================
	static class BinaryTreeNode {

		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}


	// =========================================================
	// 2. Insert into BST
	// =========================================================
	public BinaryTreeNode insert(BinaryTreeNode root, int data) {

		if (root == null) {
			return new BinaryTreeNode(data);
		}

		if (data < root.data) {
			root.left = insert(root.left, data);
		}
		else if (data > root.data) {
			root.right = insert(root.right, data);
		}

		return root;
	}


	// =========================================================
	// 3. Check Balanced Tree - Brute Force
	// =========================================================
	public boolean isBalanced(BinaryTreeNode root) {

		// Empty tree is balanced
		if (root == null) {
			return true;
		}

		// Calculate height of left and right subtree
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		// Check current node
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}

		// Check left and right subtrees
		return isBalanced(root.left)
				&& isBalanced(root.right);
	}


	// =========================================================
	// 4. Calculate Height
	// =========================================================
	private int height(BinaryTreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}


	// =========================================================
	// 5. Print Tree Sideways
	// =========================================================
	public void printTree(BinaryTreeNode root, int level) {

		if (root == null) {
			return;
		}

		// Right subtree
		printTree(root.right, level + 1);

		// Indentation
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}

		// Current node
		System.out.println(root.data);

		// Left subtree
		printTree(root.left, level + 1);
	}


	// =========================================================
	// 6. Main
	// =========================================================
	public static void main(String[] args) {

		BalancedBinaryTree tree =
				new BalancedBinaryTree();

		BinaryTreeNode root = null;

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








// ===============================================================================
// ===============================================================================
//package Trees.Problems;
//
//public class BalancedBinaryTreeOptimal {
//
//	// =========================================================
//	// 1. Binary Tree Node
//	// =========================================================
//	static class BinaryTreeNode {
//
//		int data;
//		BinaryTreeNode left;
//		BinaryTreeNode right;
//
//		BinaryTreeNode(int data) {
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//	}
//
//
//	// =========================================================
//	// 2. Insert into BST
//	// =========================================================
//	public BinaryTreeNode insert(BinaryTreeNode root, int data) {
//
//		if (root == null) {
//			return new BinaryTreeNode(data);
//		}
//
//		if (data < root.data) {
//			root.left = insert(root.left, data);
//		}
//		else if (data > root.data) {
//			root.right = insert(root.right, data);
//		}
//
//		return root;
//	}
//
//
//	// =========================================================
//	// 3. Check Balanced Tree - Optimal
//	// =========================================================
//	public boolean isBalanced(BinaryTreeNode root) {
//
//		return height(root) != -1;
//	}
//
//
//	// =========================================================
//	// 4. Calculate Height + Check Balance
//	// =========================================================
//	private int height(BinaryTreeNode root) {
//
//		if (root == null) {
//			return 0;
//		}
//
//		// Calculate left height
//		int leftHeight = height(root.left);
//
//		// Left subtree is already unbalanced
//		if (leftHeight == -1) {
//			return -1;
//		}
//
//		// Calculate right height
//		int rightHeight = height(root.right);
//
//		// Right subtree is already unbalanced
//		if (rightHeight == -1) {
//			return -1;
//		}
//
//		// Current node is unbalanced
//		if (Math.abs(leftHeight - rightHeight) > 1) {
//			return -1;
//		}
//
//		// Return actual height
//		return 1 + Math.max(leftHeight, rightHeight);
//	}
//
//
//	// =========================================================
//	// 5. Print Tree Sideways
//	// =========================================================
//	public void printTree(BinaryTreeNode root, int level) {
//
//		if (root == null) {
//			return;
//		}
//
//		// Right subtree
//		printTree(root.right, level + 1);
//
//		// Indentation
//		for (int i = 0; i < level; i++) {
//			System.out.print("    ");
//		}
//
//		// Current node
//		System.out.println(root.data);
//
//		// Left subtree
//		printTree(root.left, level + 1);
//	}
//
//
//	// =========================================================
//	// 6. Main
//	// =========================================================
//	public static void main(String[] args) {
//
//		BalancedBinaryTreeOptimal tree =
//				new BalancedBinaryTreeOptimal();
//
//		BinaryTreeNode root = null;
//
//		root = tree.insert(root, 10);
//		root = tree.insert(root, 5);
//		root = tree.insert(root, 15);
//		root = tree.insert(root, 3);
//		root = tree.insert(root, 7);
//		root = tree.insert(root, 12);
//		root = tree.insert(root, 18);
//
//		System.out.println("Binary Tree:");
//		tree.printTree(root, 0);
//
//		System.out.println();
//
//		if (tree.isBalanced(root)) {
//			System.out.println("Tree is Balanced");
//		}
//		else {
//			System.out.println("Tree is NOT Balanced");
//		}
//	}
//}
//
