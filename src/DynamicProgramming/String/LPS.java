//package DynamicProgramming.String;
//
//public class LPS {
//
//		public int longestPalindromeSubseq(String s) {
//			return solve(0, s.length() - 1, s);
//		}
//
//		private int solve(int left, int right, String s) {
//
//			// No characters
//			if (left > right) {
//				return 0;
//			}
//
//			// One character
//			if (left == right) {
//				return 1;
//			}
//
//			// Characters match
//			if (s.charAt(left) == s.charAt(right)) {
//				return 2 + solve(left + 1, right - 1, s);
//			}
//
//			// Characters don't match
//			return Math.max(
//					solve(left + 1, right, s),
//					solve(left, right - 1, s)
//			);
//		}
//	}
