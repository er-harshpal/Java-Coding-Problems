//package DynamicProgramming.GRID;
//
//public class MinimumPathSum {
//
//		public int minPathSum(int[][] grid) {
//
//			int m = grid.length;
//			int n = grid[0].length;
//
//			return solve(0, 0, grid, m, n);
//		}
//
//		private int solve(int row, int col, int[][] grid, int m, int n) {
//
//			// Reached destination
//			if (row == m - 1 && col == n - 1) {
//				return grid[row][col];
//			}
//
//			// Out of bounds
//			if (row >= m || col >= n) {
//				return Integer.MAX_VALUE;
//			}
//
//			// Move Down
//			int down = solve(row + 1, col, grid, m, n);
//
//			// Move Right
//			int right = solve(row, col + 1, grid, m, n);
//
//			return grid[row][col] + Math.min(down, right);
//		}
//	}
