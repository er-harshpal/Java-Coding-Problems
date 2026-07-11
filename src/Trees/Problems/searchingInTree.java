package Trees.Problems;
import java.util.*;
import Trees.Concepts.BinaryTreeNode;

public class searchingInTree {

    public static boolean searchElementInBinaryTree(BinaryTreeNode root, int data){
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
        BinaryTreeNode root = new BinaryTreeNode(30);
        root.left = new BinaryTreeNode(20);
        root.right = new BinaryTreeNode(35);
        root.left.left = new BinaryTreeNode(27);
        root.left.right = new BinaryTreeNode(22);
        root.right.left = new BinaryTreeNode(47);
        root.right.right = new BinaryTreeNode(40);

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
