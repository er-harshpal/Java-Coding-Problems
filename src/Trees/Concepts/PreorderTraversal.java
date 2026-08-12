//import Trees.Concepts.BinaryTreeNode;
//import Trees.Concepts.PostorderTraversal;
//
//public class PreorderTraversal {
//
//	public void preOrderTraversal(BinaryTreeNode root){
//		if(root == null)
//			return;
//		preOrderTraversal(root.left);
//		preOrderTraversal(root.right);
//		System.out.print(root.data + " ");
//	}
//
//	public static void main(String[] args){
//
//		BinaryTreeNode root = null;
//
//		root = BinaryTreeNode.insert(root,10);
//		root = BinaryTreeNode.insert(root,17);
//		root = BinaryTreeNode.insert(root,30);
//		root = BinaryTreeNode.insert(root,5);
//		root = BinaryTreeNode.insert(root,777);
//		root = BinaryTreeNode.insert(root,99999);
//		root = BinaryTreeNode.insert(root,101);
//		root = BinaryTreeNode.insert(root,3);
//		root = BinaryTreeNode.insert(root,1);
//
//		PreorderTraversal obj = new PreorderTraversal();
//
//		obj.preOrderTraversal(root);
//	}
//
//	public static class BinaryTreeNode {
//		public int data;
//		public PostorderTraversal.BinaryTreeNode left;
//		public PostorderTraversal.BinaryTreeNode right;
//		public BinaryTreeNode(int data){
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//
//		public int getData(){
//			return data;
//		}
//
//
//		public void setData(int data){
//			this.data = data;
//		}
//
//		public PostorderTraversal.BinaryTreeNode getLeft(){
//			return left;
//		}
//		public void setData(PostorderTraversal.BinaryTreeNode left){
//			this.left = left;
//		}
//
//		public PostorderTraversal.BinaryTreeNode getRight(){
//			return right;
//		}
//		public void setRight(PostorderTraversal.BinaryTreeNode right){
//			this.right = right;
//		}
//	}
//}
//
//
//
