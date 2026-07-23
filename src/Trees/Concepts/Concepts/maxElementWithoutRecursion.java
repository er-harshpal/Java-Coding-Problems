package Trees.Concepts.Concepts;
import Trees.Concepts.PostorderTraversal;

import java.util.*;

public class maxElementWithoutRecursion {
    public int maxInBinaryTreeLevelOrder(PostorderTraversal.BinaryTreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<PostorderTraversal.BinaryTreeNode> q = new LinkedList<PostorderTraversal.BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            PostorderTraversal.BinaryTreeNode tmp = q.poll();

            max = Math.max(max, tmp.getData());

            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());

            if (tmp.getRight() != null)
                q.offer(tmp.getRight());
        }
        return max;
    }

    public static void main(String[] args){
        PostorderTraversal.BinaryTreeNode root = new PostorderTraversal.BinaryTreeNode(30);
        root.left = new PostorderTraversal.BinaryTreeNode(20);
        root.right = new PostorderTraversal.BinaryTreeNode(35);
        root.right.right = new PostorderTraversal.BinaryTreeNode(40);
        root.right.left = new PostorderTraversal.BinaryTreeNode(47);
        root.left.right = new PostorderTraversal.BinaryTreeNode(22);
        root.left.left = new PostorderTraversal.BinaryTreeNode(27);


        maxElementWithoutRecursion obj = new maxElementWithoutRecursion();
        int count = obj.maxInBinaryTreeLevelOrder(root);
        System.out.println(count);
    }
}