//package DynamicProgramming;
//
//import java.util.*;
////// Brute Force
////public class KadaneAlgorithm {
////	public static void main(String[] args){
////		int[] nums = {5,4,-1,7,8};
////		System.out.println(answer(nums));
////	}
////	public static int answer(int[] nums){
////		int maxSum = Integer.MIN_VALUE;
////
////		for(int i=0; i<nums.length; i++){
////			int sum = 0;
////			for(int j = i; j<nums.length; j++){
////				sum = sum + nums[j];
////				maxSum = Math.max(maxSum, sum);
////			}
////		}
////		return maxSum;
////	}
////}
















/////// Recursive Approach
////public class KadaneAlgorithm {
////	public static void main(String[] args){
////		int[] nums = {5,4,-1,7,8};
////	}
////	class Solution {
////
////		int[] nums;
////		int answer = Integer.MIN_VALUE;
////
////		public int maxSubArray(int[] nums) {
////			this.nums = nums;
////
////			solve(nums.length - 1);
////
////			return answer;
////		}
////
////		private int solve(int i) {
////
////			if (i == 0) {
////				answer = Math.max(answer, nums[0]);
////				return nums[0];
////			}
////
////			int endingHere = Math.max(nums[i], nums[i] + solve(i - 1));
////
////			answer = Math.max(answer, endingHere);
////
////			return endingHere;
////		}
////	}
////}













/////// Memoization
////public class KadaneAlgorithm {
////	public static void main(String[] args){
////		int[] nums = {5,4,-1,7,8};
////	}
////	class Solution {
////
////		int[] memo;
////		int[] nums;
////		int answer = Integer.MIN_VALUE;
////
////		public int maxSubArray(int[] nums) {
////
////			this.nums = nums;
////			memo = new int[nums.length];
////
////			Arrays.fill(memo, Integer.MIN_VALUE);
////
////			solve(nums.length - 1);
////
////			return answer;
////		}
////
////		private int solve(int i) {
////
////			if (i == 0)
////				return nums[0];
////
////			if (memo[i] != Integer.MIN_VALUE)
////				return memo[i];
////
////			memo[i] = Math.max(nums[i], nums[i] + solve(i - 1));
////
////			answer = Math.max(answer, memo[i]);
////
////			return memo[i];
////		}
////	}
////}









/////  Tabulation
//public class KadaneAlgorithm {
//	public static void main(String[] args){
//		int[] nums = {5,4,-1,7,8};
//	}
//	class Solution {
//
//		public int maxSubArray(int[] nums) {
//
//			int n = nums.length;
//
//			int[] dp = new int[n];
//
//			dp[0] = nums[0];
//
//			int answer = dp[0];
//
//			for (int i = 1; i < n; i++) {
//
//				dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
//
//				answer = Math.max(answer, dp[i]);
//			}
//
//			return answer;
//		}
//	}
//}






///// Space Optimazation
//class Solution {
//
//	public int maxSubArray(int[] nums) {
//
//		int previous = nums[0];
//		int answer = nums[0];
//
//		for (int i = 1; i < nums.length; i++) {
//
//			int current = Math.max(nums[i], nums[i] + previous);
//
//			answer = Math.max(answer, current);
//
//			previous = current;
//		}
//
//		return answer;
//	}
//}