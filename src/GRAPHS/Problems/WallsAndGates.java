package GRAPHS.Problems;

// Optimal Multisource BFS
import java.util.*;

class Solution {

	public void wallsAndGates(int[][] rooms) {

		Queue<int[]> queue = new LinkedList<>();

		int rows = rooms.length;
		int cols = rooms[0].length;

		// Put every gate into queue
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (rooms[i][j] == 0) {

					queue.offer(new int[]{i, j});

				}
			}
		}

		int[][] dir = {
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while (!queue.isEmpty()) {

			int[] curr = queue.poll();

			int r = curr[0];
			int c = curr[1];

			for (int[] d : dir) {

				int nr = r + d[0];
				int nc = c + d[1];

				if (nr >= 0 &&
						nc >= 0 &&
						nr < rows &&
						nc < cols &&
						rooms[nr][nc] == Integer.MAX_VALUE) {

					rooms[nr][nc] = rooms[r][c] + 1;

					queue.offer(new int[]{nr, nc});
				}
			}
		}
	}
}





// Level Order

import java.util.*;

class Solution {

	public void wallsAndGates(int[][] rooms) {

		Queue<int[]> q = new LinkedList<>();

		int rows = rooms.length;
		int cols = rooms[0].length;

		for(int i=0;i<rows;i++){

			for(int j=0;j<cols;j++){

				if(rooms[i][j]==0){

					q.offer(new int[]{i,j});

				}
			}
		}

		int[][] dir={
				{-1,0},
				{1,0},
				{0,-1},
				{0,1}
		};

		while(!q.isEmpty()){

			int size=q.size();

			while(size-->0){

				int[] cur=q.poll();

				for(int[] d:dir){

					int nr=cur[0]+d[0];
					int nc=cur[1]+d[1];

					if(nr>=0 &&
							nc>=0 &&
							nr<rows &&
							nc<cols &&
							rooms[nr][nc]==Integer.MAX_VALUE){

						rooms[nr][nc]=rooms[cur[0]][cur[1]]+1;

						q.offer(new int[]{nr,nc});
					}
				}
			}
		}
	}
}




