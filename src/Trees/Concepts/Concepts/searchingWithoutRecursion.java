package Trees.Concepts.Concepts;
import java.util.*;

public class searchingWithoutRecursion {

    public static class BinaryTreeNode {
        public int data;
        public BinaryTreeNode left, right;

        public BinaryTreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
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

    public boolean findInBinaryTree(BinaryTreeNode root, int data){

        if(root == null){
            return false;
        }

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            BinaryTreeNode tmp = q.poll();

            if(tmp.getData() == data){
                return true;
            }

            if(tmp.getLeft() != null){
                q.offer(tmp.getLeft());
            }

            if(tmp.getRight() != null){
                q.offer(tmp.getRight());
            }
        }

        return false;
    }
    public static void main(String[] args){

        searchingWithoutRecursion obj =
                new searchingWithoutRecursion();

        BinaryTreeNode root = new BinaryTreeNode(30);

        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(35);
        root.left.left = new BinaryTreeNode(27);
        root.left.right = new BinaryTreeNode(22);
        root.right.left = new BinaryTreeNode(47);
        root.right.right = new BinaryTreeNode(40);

        int data = 47;

        boolean found = obj.findInBinaryTree(root, data);

        if(found){
            System.out.println(data + " is present in the tree");
        } else{
            System.out.println(data + " is not present in the tree");
        }
    }
}
