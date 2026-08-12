//package Trees.Problems;
//
//import Trees.Concepts.Concepts.BinaryTreeNode;
//
//import java.util.*;
//
//class BTMAXPathSum {
//
//	private int preorderIndex = 0;
//	private Map<Integer, Integer> inorderMap = new HashMap<>();
//
//	public BinaryTreeNode buildTree(int[] preorder, int[] inorder) {
//
//		for (int i = 0; i < inorder.length; i++) {
//			inorderMap.put(inorder[i], i);
//		}
//
//		return build(preorder, 0, inorder.length - 1);
//	}
//
//	private BinaryTreeNode build(int[] preorder, int left, int right) {
//
//		if (left > right)
//			return null;
//
//		int rootValue = preorder[preorderIndex++];
//		BinaryTreeNode root = new BinaryTreeNode(rootValue);
//
//		int mid = inorderMap.get(rootValue);
//
//		root.left = build(preorder, left, mid - 1);
//		root.right = build(preorder, mid + 1, right);
//
//		return root;
//	}
//}
