package Trees.Problems;
import Trees.Concepts.BinaryTreeNode;
import java.util.*;

public class maxElementWithoutRecursion {
    public int maxInBinaryTreeLevelOrder(BinaryTreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();

            max = Math.max(max, tmp.getData());

            if (tmp.getLeft() != null)
                q.offer(tmp.getLeft());

            if (tmp.getRight() != null)
                q.offer(tmp.getRight());
        }
        return max;
    }

    public static void main(String[] args){
        BinaryTreeNode root = new BinaryTreeNode(30);
        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(35);
        root.right.right = new BinaryTreeNode(40);
        root.right.left = new BinaryTreeNode(47);
        root.left.right = new BinaryTreeNode(22);
        root.left.left = new BinaryTreeNode(27);


        maxElementWithoutRecursion obj = new maxElementWithoutRecursion();
        int count = obj.maxInBinaryTreeLevelOrder(root);
        System.out.println(count);
    }
}