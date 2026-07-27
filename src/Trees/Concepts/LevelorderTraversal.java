package Trees.Concepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelorderTraversal {

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

		// Base case: empty position found
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
	// 3. Level Order Traversal
	// =========================================================
	public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		// Empty tree
		if (root == null) {
			return result;
		}

		Queue<BinaryTreeNode> queue = new LinkedList<>();

		queue.offer(root);
		queue.offer(null);  // Marks the end of a level

		ArrayList<Integer> currentLevel = new ArrayList<>();

		while (!queue.isEmpty()) {

			BinaryTreeNode current = queue.poll();

			// If current is an actual node
			if (current != null) {

				currentLevel.add(current.data);

				// Add left child
				if (current.left != null) {
					queue.offer(current.left);
				}

				// Add right child
				if (current.right != null) {
					queue.offer(current.right);
				}
			}

			// null means current level has ended
			else {

				result.add(new ArrayList<>(currentLevel));

				currentLevel.clear();

				// If more nodes remain, mark the end
				// of the next level
				if (!queue.isEmpty()) {
					queue.offer(null);
				}
			}
		}

		return result;
	}




	// =========================================================
	// 4. Print Tree Sideways
	// =========================================================
	public void printTree(BinaryTreeNode root, int level) {

		if (root == null) {
			return;
		}

		// Print right subtree first
		printTree(root.right, level + 1);

		// Indentation according to depth
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

		LevelorderTraversal tree = new LevelorderTraversal();

		BinaryTreeNode root = null;

		// Construct BST
		root = tree.insert(root, 10);
		root = tree.insert(root, 1);
		root = tree.insert(root, 3);
		root = tree.insert(root, 5);
		root = tree.insert(root, 7);
		root = tree.insert(root, 9);
		root = tree.insert(root, 11);
		root = tree.insert(root, 13);
		root = tree.insert(root, 15);


		// Print tree
		System.out.println("Binary Search Tree:");
		tree.printTree(root, 0);


		// Level Order Traversal
		ArrayList<ArrayList<Integer>> result = tree.levelOrder(root);

		System.out.println("\nLevel Order Traversal:");
		System.out.println(result);


		// Height
		System.out.println("\nHeight of tree: " + result.size());
	}
}