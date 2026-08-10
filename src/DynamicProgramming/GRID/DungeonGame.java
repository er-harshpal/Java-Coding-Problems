////package DynamicProgramming.GRID;
////import java.util.*;
////public class DungeonGame {
////	public static void main(String[] args) {
////		int[][] dungeon = {
////				{-2, -3, 3},
////				{-5, -10, 1},
////				{10, 30, -5}
////		};
////		System.out.println(calculateMinimumHP(dungeon));
////	}
////
////	public static int calculateMinimumHP(int[][] dungeon){
////		int m = dungeon.length;
////		int n = dungeon[0].length;
////		return solve(0, 0, dungeon, m, n);
////	}
////	/// THIS IS THE RESURSIVE APPROACH
////	public static int[] solve(int row, int col, int[][] dungeon, int m, int n){
////		// out of bounds
////		if(row>= m || col >= n){
////			return Integer.MAX_VALUE;
////		}
////
////		// Princess cell
////		if(row >= m-1 && col == n-1) {
////			return Math.max(1, 1- dungeon[row][col]);
////		}
////
////		int down = solve(row + 1, col, dungeon, m, n);
////		int right = solve(row, col + 1, dungeon, m, n);
////
////		int need = Math.min(down, right);
////
////		return Math.max(1, need - dungeon[row][col]);
////	}
////}
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
//package DynamicProgramming.GRID;
//import java.util.*;
//public class DungeonGame {
//	public int calculateMinimumHP(int[][] dungeon){
//		// Get dimensions of the dungeons
//		int rows = dungeon.length;
//		int cols = dungeon[0].length;
//
//		// Create DP table with extra row and column for boudar5y conditions
//		// dp[i][j] represents minimum health needed to reach bottom right from positive
//		int[][] dp = new int[rows + 1][cols + 1];
//
//		// Initialiize all cells with a large value (acts as infinity)
//		for(int[] row : dp){
//			Arrays.fill(row, Integer.MAX_VALUE);
//		}
//
//		// base case:
//		// knight needs at least
//		dp[rows][cols - 1] = 1;
//		dp[rows - 1][cols] = 1;
//
//		for (int i = rows - 1; i >= 0; i--){
//			for ( int j = cols - 1; j >= 0; j--){
//				int minHealthFromNext = Math.min(dp[i+1][j], dp[i][j+1]);
//
//				dp[i][j] = Math.max(1, minHealthFromNext - dungeon[i][j]);
//			}
//		}
//		return dp[0][0];
//	}
//  }