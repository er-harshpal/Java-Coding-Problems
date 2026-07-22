//package DynamicProgramming.String;
//
//public class DistinctSubsequencw {
//
//		public int numDistinct(String s, String t) {
//			return solve(0, 0, s, t);
//		}
//
//		private int solve(int i, int j, String s, String t) {
//
//			// Matched entire target
//			if (j == t.length()) {
//				return 1;
//			}
//
//			// Source exhausted
//			if (i == s.length()) {
//				return 0;
//			}
//
//			// Characters match
//			if (s.charAt(i) == t.charAt(j)) {
//				return solve(i + 1, j + 1, s, t)
//						+ solve(i + 1, j, s, t);
//			}
//
//			// Characters don't match
//			return solve(i + 1, j, s, t);
//		}
//	}
//
