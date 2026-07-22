//package DynamicProgramming.Knapsack;
//
//public class CoinChange2 {
//	class Solution {
//
//		public int change(int amount, int[] coins) {
//			return solve(0, amount, coins);
//		}
//
//		private int solve(int index, int amount, int[] coins) {
//
//			// One valid combination found
//			if (amount == 0)
//				return 1;
//
//			// No coin types left
//			if (index == coins.length)
//				return 0;
//
//			int take = 0;
//
//			if (coins[index] <= amount)
//				take = solve(index, amount - coins[index], coins);
//
//			int skip = solve(index + 1, amount, coins);
//
//			return take + skip;
//		}
//	}
//
//}
