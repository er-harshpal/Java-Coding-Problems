package GRAPHS.Problems;

// Recursive DFS
import java.util.*;

class Solution {

	int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};

	public List<List<Integer>> pacificAtlantic(int[][] heights) {

		int rows = heights.length;
		int cols = heights[0].length;

		boolean[][] pacific = new boolean[rows][cols];
		boolean[][] atlantic = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {

			dfs(heights, pacific, i, 0);

			dfs(heights, atlantic, i, cols - 1);

		}

		for (int j = 0; j < cols; j++) {

			dfs(heights, pacific, 0, j);

			dfs(heights, atlantic, rows - 1, j);

		}

		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (pacific[i][j] && atlantic[i][j]) {

					ans.add(Arrays.asList(i, j));

				}
			}
		}

		return ans;
	}

	private void dfs(int[][] heights,
	                 boolean[][] visited,
	                 int r,
	                 int c) {

		visited[r][c] = true;

		for (int[] d : dir) {

			int nr = r + d[0];
			int nc = c + d[1];

			if (nr >= 0 &&
					nc >= 0 &&
					nr < heights.length &&
					nc < heights[0].length &&
					!visited[nr][nc] &&
					heights[nr][nc] >= heights[r][c]) {

				dfs(heights, visited, nr, nc);

			}
		}
	}
}





// BFS
import java.util.*;

class Solution {

	int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};

	public List<List<Integer>> pacificAtlantic(int[][] heights) {

		int rows = heights.length;
		int cols = heights[0].length;

		boolean[][] pacific = new boolean[rows][cols];
		boolean[][] atlantic = new boolean[rows][cols];

		Queue<int[]> pacQ = new LinkedList<>();
		Queue<int[]> atlQ = new LinkedList<>();

		for (int i = 0; i < rows; i++) {

			pacQ.offer(new int[]{i,0});
			atlQ.offer(new int[]{i,cols-1});

			pacific[i][0]=true;
			atlantic[i][cols-1]=true;
		}

		for (int j = 0; j < cols; j++) {

			pacQ.offer(new int[]{0,j});
			atlQ.offer(new int[]{rows-1,j});

			pacific[0][j]=true;
			atlantic[rows-1][j]=true;
		}

		bfs(heights,pacQ,pacific);

		bfs(heights,atlQ,atlantic);

		List<List<Integer>> ans = new ArrayList<>();

		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				if(pacific[i][j] && atlantic[i][j]){

					ans.add(Arrays.asList(i,j));

				}
			}
		}

		return ans;
	}

	private void bfs(int[][] heights,
	                 Queue<int[]> q,
	                 boolean[][] vis){

		while(!q.isEmpty()){

			int[] cur=q.poll();

			for(int[] d:dir){

				int nr=cur[0]+d[0];
				int nc=cur[1]+d[1];

				if(nr>=0 &&
						nc>=0 &&
						nr<heights.length &&
						nc<heights[0].length &&
						!vis[nr][nc] &&
						heights[nr][nc]>=heights[cur[0]][cur[1]]){

					vis[nr][nc]=true;

					q.offer(new int[]{nr,nc});
				}
			}
		}
	}
}