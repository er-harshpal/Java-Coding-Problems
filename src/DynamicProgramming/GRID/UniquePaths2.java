//package DynamicProgramming.GRID;
//
//
//
/////// Recursive Approach
////public class UniquePaths2 {
////
////		public int uniquePathsWithObstacles(int[][] obstacleGrid) {
////
////			int m = obstacleGrid.length;
////			int n = obstacleGrid[0].length;
////
////			return solve(0, 0, obstacleGrid, m, n);
////		}
////
////		private int solve(int row, int col, int[][] grid, int m, int n) {
////
////			// Out of bounds
////			if (row >= m || col >= n) {
////				return 0;
////			}
////
////			// Obstacle found
////			if (grid[row][col] == 1) {
////				return 0;
////			}
////
////			// Reached destination
////			if (row == m - 1 && col == n - 1) {
////				return 1;
////			}
////
////			// Move Down
////			int down = solve(row + 1, col, grid, m, n);
////
////			// Move Right
////			int right = solve(row, col + 1, grid, m, n);
////
////			return down + right;
////		}
////	}
//
//
//
//
//
//
//
//







//
///// Memoization
//class Solution {
//
//	private int[][] dp;
//
//	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//
//		int m = obstacleGrid.length;
//		int n = obstacleGrid[0].length;
//
//		dp = new int[m][n];
//
//		for (int i = 0; i < m; i++) {
//			Arrays.fill(dp[i], -1);
//		}
//
//		return solve(0, 0, obstacleGrid);
//	}
//
//	private int solve(int row, int col, int[][] grid) {
//
//		int m = grid.length;
//		int n = grid[0].length;
//
//		if (row >= m || col >= n)
//			return 0;
//
//		if (grid[row][col] == 1)
//			return 0;
//
//		if (row == m - 1 && col == n - 1)
//			return 1;
//
//		if (dp[row][col] != -1)
//			return dp[row][col];
//
//		int down = solve(row + 1, col, grid);
//		int right = solve(row, col + 1, grid);
//
//		dp[row][col] = down + right;
//
//		return dp[row][col];
//	}
//}
//
//
//
//
//
//
//
//







//
//
//
//
//
///// Tabulation
//class Solution {
//
//	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//
//		int m = obstacleGrid.length;
//		int n = obstacleGrid[0].length;
//
//		int[][] dp = new int[m][n];
//
//		if (obstacleGrid[0][0] == 1)
//			return 0;
//
//		dp[0][0] = 1;
//
//		for (int i = 0; i < m; i++) {
//
//			for (int j = 0; j < n; j++) {
//
//				if (obstacleGrid[i][j] == 1) {
//					dp[i][j] = 0;
//					continue;
//				}
//
//				if (i == 0 && j == 0)
//					continue;
//
//				int up = 0;
//				int left = 0;
//
//				if (i > 0)
//					up = dp[i - 1][j];
//
//				if (j > 0)
//					left = dp[i][j - 1];
//
//				dp[i][j] = up + left;
//			}
//		}
//
//		return dp[m - 1][n - 1];
//	}
//}
//
//
//
//
//
//





//
//
//
//
//
///// Space optimization
//class Solution {
//
//	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//
//		int m = obstacleGrid.length;
//		int n = obstacleGrid[0].length;
//
//		int[] dp = new int[n];
//
//		dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
//
//		for (int i = 0; i < m; i++) {
//
//			for (int j = 0; j < n; j++) {
//
//				if (obstacleGrid[i][j] == 1) {
//					dp[j] = 0;
//				} else if (j > 0) {
//					dp[j] += dp[j - 1];
//				}
//			}
//		}
//
//		return dp[n - 1];
//	}
//}