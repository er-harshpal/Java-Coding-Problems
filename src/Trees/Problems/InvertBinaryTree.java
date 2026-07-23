package Trees.Problems;

// Recursive
class Solution {

	public TreeNode invertTree(TreeNode root) {

		if(root == null)
			return null;

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}
}




// BFS
class Solution {

	public TreeNode invertTree(TreeNode root) {

		if(root == null)
			return null;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		while(!queue.isEmpty()){

			TreeNode curr = queue.poll();

			TreeNode temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;

			if(curr.left != null)
				queue.offer(curr.left);

			if(curr.right != null)
				queue.offer(curr.right);

		}

		return root;
	}
}






// Iterative Stack DFS
class Solution {

	public TreeNode invertTree(TreeNode root) {

		if(root == null)
			return null;

		Stack<TreeNode> stack = new Stack<>();

		stack.push(root);

		while(!stack.isEmpty()){

			TreeNode curr = stack.pop();

			TreeNode temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;

			if(curr.left != null)
				stack.push(curr.left);

			if(curr.right != null)
				stack.push(curr.right);

		}

		return root;
	}
}