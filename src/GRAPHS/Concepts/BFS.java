//package GRAPHS.Concepts;
//
//import java.util.*;
//
//class TreeNode {
//	int val;
//	TreeNode left, right;
//}
/// /  On a Tree
//public class BFS {
//
//	static void bfs(TreeNode root){
//
//		if(root == null)
//			return;
//
//		Queue<TreeNode> queue = new LinkedList<>();
//
//		queue.offer(root);
//
//		while(!queue.isEmpty()){
//			TreeNode current = queue.poll();
//
//			System.out.println(current.val + " ");
//
//			if(current.left != null){
//				queue.offer(current.left);
//			}
//
//			if(current.right != null){
//				queue.offer(current.right);
//			}
//		}
//	}
//}

















/// Level Order Traversal

//static List<List<Integer>> levelOrder(TreeNode root){
//	List<List<Integer>> ans = new ArrayList<>();
//
//	if(root == null){
//		return ans;
//	}
//
//	Queue <TreeNode> queue = new LinkedList<>();
//
//	queue.offer(root);
//
//	while(!queue.isEmpty()){
//		int size = queue.size();
//
//		List<Integer> level = new ArrayList<>();
//
//		for(int i = 0; i < size; i++){
//			TreeNode node = queue.poll();
//
//			level.add(node.val);
//
//			if(node.left != null){
//				queue.offer(node.left);
//			}
//			if(node.right != null){
//				queue.offer(node.right);
//			}
//		}
//		ans.add(level);
//	}
//	return ans;
//}















//// BFS on a Graph
//static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {
//	boolean[] visited = new boolean[graph.size()];
//	Queue<Integer> queue = new LinkedList<>();
//
//	queue.offer(start);
//
//	visited[start] = true;
//
//	while (!queue.isEmpty()) {
//		int node = queue.poll();
//
//		System.out.print(node + " ");
//
//		for (int nieghbour : graph.get(node)){
//			if(!visited[nieghbour]){
//				visited[nieghbour] = true;
//				queue.offer(nieghbour);
//			}
//		}
//	}
//}


















//// Disconnected Graph
//static void bfs(ArrayList<ArrayList<Integer>> graph){
//	boolean[] visited = new boolean[graph.size()];
//
//	Queue<Integer> queue = new LinkedList<>();
//
//	for(int i=0; i < graph.size(); i++){
//		if(visited[i]){
//			continue;
//		}
//
//		queue.offer(i);
//		visited[i]=true;
//
//		while (!queue.isEmpty()){
//			int node = queue.poll();
//			System.out.print(node + " ");
//
//			for(int neighbour : graph.get(node)){
//				if(!visited[neighbour]){
//					visited[neighbour] = true;
//
//					queue.offer(neighbour);
//				}
//			}
//		}
//	}
//}


















////Multi Source BFS
//Queue<int[]> queue = new LinkedList<>();
//
//// Add all starting points
//for (int i = 0; i < rows; i++) {
//		for (int j = 0; j < cols; j++) {
//		if (grid[i][j] == 2) {
//		queue.offer(new int[]{i, j});
//		}
//		}
//		}
//
//		while (!queue.isEmpty()) {
//
//int[] current = queue.poll();
//
//int row = current[0];
//int col = current[1];
//
//// Visit neighbours
//}













////BFS in distance and time
//Queue<int[]> queue = new LinkedList<>();
//
//queue.offer(new int[]{startNode, 0});
//
//		while (!queue.isEmpty()) {
//
//int[] current = queue.poll();
//
//int node = current[0];
//int distance = current[1];
//
//    System.out.println(node + " " + distance);
//
//// Explore neighbours
//}











////BFS on a grid
//int[][] directions = {
//		{-1, 0},
//		{1, 0},
//		{0, -1},
//		{0, 1}
//};
//
//Queue<int[]> queue = new LinkedList<>();
//
//queue.offer(new int[]{row, col});
//
//		while (!queue.isEmpty()) {
//
//int[] current = queue.poll();
//
//int r = current[0];
//int c = current[1];
//
//    for (int[] dir : directions) {
//
//int nr = r + dir[0];
//int nc = c + dir[1];
//
//// Check bounds and visit
//    }
//		    }






/**
Pattern	Importance	Used In
Basic Tree BFS	⭐⭐⭐⭐⭐	Level Order
Level Order BFS	⭐⭐⭐⭐⭐	10+ tree problems
Graph BFS	⭐⭐⭐⭐⭐	Graph traversal
Grid BFS	⭐⭐⭐⭐⭐	Number of Islands, Flood Fill
Multi-Source BFS	⭐⭐⭐⭐☆	Rotting Oranges, 01 Matrix
BFS with Distance/Levels	⭐⭐⭐⭐☆	Shortest Path, Word Ladder
Disconnected Graph BFS	⭐⭐⭐⭐☆	Connected Components

 */