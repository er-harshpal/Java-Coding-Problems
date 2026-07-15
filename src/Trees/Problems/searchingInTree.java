package Trees.Problems;

import Trees.Concepts.PostorderTraversal;

public class searchingInTree {

    public static boolean searchElementInBinaryTree(PostorderTraversal.BinaryTreeNode root, int data){
        if(root == null){
            return false;
        }
        if(root.getData() == data){
            return true;
        }
        return searchElementInBinaryTree(root.getLeft(), data) ||
        searchElementInBinaryTree(root.getRight(), data);
    }

    public static void main(String[] args){
        PostorderTraversal.BinaryTreeNode root = new PostorderTraversal.BinaryTreeNode(30);
        root.left = new PostorderTraversal.BinaryTreeNode(20);
        root.right = new PostorderTraversal.BinaryTreeNode(35);
        root.left.left = new PostorderTraversal.BinaryTreeNode(27);
        root.left.right = new PostorderTraversal.BinaryTreeNode(22);
        root.right.left = new PostorderTraversal.BinaryTreeNode(47);
        root.right.right = new PostorderTraversal.BinaryTreeNode(40);

        int data = 47;

        boolean found = searchElementInBinaryTree(root, data);

        if(found){
            System.out.println(data + " is present in the tree");
        }
        else {
            System.out.println(data + " is not present in the tree");
        }
    }
}
