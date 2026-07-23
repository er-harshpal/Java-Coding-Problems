package Trees.Problems;

// Recursive
class Solution {

	List<Integer> ans = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {

		dfs(root);

		return ans;
	}

	private void dfs(TreeNode root) {

		if(root == null)
			return;

		dfs(root.left);

		ans.add(root.val);

		dfs(root.right);

	}
}






// Iterative
class Solution {

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();

		TreeNode curr = root;

		while(curr != null || !stack.isEmpty()){

			while(curr != null){

				stack.push(curr);

				curr = curr.left;

			}

			curr = stack.pop();

			ans.add(curr.val);

			curr = curr.right;

		}

		return ans;

	}

}





// Morris Traversal
class Solution {

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<>();

		TreeNode curr = root;

		while(curr != null){

			if(curr.left == null){

				ans.add(curr.val);

				curr = curr.right;

			}else{

				TreeNode pred = curr.left;

				while(pred.right != null && pred.right != curr){

					pred = pred.right;

				}

				if(pred.right == null){

					pred.right = curr;

					curr = curr.left;

				}else{

					pred.right = null;

					ans.add(curr.val);

					curr = curr.right;

				}

			}

		}

		return ans;

	}

}