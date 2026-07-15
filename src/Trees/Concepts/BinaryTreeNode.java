import java.util.*;
public class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;

	BinaryTreeNode(int data) {
		this.data = data;
	}

	public static BinaryTreeNode insertLevelOrder(BinaryTreeNode root, int data) {

		if (root == null)
			return new BinaryTreeNode(data);

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			BinaryTreeNode current = queue.poll();

			if (current.left == null) {
				current.left = new BinaryTreeNode(data);
				return root;
			}
			queue.offer(current.left);

			if (current.right == null) {
				current.right = new BinaryTreeNode(data);
				return root;
			}
			queue.offer(current.right);
		}

		return root;
	}
}