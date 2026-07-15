package Trees.Concepts;

public class PostorderTraversal {
    public void postOrder(BinaryTreeNode root){
        if(root == null ){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

	public static class BinaryTreeNode {
	    public int data;
	    public BinaryTreeNode left;
	    public BinaryTreeNode right;
	    public BinaryTreeNode(int data){
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }

	    public int getData(){
	        return data;
	    }


	    public void setData(int data){
	        this.data = data;
	    }

	    public BinaryTreeNode getLeft(){
	        return left;
	    }
	    public void setData(BinaryTreeNode left){
	        this.left = left;
	    }

	    public BinaryTreeNode getRight(){
	        return right;
	    }
	    public void setRight(BinaryTreeNode right){
	        this.right = right;
	    }


	}
}
