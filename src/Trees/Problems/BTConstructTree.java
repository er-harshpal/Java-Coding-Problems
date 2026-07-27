package Trees.Problems;

import java.util.HashMap;
import java.util.Map;

public class BTConstructTree {

	// =========================================================
	// 1. Binary Tree Node
	// =========================================================
	static class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}


	// =========================================================
	// 2. Global Variables
	// =========================================================
	private int preorderIndex;
	private Map<Integer, Integer> inorderMap;


	// =========================================================
	// 3. Build Tree
	// =========================================================
	public TreeNode buildTree(int[] preorder, int[] inorder) {

		// Reset for every buildTree() call
		preorderIndex = 0;
		inorderMap = new HashMap<>();

		// Store inorder value -> index
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		return build(preorder, 0, inorder.length - 1);
	}


	// =========================================================
	// 4. Recursive Helper
	// =========================================================
	private TreeNode build(int[] preorder, int left, int right) {

		// No nodes available in this range
		if (left > right) {
			return null;
		}

		// First available preorder element is the root
		int rootValue = preorder[preorderIndex++];

		TreeNode root = new TreeNode(rootValue);

		// Find root position in inorder traversal
		int mid = inorderMap.get(rootValue);

		// Construct left subtree
		root.left = build(preorder, left, mid - 1);

		// Construct right subtree
		root.right = build(preorder, mid + 1, right);

		return root;
	}


	// =========================================================
	// 5. Print Tree Sideways
	// =========================================================
	public void printTree(TreeNode root, int level) {

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
	// 6. Inorder Traversal
	// =========================================================
	public void inorder(TreeNode root) {

		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}


	// =========================================================
	// 7. Preorder Traversal
	// =========================================================
	public void preorder(TreeNode root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}


	// =========================================================
	// 8. Main
	// =========================================================
	public static void main(String[] args) {

		BTConstructTree tree = new BTConstructTree();

		int[] preorder = {3, 9, 20, 15, 7};
		int[] inorder = {9, 3, 15, 20, 7};

		TreeNode root = tree.buildTree(preorder, inorder);

		System.out.println("Tree:");
		tree.printTree(root, 0);

		System.out.println("\nPreorder:");
		tree.preorder(root);

		System.out.println("\n\nInorder:");
		tree.inorder(root);
	}
}