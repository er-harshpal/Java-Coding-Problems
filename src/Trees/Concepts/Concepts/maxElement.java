package Trees.Concepts.Concepts;
import Trees.Concepts.PostorderTraversal;

public class maxElement {
    public int maxInBinaryTree(PostorderTraversal.BinaryTreeNode root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = maxInBinaryTree(root.left);
            int rightMax = maxInBinaryTree(root.right);
            if (leftMax > rightMax) {
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }
            if (root.data > maxValue) {
                maxValue = root.data;
            }
        }return maxValue;
    }
    public static void main(String[] args){
        PostorderTraversal.BinaryTreeNode root = new PostorderTraversal.BinaryTreeNode(10);
        root.left = new PostorderTraversal.BinaryTreeNode(12);
        root.right = new PostorderTraversal.BinaryTreeNode(14);
        root.right.right = new PostorderTraversal.BinaryTreeNode(11);
        root.right.left = new PostorderTraversal.BinaryTreeNode(13);
        root.left.right = new PostorderTraversal.BinaryTreeNode(15);
        root.left.left = new PostorderTraversal.BinaryTreeNode(18);

        maxElement obj = new maxElement();
        int value = obj.maxInBinaryTree(root);
        System.out.println(value);
    }
}
