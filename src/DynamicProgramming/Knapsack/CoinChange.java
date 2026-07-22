package DynamicProgramming.Knapsack;
//
//public class CoinChange {
//		public int coinChange(int[] coins, int amount) {
//
//			int ans = solve(0, amount, coins);
//
//			return ans == Integer.MAX_VALUE ? -1 : ans;
//		}
//
//		private int solve(int index, int amount, int[] coins) {
//
//			// Successfully formed the amount
//			if (amount == 0)
//				return 0;
//
//			// No coin types left
//			if (index == coins.length)
//				return Integer.MAX_VALUE;
//
//			int take = Integer.MAX_VALUE;
//
//			if (coins[index] <= amount) {
//				int res = solve(index, amount - coins[index], coins);
//
//				if (res != Integer.MAX_VALUE)
//					take = 1 + res;
//			}
//
//			int skip = solve(index + 1, amount, coins);
//
//			return Math.min(take, skip);
//		}
//	}
//}
//
