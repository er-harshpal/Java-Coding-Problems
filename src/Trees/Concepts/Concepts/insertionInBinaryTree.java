package Trees.Concepts.Concepts;

import java.util.LinkedList;
import java.util.Queue;

public class insertionInBinaryTree {

    public class BinaryTreeNode {
        public int data;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BinaryTreeNode getLeft() {
            return left;
        }

        public void setLeft(BinaryTreeNode left) {
            this.left = left;
        }

        public BinaryTreeNode getRight() {
            return right;
        }

        public void setRight(BinaryTreeNode right) {
            this.right = right;
        }
    }

    public BinaryTreeNode insertInBinaryTreeLevelOrder(BinaryTreeNode root, int data) {

        // If the tree is empty, create the root.
        if (root == null) {
            return new BinaryTreeNode(data);
        }

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            BinaryTreeNode temp = q.poll();

            // Check left child
            if (temp.getLeft() != null) {
                q.offer(temp.getLeft());
            } else {
                temp.setLeft(new BinaryTreeNode(data));
                return root;
            }

            // Check right child
            if (temp.getRight() != null) {
                q.offer(temp.getRight());
            } else {
                temp.setRight(new BinaryTreeNode(data));
                return root;
            }
        }

        return root;
    }

    public static void main(String[] args) {

        insertionInBinaryTree tree = new insertionInBinaryTree();

        BinaryTreeNode root = tree.new BinaryTreeNode(1);
        root.setLeft(tree.new BinaryTreeNode(2));
        root.setRight(tree.new BinaryTreeNode(3));
        root.getLeft().setLeft(tree.new BinaryTreeNode(4));

        tree.insertInBinaryTreeLevelOrder(root, 5);

        System.out.println("Insertion completed.");
    }
}