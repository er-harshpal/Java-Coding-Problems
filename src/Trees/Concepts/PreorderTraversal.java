import Trees.Concepts.BinaryTreeNode;

public class PreorderTraversal {

	public void preOrderTraversal(BinaryTreeNode root){
		if(root == null)
			return;
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args){

		BinaryTreeNode root = null;

		root = BinaryTreeNode.insert(root,10);
		root = BinaryTreeNode.insert(root,17);
		root = BinaryTreeNode.insert(root,30);
		root = BinaryTreeNode.insert(root,5);
		root = BinaryTreeNode.insert(root,777);
		root = BinaryTreeNode.insert(root,99999);
		root = BinaryTreeNode.insert(root,101);
		root = BinaryTreeNode.insert(root,3);
		root = BinaryTreeNode.insert(root,1);

		PreorderTraversal obj = new PreorderTraversal();

		obj.preOrderTraversal(root);
	}
}



