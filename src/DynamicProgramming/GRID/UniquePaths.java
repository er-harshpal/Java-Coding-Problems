package DynamicProgramming.GRID;


/////  Recursive Code for this problem
//public class UniquePaths {
//
//	public int uniquePaths(int m, int n){
//		return solve(0, 0, m, n);
//	}
//
//	private int solve(int row, int col, int m, int n){
//		// Reached Destination
//		if(row == m - 1 && col == n - 1){
//			return 1;
//		}
//
//		// Out of bounds
//		if(row >= m || col >= n){
//			return 0;
//		}
//
//		// Move Down
//		int down = solve(row + 1, col, m, n);
//
//		// Move Right
//		int right = solve(row, col + 1, m, n);
//
//		// Total Paths
//		return down + right;
//	}
//}













///// Memoization
//class Solution:
//def uniquePaths(self, m: int, n: int) -> int:
//memo = {}
//
//def dfs(i, j):
//		# Base cases
//            if i < 0 or j < 0:
//		return 0
//		if i == 0 and j == 0:
//		return 1
//		if (i, j) in memo:
//		return memo[(i, j)]
//
//		# Recursive step: sum of paths from up and left
//memo[(i, j)] = dfs(i - 1, j) + dfs(i, j - 1)
//            return memo[(i, j)]
//
//		return dfs(m - 1, n - 1)


















///// Tabulation
//class Solution {
//	public int uniquePaths(int m, int n) {
//		// 2D DP array to store the number of unique paths to each cell
//		int[][] dp = new int[m][n];
//
//		// Base Case: Initialize the first row and first column to 1
//		// There is only one way to reach any cell in the first row (move right)
//		// or first column (move down)
//		for (int i = 0; i < m; i++) {
//			dp[i][0] = 1;
//		}
//		for (int j = 0; j < n; j++) {
//			dp[0][j] = 1;
//		}
//
//		// Fill the rest of the table using the recurrence relation
//		for (int i = 1; i < m; i++) {
//			for (int j = 1; j < n; j++) {
//				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//			}
//		}
//
//		// The bottom-right cell contains the total number of unique paths
//		return dp[m - 1][n - 1];
//	}
//}













///// Space Optimization
//class Solution {
//	public int uniquePaths(int m, int n) {
//		// dp array of size n to store the number of paths to each column in the current row
//		int[] dp = new int[n];
//
//		// Initialize the first row: there is only 1 way to reach any cell in the first row
//		for (int j = 0; j < n; j++) {
//			dp[j] = 1;
//		}
//
//		// Iterate through the remaining rows
//		for (int i = 1; i < m; i++) {
//			// Update dp array for the current row
//			for (int j = 1; j < n; j++) {
//				// dp[j] (before update) holds paths from the cell above (previous row)
//				// dp[j-1] holds paths from the cell to the left (current row, already updated)
//				dp[j] += dp[j - 1];
//			}
//		}
//
//		// The last element contains the number of unique paths to the bottom-right cell
//		return dp[n - 1];
//	}
//}