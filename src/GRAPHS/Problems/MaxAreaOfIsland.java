package GRAPHS.Problems;
// Recursive DFS
public class MaxAreaOfIsland {

	public static int maxAreaOfIsland(int[][] grid) {

		int maxArea = 0;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 1) {

					maxArea = Math.max(maxArea, dfs(grid, i, j));

				}
			}
		}

		return maxArea;
	}

	private static int dfs(int[][] grid, int i, int j) {

		if (i < 0 || j < 0 ||
				i >= grid.length ||
				j >= grid[0].length ||
				grid[i][j] == 0) {

			return 0;
		}

		grid[i][j] = 0;

		int area = 1;

		area += dfs(grid, i - 1, j);
		area += dfs(grid, i + 1, j);
		area += dfs(grid, i, j - 1);
		area += dfs(grid, i, j + 1);

		return area;
	}

	public static void main(String[] args) {

		int[][] grid = {
				{0,0,1,0,0},
				{1,1,1,0,0},
				{0,1,0,1,1},
				{0,0,0,1,1}
		};

		System.out.println(maxAreaOfIsland(grid));
	}
}





// Iterative DFS Using Stack
import java.util.Stack;

public class MaxAreaDFSStack {

	public static int maxAreaOfIsland(int[][] grid) {

		int maxArea = 0;

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[0].length;j++){

				if(grid[i][j]==1){

					Stack<int[]> stack = new Stack<>();
					stack.push(new int[]{i,j});
					grid[i][j]=0;

					int area=0;

					while(!stack.isEmpty()){

						int[] curr=stack.pop();

						area++;

						for(int[] d:dir){

							int r=curr[0]+d[0];
							int c=curr[1]+d[1];

							if(r>=0 && c>=0 &&
									r<grid.length &&
									c<grid[0].length &&
									grid[r][c]==1){

								grid[r][c]=0;
								stack.push(new int[]{r,c});
							}
						}
					}

					maxArea=Math.max(maxArea,area);
				}
			}
		}

		return maxArea;
	}
}




// BFS Using Queue

import java.util.LinkedList;
import java.util.Queue;

public class MaxAreaBFS {

	public static int maxAreaOfIsland(int[][] grid) {

		int maxArea = 0;

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[0].length;j++){

				if(grid[i][j]==1){

					Queue<int[]> q = new LinkedList<>();

					q.offer(new int[]{i,j});
					grid[i][j]=0;

					int area=0;

					while(!q.isEmpty()){

						int[] curr=q.poll();

						area++;

						for(int[] d:dir){

							int r=curr[0]+d[0];
							int c=curr[1]+d[1];

							if(r>=0 && c>=0 &&
									r<grid.length &&
									c<grid[0].length &&
									grid[r][c]==1){

								grid[r][c]=0;
								q.offer(new int[]{r,c});
							}
						}
					}

					maxArea=Math.max(maxArea,area);

				}
			}
		}

		return maxArea;
	}
}