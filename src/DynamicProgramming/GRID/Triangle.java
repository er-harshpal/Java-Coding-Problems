//package DynamicProgramming.GRID;
//
//public class Triangle {
//	class Solution {
//
//		public int minimumTotal(List<List<Integer>> triangle) {
//			return solve(0, 0, triangle);
//		}
//
//		private int solve(int row, int col, List<List<Integer>> triangle) {
//
//			// Base Case: Last row
//			if (row == triangle.size() - 1) {
//				return triangle.get(row).get(col);
//			}
//
//			// Move Down
//			int down = solve(row + 1, col, triangle);
//
//			// Move Diagonal
//			int diagonal = solve(row + 1, col + 1, triangle);
//
//			return triangle.get(row).get(col) + Math.min(down, diagonal);
//		}
//	}
//}
