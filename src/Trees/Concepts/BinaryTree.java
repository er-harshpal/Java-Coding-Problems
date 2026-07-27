package Trees.Problems;

public class BinaryTree {

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
	// 2. Insert Node into BST
	// =========================================================
	public BinaryTreeNode insert(BinaryTreeNode root, int data) {

		// Empty position found
		if (root == null) {
			return new BinaryTreeNode(data);
		}

		// Insert into left subtree
		if (data < root.data) {
			root.left = insert(root.left, data);
		}

		// Insert into right subtree
		else if (data > root.data) {
			root.right = insert(root.right, data);
		}

		// Duplicate values are ignored
		return root;
	}


	// =========================================================
	// 3. Print Tree Sideways
	// =========================================================
	public void printTree(BinaryTreeNode root, int level) {

		if (root == null) {
			return;
		}

		// Print right subtree
		printTree(root.right, level + 1);

		// Print spaces according to depth
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}

		// Print current node
		System.out.println(root.data);

		// Print left subtree
		printTree(root.left, level + 1);
	}


	// =========================================================
	// 4. Main Method
	// =========================================================
	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();

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
	}
}
