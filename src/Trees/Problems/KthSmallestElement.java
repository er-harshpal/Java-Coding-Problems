package Trees.Problems;

class Solution {

	int count = 0;
	int answer = 0;

	public int kthSmallest(TreeNode root, int k) {

		inorder(root, k);

		return answer;
	}

	private void inorder(TreeNode root, int k){

		if(root == null)
			return;

		inorder(root.left, k);

		count++;

		if(count == k){

			answer = root.val;
			return;
		}

		inorder(root.right, k);
	}

}









//Iterative
class Solution {

	public int kthSmallest(TreeNode root, int k) {

		Stack<TreeNode> stack = new Stack<>();

		while(root != null || !stack.isEmpty()){

			while(root != null){

				stack.push(root);
				root = root.left;

			}

			root = stack.pop();

			k--;

			if(k == 0)
				return root.val;

			root = root.right;

		}

		return -1;
	}

}