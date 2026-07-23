package Trees.Problems;

class Solution {

	public List<Integer> rightSideView(TreeNode root) {

		List<Integer> answer = new ArrayList<>();

		if(root == null)
			return answer;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.offer(root);

		while(!queue.isEmpty()){

			int size = queue.size();

			for(int i = 0; i < size; i++){

				TreeNode curr = queue.poll();

				if(i == size - 1)
					answer.add(curr.val);

				if(curr.left != null)
					queue.offer(curr.left);

				if(curr.right != null)
					queue.offer(curr.right);
			}
		}

		return answer;
	}
}






// DFS
class Solution {

	List<Integer> answer = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {

		dfs(root, 0);

		return answer;
	}

	private void dfs(TreeNode root, int depth){

		if(root == null)
			return;

		if(depth == answer.size())
			answer.add(root.val);

		dfs(root.right, depth + 1);
		dfs(root.left, depth + 1);
	}
}
