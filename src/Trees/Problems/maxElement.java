package Trees.Problems;
import Trees.Concepts.BinaryTreeNode;
import java.util.*;

public class maxElement {
    public int maxInBinaryTree(BinaryTreeNode root) {
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
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(12);
        root.right = new BinaryTreeNode(14);
        root.right.right = new BinaryTreeNode(11);
        root.right.left = new BinaryTreeNode(13);
        root.left.right = new BinaryTreeNode(15);
        root.left.left = new BinaryTreeNode(18);

        maxElement obj = new maxElement();
        int value = obj.maxInBinaryTree(root);
        System.out.println(value);
    }
}
