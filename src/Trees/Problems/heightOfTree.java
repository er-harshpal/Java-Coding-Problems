import Trees.Concepts.PostorderTraversal;

import java.util.LinkedList;
import java.util.Queue;

public static int height(PostorderTraversal.BinaryTreeNode root) {

	if (root == null) {
		return 0;
	}

	Queue<PostorderTraversal.BinaryTreeNode> queue = new LinkedList<>();
	queue.offer(root);

	int height = 0;

	while (!queue.isEmpty()) {

		int size = queue.size();

		// Process one complete level
		for (int i = 0; i < size; i++) {

			PostorderTraversal.BinaryTreeNode current = queue.poll();

			if (current.left != null) {
				queue.offer(current.left);
			}

			if (current.right != null) {
				queue.offer(current.right);
			}
		}

		height++;
	}

	return height;
}

void main() {

}