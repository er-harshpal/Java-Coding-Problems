//// Recursive Approach
//class HouseRobber {
//	public int robber(int[] nums){
//		return robFrom(nums, nums.length -1);
//	}
//
//	private int robFrom (int[] nums, int i ){
//		if(i < 0) return 0;
//		if ( i == 0) return nums[0];
//
//		// Either skip house i, or rob it and skip hosue i - 1
//		return Math.max(robFrom(nums, i - 1), nums[i] + robFrom(nums, i - 2));
//	}
//}






//// Memoization ( Top Down Approach )
//import java.lang.reflect.Array;
//import java.sql.Array;
//public class HouseRObber{
//	public int[] memo;
//
//	public int robFrom(int[] n) {
//		int memo[] = new int[n.length];
//		Array.fill(memo ,-1);
//		return robFrom(n, n.length-1);
//	}
//
//	private int robFrom(int[] n,int i){
//		if(i<0) return 0;
//		if(i==0) return n[0];
//		if(memo[i] != -1) return memo[i];
//
//		// Cache the result: max of skipping or robbing house i
//		memo[i] = Math.max(robFrom(n, i-1), n[i] + robFrom(n, i-2));
//		return memo[i];
//	}
//}










//
//// Tabulation Bottom Up Approach
//class HouseRobber {
//	public int rob(int[] nums){
//		int n = nums.length;
//		if(n==1) return nums[0];
//
//		int[] dp = new int[n];
//		dp[0] = nums[0];
//		dp[1] = Math.max(nums[0], nums[1]);
//
//		for(int i=2; i < n; i++){
//			// Either Skip house i or rob it
//			dp[i] = Math.max(dp[i-1],nums[i] + dp[i-2]);
//		}
//		return dp[n-1];
//	}
//}
//
//









////Space Optimised DP
//class HouseRobber {
//	public int rob(int[] nums){
//		int n = nums.length;
//		if( n == 1) return nums[0];
//
//		int prev2 = nums[0];
//		int prev1 = Math.max(nums[0], nums[1]);
//		for (int i = 2; i < n; i++){
//			int current = Math.max(prev1, nums[i] + prev2);
//			prev2 = prev1;
//			prev1 = current;
//		}
//		return prev1;
//	}
//}