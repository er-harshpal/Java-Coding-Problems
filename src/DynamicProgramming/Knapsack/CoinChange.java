package DynamicProgramming.Knapsack;

public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}
	public static void main(String[] arpublic class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}public class CoinChange {
		public static int coinChange(int[] coins, int amount) {

			int ans = solve(0, amount, coins);

			return ans == Integer.MAX_VALUE ? -1 : ans;
		}

		private static int solve(int index, int amount, int[] coins) {

			// Successfully formed the amount
			if (amount == 0)
				return 0;

			// No coin types left
			if (index == coins.length)
				return Integer.MAX_VALUE;

			int take = Integer.MAX_VALUE;

			if (coins[index] <= amount) {
				int res = solve(index, amount - coins[index], coins);

				if (res != Integer.MAX_VALUE)
					take = 1 + res;
			}

			int skip = solve(index + 1, amount, coins);

			return Math.min(take, skip);
		}

		public static void main(String[] args) {
			int index = 0;
			int amount = 15;
			int[] coins = {1, 4, 6, 8};
			System.out.println(coinChange(coins, amount));
		}
	}gs){
		int index = 0;
		int amount = 15;
		int[] coins = {1,4,6,8};
		System.out.println(coinChange(coins, amount));
	}