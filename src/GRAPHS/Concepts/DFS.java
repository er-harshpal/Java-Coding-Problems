//package GRAPHS.Concepts;
//import java.util.*;
//
//
/////// Using Stack
////public class DFS {
////	public static void main(String[] args){
////
////	}
////	public static void dfs(int start, ArrayList<ArrayList<Integer>> graph){
////		boolean[] visited = new boolean[graph.size()];
////
////		Stack<Integer> stack = new Stack<>();
////		stack.push(start);
////
////		while(!stack.isEmpty()){
////			int node = stack.pop();
////			if(visited[node])
////				continue;
////			visited[node] = true;
////			System.out.println(node + " ");
////
////			for (int neighbour : graph){
////				if(!visited[neighbour]){
////					stack.push(neighbour);
////				}
////			}
////		}
////	}
////}
//
//
//
//
//
//
//
//
/////// In a TREE
////class TreeNode {
////	int val;
////	TreeNode left, right;
////	TreeNode(int val) {
////		this.val = val;
////	}
////}
////
////public class DFS {
////	public static void dfs(TreeNode root){
////		if(root == null)
////			return;
////
////		System.out.println(root.val + " "); // Visit
////
////		dfs(root.left); // Left
////		dfs(root.right); // Right
////	}
////
////	public static void main(String[] args){
////		TreeNode root = new TreeNode(1);
////		root.left = new TreeNode(2);
////		root.right = new TreeNode(3);
////		root.left.left = new TreeNode(4);
////		root.left.right =  new TreeNode(5);
////
////		dfs(root);
////	}
////}
//
//
//
//
//
//public class DFS {
//	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//	static void dfs(int node, boolean[] visited){
//		visited[node]  = true;
//
//		System.out.print(node + " ");
//
//		for (int neighbour : graph.get(node)){
//			if(!visited[neighbour]){
//				dfs(neighbour, visited);
//			}
//		}
//	}
//
//	public static void main(String[] args){
//		int V = 4;
//
//		for(int i = 0; i < V; i++){
//			graph.add(new ArrayList<>());
//		}
//
//		graph.get(0).add(1);
//		graph.get(0).add(1);
//
//		graph.get(0).add(1);
//		graph.get(0).add(1);
//
//		graph.get(0).add(1);
//		graph.get(0).add(1);
//
//		graph.get(0).add(1);
//		graph.get(0).add(1);
//
//	}
//}
//
