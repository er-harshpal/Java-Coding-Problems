//package DynamicProgramming.STRING;
//
//public class EditDistance {
//		public static int minDistance(String word1, String word2) {
//			//return solve(word1, word2, word1.length(), word2.length());
//			return solve(word1, word2, word1.length(), word2.length());
//		}
//
//		public static int solve(String word1, String word2, int i, int j) {
//		// public static int solve(String word1, String word2, int i, int j) {
//			// Base case: one string is empty
//			//if(i==0) return j;
//			//if(j==0) return i;
//			if (i == 0) return j;
//			if (j == 0) return i;
//
//			// Characters match, no edit needed
//			if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//			//if (word1.charAt(i - 1) == word2.charAt(j-1)) {
//				return solve(word1, word2, i - 1, j - 1);
//			}
//
//
//			// Try all three operations and take the minimum
//			int deleteCost = solve(word1, word2, i - 1, j);
//			int insertCost = solve(word1, word2, i, j - 1);
//			int replaceCost = solve(word1, word2, i - 1, j - 1);
//
//			return 1 + Math.min(deleteCost, Math.min(insertCost, replaceCost));
//		}
//
//	public static void main(String[] args){
//			String word1 = "Harsh";
//			String word2 = "Hsrah";
//			System.out.println(minDistance(word1, word2));
//	}
//}
