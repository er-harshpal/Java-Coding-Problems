package Trees.Problems;

public class BTLCA {

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
	// 2. Lowest Common Ancestor
	// =========================================================
	public TreeNode lowestCommonAncestor(
			TreeNode root,
			TreeNode p,
			TreeNode q) {

		// Base Case 1:
		// Reached the end of the tree
		if (root == null) {
			return null;
		}

		// Base Case 2:
		// Found either p or q
		if (root == p || root == q) {
			return root;
		}

		// Search in left subtree
		TreeNode left = lowestCommonAncestor(root.left, p, q);

		// Search in right subtree
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		// p and q found in different subtrees
		// Therefore current root is their LCA
		if (left != null && right != null) {
			return root;
		}

		// If one side found p/q, return it upward
		if (left != null) {
			return left;
		}

		return right;
	}


	// =========================================================
	// 3. Print Tree
	// =========================================================
	public void printTree(TreeNode root, int level) {

		if (root == null) {
			return;
		}

		// Print right subtree
		printTree(root.right, level + 1);

		// Print indentation
		for (int i = 0; i < level; i++) {
			System.out.print("    ");
		}

		// Print current node
		System.out.println(root.data);

		// Print left subtree
		printTree(root.left, level + 1);
	}


	// =========================================================
	// 4. Main
	// =========================================================
	public static void main(String[] args) {

		BTLCA tree = new BTLCA();

        /*
                    3
                   / \
                  5   1
                 / \ / \
                6  2 0  8
                  / \
                 7   4
        */

		TreeNode root = new TreeNode(3);

		root.left = new TreeNode(5);
		root.right = new TreeNode(1);

		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);

		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);

		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);


		// Print tree
		System.out.println("Binary Tree:");
		tree.printTree(root, 0);


		// Find LCA of 5 and 1
		TreeNode p = root.left;          // 5
		TreeNode q = root.right;         // 1

		TreeNode lca = tree.lowestCommonAncestor(root, p, q);

		System.out.println("\nLCA of " + p.data + " and "
				+ q.data + " = " + lca.data);


		// Find LCA of 5 and 4
		p = root.left;                   // 5
		q = root.left.right.right;       // 4

		lca = tree.lowestCommonAncestor(root, p, q);

		System.out.println("LCA of " + p.data + " and "
				+ q.data + " = " + lca.data);
	}
}