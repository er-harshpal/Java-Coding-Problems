package Trees.Concepts;

public class PreorderTraversal {
    public void PreOrder(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    public static BinaryTreeNode insert(BinaryTreeNode root, int data){
        // Tree is empty
        if(root == null){
            return new BinaryTreeNode(data);
        }
        if(data<root.data){
            root.left =   insert(root.left, data);
        }
        if(data>root.data){
            root.right =  insert(root.right, data);
        }

        return root;
    }

    public static void main(String[] args){
        BinaryTreeNode root = new BinaryTreeNode(10);
        root = insert(root, 1);
        root = insert(root, 3);
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 9);
        root = insert(root, 11);
        root = insert(root, 13);
        root = insert(root, 15);

        printTree(root, 0);
    }

    public static void printTree(BinaryTreeNode root, int level){
        if(root == null){
            return;
        }

        // Print the right subtree first
        printTree(root.right, level+1);

        //Print spaces according to the depth
        for(int i=0; i<level; i++){
            System.out.print("  ");
        }

        // Print the current node
        System.out.println(root.data);

        // Print the left subtree
        printTree(root.left, level+1);
    }
}







//package Trees;
//import java.util.*;
//public class PreorderTraversal {
//    public ArrayList<Integer> preorderTaversal(BinaryTreeNode root) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
//        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
//        s.push(root);
//        while (!s.isEmpty()) {
//            BinaryTreeNode tmp = s.pop();
//            res.add(tmp.data);
//            // pay more attention to this sequence
//            if (tmp.right != null) {
//                s.push(tmp.right);
//            }
//            if (tmp.left != null) {
//                s.push(tmp.left);
//            }
//
//        }return res;
//    }
//}
