package GRAPHS.Problems;

// Modified Dijkstra
import java.util.*;

class Solution {

	int[][] dir = {
			{-1,0},
			{1,0},
			{0,-1},
			{0,1}
	};

	public int minimumEffortPath(int[][] heights) {

		int rows = heights.length;
		int cols = heights[0].length;

		int[][] effort = new int[rows][cols];

		for (int[] row : effort)
			Arrays.fill(row, Integer.MAX_VALUE);

		PriorityQueue<int[]> pq =
				new PriorityQueue<>((a,b)->a[0]-b[0]);

		pq.offer(new int[]{0,0,0});

		effort[0][0]=0;

		while(!pq.isEmpty()){

			int[] cur = pq.poll();

			int currEffort = cur[0];
			int r = cur[1];
			int c = cur[2];

			if(r==rows-1 && c==cols-1)
				return currEffort;

			if(currEffort>effort[r][c])
				continue;

			for(int[] d:dir){

				int nr=r+d[0];
				int nc=c+d[1];

				if(nr>=0 &&
						nc>=0 &&
						nr<rows &&
						nc<cols){

					int edge =
							Math.abs(
									heights[r][c]-
											heights[nr][nc]);

					int newEffort =
							Math.max(currEffort,edge);

					if(newEffort<effort[nr][nc]){

						effort[nr][nc]=newEffort;

						pq.offer(
								new int[]{
										newEffort,
										nr,
										nc
								});

					}

				}

			}

		}

		return 0;
	}
}






