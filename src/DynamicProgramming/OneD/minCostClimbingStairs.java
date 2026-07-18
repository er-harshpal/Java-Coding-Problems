////package DynamicProgramming.1D;
////
////public class MinCostClimbingStairs {
////	public int minCostClimbingStairs(int [] cost){
////		return Math.min(minCost(cost, 0), minCost(cost 1));
////	}
////	public int minCost(int[] cost, int i){
////		// Base Case
////		if(i >= cost.length) return 0;
////		// Pay current step cost, then take the cheaper of one or two steps
////		return cost[i] + Math.min(minCost(cost, i + 1), minCost(cost, i +2));
////	}
////}
//
//
//
//
//// Memoization Approach
//class minCostClimbingStairs {
//	private int[] memo;
//
//	public int minCostClimbingStairs(int[] cost){
//		memo = new int[cost.length];
//		Array.fill(memo, -1);
//		return Math.min(minCost(cost, 0), minCost(cost, 1));
//	}
//
//	private int minCost(int[] cost, int i){
//		if( i >= cost.length) return 0;
//		if(memo[i] != -1) return memo[i];
//		// Compute and cache the result
//		memo[i] = cost[i] + Math.min(minCost(cost, i +1), minCost(cost, i + 2 ));
//		return memo[i];
//	}
//}
//
//
//
//
//
//
//
//
//// Tabulation with Space Optimization
//class minCostClimbing {
//	public int minCostClimbingStairs(int[] cost) {
//		int n = cost.length;
//		// prev2 = min cost to reach two steps back, prev1 = min cost to reach one step back
//		int prev2 = 0, prev1 = 0;
//		for(int i = 2; i <= n; i++){
//			int current = Math.min(prev1 + cost[i-1], prev2 + cost[i-2]);
//			prev2 = prev1;
//			prev1 = current;
//		}
//		return prev1;
//	}
//}