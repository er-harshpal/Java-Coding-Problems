package GRAPHS.Problems;

// KAHN'S Algorithm
import java.util.*;

class Solution {

	public int[] findOrder(int numCourses, int[][] prerequisites) {

		List<List<Integer>> graph = new ArrayList<>();

		for(int i=0;i<numCourses;i++)
			graph.add(new ArrayList<>());

		int[] indegree = new int[numCourses];

		for(int[] edge : prerequisites){

			int course = edge[0];
			int pre = edge[1];

			graph.get(pre).add(course);

			indegree[course]++;

		}

		Queue<Integer> q = new LinkedList<>();

		for(int i=0;i<numCourses;i++){

			if(indegree[i]==0)
				q.offer(i);

		}

		int[] order = new int[numCourses];

		int index=0;

		while(!q.isEmpty()){

			int node=q.poll();

			order[index++]=node;

			for(int neigh:graph.get(node)){

				indegree[neigh]--;

				if(indegree[neigh]==0)
					q.offer(neigh);

			}

		}

		if(index==numCourses)
			return order;

		return new int[0];

	}
}




// DFS Topological Sort
import java.util.*;

class Solution {

	List<List<Integer>> graph;

	int[] state;

	Stack<Integer> stack = new Stack<>();

	public int[] findOrder(int numCourses, int[][] prerequisites) {

		graph = new ArrayList<>();

		for(int i=0;i<numCourses;i++)
			graph.add(new ArrayList<>());

		for(int[] edge:prerequisites)
			graph.get(edge[1]).add(edge[0]);

		state=new int[numCourses];

		for(int i=0;i<numCourses;i++){

			if(state[i]==0){

				if(dfs(i))
					return new int[0];

			}

		}

		int[] ans=new int[numCourses];

		int i=0;

		while(!stack.isEmpty()){

			ans[i++]=stack.pop();

		}

		return ans;
	}

	private boolean dfs(int node){

		state[node]=1;

		for(int neigh:graph.get(node)){

			if(state[neigh]==1)
				return true;

			if(state[neigh]==0){

				if(dfs(neigh))
					return true;

			}

		}

		state[node]=2;

		stack.push(node);

		return false;
	}
}







