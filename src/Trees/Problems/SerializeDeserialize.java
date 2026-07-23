package Trees.Problems;

// Serializatiob
public String serialize(TreeNode root) {

	StringBuilder sb = new StringBuilder();

	preorder(root, sb);

	return sb.toString();
}

private void preorder(TreeNode root,
                      StringBuilder sb){

	if(root == null){

		sb.append("null,");
		return;

	}

	sb.append(root.val).append(",");

	preorder(root.left, sb);

	preorder(root.right, sb);
}




// Deserialization
class Codec {

	private int index = 0;

	public TreeNode deserialize(String data) {

		String[] values = data.split(",");

		return build(values);
	}

	private TreeNode build(String[] values){

		if(values[index].equals("null")){

			index++;

			return null;

		}

		TreeNode root =
				new TreeNode(Integer.parseInt(values[index++]));

		root.left = build(values);

		root.right = build(values);

		return root;
	}
}





// COnplete
class Codec {

	private int index = 0;

	public String serialize(TreeNode root) {

		StringBuilder sb = new StringBuilder();

		dfs(root, sb);

		return sb.toString();
	}

	private void dfs(TreeNode root, StringBuilder sb){

		if(root == null){

			sb.append("null,");
			return;

		}

		sb.append(root.val).append(",");

		dfs(root.left, sb);

		dfs(root.right, sb);
	}

	public TreeNode deserialize(String data) {

		String[] arr = data.split(",");

		index = 0;

		return build(arr);
	}

	private TreeNode build(String[] arr){

		if(arr[index].equals("null")){

			index++;

			return null;
		}

		TreeNode root =
				new TreeNode(Integer.parseInt(arr[index++]));

		root.left = build(arr);

		root.right = build(arr);

		return root;
	}
}