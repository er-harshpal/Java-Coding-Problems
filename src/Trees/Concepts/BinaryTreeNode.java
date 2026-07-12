//package Trees.Concepts;
////// First Practice
//public class BinaryTreeNode {
//    public int data;
//    public BinaryTreeNode left, right;
//    public BinaryTreeNode(int data){
//        this.data = data;
//        left = null;
//        right = null;
//    }
//
//    public int getData(){
//        return data;
//    }
//    public void setData(int data){
//        this.data = data;
//    }
//    public BinaryTreeNode getLeft(){
//        return left;
//    }
//    public void setLeft(BinaryTreeNode left){
//        this.left = left;
//    }
//    public BinaryTreeNode getRight(){
//        return right;
//    }
//    public void setRight(BinaryTreeNode right){
//        this.right = right;
//    }
//
//    public static void main(String[] args){
//        BinaryTreeNode root = new BinaryTreeNode(10);
//        root.left = new BinaryTreeNode(11);
//        root.right = new BinaryTreeNode(12);
//        System.out.println(root.data);
//    }
//}


////Second Time
package Trees.Concepts;
public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData(){
        return data;
    }


    public void setData(int data){
        this.data = data;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }
    public void setData(BinaryTreeNode left){
        this.left = left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }
    public void setRight(BinaryTreeNode right){
        this.right = right;
    }
}