package Trees.Concepts;

public class InorderTraversal {

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
	// 3. Inorder Traversal
	// Left -> Root -> Right
	// =========================================================
	public void inOrder(BinaryTreeNode root) {

		if (root == null) {
			return;
		}

		// Visit left subtree
		inOrder(root.left);

		// Visit current node
		System.out.print(root.data + " ");

		// Visit right subtree
		inOrder(root.right);
	}


	// =========================================================
	// 4. Print Tree Sideways
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
	// 5. Main Method
	// =========================================================
	public static void main(String[] args) {

		InorderTraversal tree = new InorderTraversal();

		BinaryTreeNode root = null;

		// Construct BST
		root = tree.insert(root, 10);
		root = tree.insert(root, 5);
		root = tree.insert(root, 15);
		root = tree.insert(root, 3);
		root = tree.insert(root, 7);
		root = tree.insert(root, 12);
		root = tree.insert(root, 18);


		// Print Tree
		System.out.println("Binary Tree:");
		tree.printTree(root, 0);


		// Inorder Traversal
		System.out.println("\nInorder Traversal:");
		tree.inOrder(root);
	}
}