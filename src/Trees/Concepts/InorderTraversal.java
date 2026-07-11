package Trees.Concepts;

public class InorderTraversal {
    public void InOrder(BinaryTreeNode root){
        if(root!=null){
            System.out.println(root.data);
            InOrder(root.left);
            InOrder(root.right);
        }
    }
}
