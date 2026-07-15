package Trees.Concepts;

import java.util.*;

public class LevelorderTraversal {

    public ArrayList<ArrayList<Integer>> levelOrder(PostorderTraversal.BinaryTreeNode root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if(root == null){
            return res;
        }

        // Initialization
        Queue<PostorderTraversal.BinaryTreeNode> q = new LinkedList<PostorderTraversal.BinaryTreeNode>();

        q.offer(root);
        q.offer(null);

        ArrayList<Integer> curr = new ArrayList<>();

        while(!q.isEmpty()){

            PostorderTraversal.BinaryTreeNode tmp = q.poll();

            // poll is used to remove
            // offer is used to insert
            // peek is used to view the front
            // isEmpty checks whether the queue has any element
            // size returns the number of elements
            // clear removes all the elements
            // contains checks if an element exists and returns boolean
            // remove removes the first element
            // difference of poll from remove is remove gives exception when queue is empty while poll returns null
            // element returns the first element without removing it
            // difference from peek is when we write peek on an empty queue we get null and we get exception in element

            if(tmp != null){

                curr.add(tmp.data);

                if(tmp.left != null){
                    q.offer(tmp.left);
                }

                if(tmp.right != null){
                    q.offer(tmp.right);
                }

            }
            else{

                ArrayList<Integer> c_curr = new ArrayList<>(curr);

                res.add(c_curr);

                curr.clear(); // Java will clear the ref, so have to make a new ArrayList.

                // Completion of a level
                if(!q.isEmpty()){
                    q.offer(null);
                }

            }

        }
    return res;
    }

    public PostorderTraversal.BinaryTreeNode insert(PostorderTraversal.BinaryTreeNode root, int data){

        // Tree is empty
        if(root == null){
            return new PostorderTraversal.BinaryTreeNode(data);
        }

        if(data < root.data){
            root.left = insert(root.left, data);
        }

        else if(data > root.data){
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void printTree(PostorderTraversal.BinaryTreeNode root, int level){

        if(root == null){
            return;
        }

        printTree(root.right, level + 1);

        // Print spaces according to the depth
        for(int i = 0; i < level; i++){
            System.out.print("    ");
        }

        // Print the current node
        System.out.println(root.data);

        // Print the left subtree
        printTree(root.left, level + 1);
    }

    public static void main(String[] args){

        LevelorderTraversal tree = new LevelorderTraversal();

        PostorderTraversal.BinaryTreeNode root = new PostorderTraversal.BinaryTreeNode(10);



        root = tree.insert(root, 1);
        root = tree.insert(root, 3);
        root = tree.insert(root, 5);
        root = tree.insert(root, 7);
        root = tree.insert(root, 9);
        root = tree.insert(root, 11);
        root = tree.insert(root, 13);
        root = tree.insert(root, 15);

        tree.printTree(root, 0);

        System.out.println(tree.levelOrder(root));
        ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);
        System.out.println("The height of the tree is " + res.size());
    }
}