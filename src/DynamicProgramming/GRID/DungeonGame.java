//package DynamicProgramming.GRID;
//
//public class DungeonGame {
//	public static void main(String[] args) {
//		int[][] dungeon = {
//				{-2, -3, 3},
//				{-5, -10, 1},
//				{10, 30, -5}
//		};
//
//		System.out.println(calculateMinimumHP(dungeon));
//	}
//
//	public static int calculateMinimumHP(int[][] dungeon){
//		int m = dungeon.length;
//		int n = dungeon[0].length;
//		return solve(0, 0, dungeon, m, n);
//	}
//	/// THIS IS THE RESURSIVE APPROACH
//	public int[] solve(int row, int col, int[][] dungeon, int m, int n){
//		// out of bounds
//		if(row>= m || col >= n){
//			return Integer.MAX_VALUE;
//		}
//
//		// Princess cell
//		if(row >= m-1 && col == n-1) {
//			return Math.max(1, 1- dungeon[row][col]);
//		}
//
//		int down = solve(row + 1, col, dungeon, m, n);
//		int right = solve(row, col + 1, dungeon, m, n);
//
//		int need = Math.min(down, right);
//
//		return Math.max(1, need - dungeon[row][col]);
//	}
//
//}
