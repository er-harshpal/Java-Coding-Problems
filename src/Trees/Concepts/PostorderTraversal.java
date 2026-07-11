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
}
