package GRAPHS.Problems;

// Multisource BFS
import java.util.*;

class Solution {

	public int orangesRotting(int[][] grid) {

		Queue<int[]> queue = new LinkedList<>();

		int fresh = 0;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 2)
					queue.offer(new int[]{i, j});

				else if (grid[i][j] == 1)
					fresh++;
			}
		}

		if (fresh == 0)
			return 0;

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		int minutes = 0;

		while (!queue.isEmpty() && fresh > 0) {

			int size = queue.size();

			for (int k = 0; k < size; k++) {

				int[] curr = queue.poll();

				for (int[] d : dir) {

					int r = curr[0] + d[0];
					int c = curr[1] + d[1];

					if (r >= 0 &&
							c >= 0 &&
							r < grid.length &&
							c < grid[0].length &&
							grid[r][c] == 1) {

						grid[r][c] = 2;

						fresh--;

						queue.offer(new int[]{r, c});
					}
				}
			}

			minutes++;
		}

		return fresh == 0 ? minutes : -1;
	}
}





// BFS Using Direction Arrays
class Solution {

	int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};

	public int orangesRotting(int[][] grid) {

		Queue<int[]> q = new LinkedList<>();

		int fresh = 0;

		for(int i=0;i<grid.length;i++){

			for(int j=0;j<grid[0].length;j++){

				if(grid[i][j]==2)
					q.offer(new int[]{i,j});

				else if(grid[i][j]==1)
					fresh++;
			}
		}

		int time=0;

		while(!q.isEmpty() && fresh>0){

			int size=q.size();

			while(size-->0){

				int[] cell=q.poll();

				for(int[] d:dir){

					int nr=cell[0]+d[0];
					int nc=cell[1]+d[1];

					if(nr>=0 && nc>=0 &&
							nr<grid.length &&
							nc<grid[0].length &&
							grid[nr][nc]==1){

						grid[nr][nc]=2;

						fresh--;

						q.offer(new int[]{nr,nc});
					}
				}
			}

			time++;
		}

		return fresh==0 ? time : -1;
	}
}






///
