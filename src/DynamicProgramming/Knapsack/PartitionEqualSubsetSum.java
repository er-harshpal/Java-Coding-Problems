//package DynamicProgramming.Knapsack;
//
//public class PartitionEqualSubsetSum {
//		public boolean canPartition(int[] nums) {
//
//			int sum = 0;
//
//			for (int num : nums)
//				sum += num;
//
//			// Odd sum cannot be partitioned equally
//			if (sum % 2 != 0)
//				return false;
//
//			return solve(0, sum / 2, nums);
//		}
//
//		private boolean solve(int index, int target, int[] nums) {
//
//			// Found required subset
//			if (target == 0)
//				return true;
//
//			// No elements left
//			if (index == nums.length)
//				return false;
//
//			boolean take = false;
//
//			if (nums[index] <= target)
//				take = solve(index + 1, target - nums[index], nums);
//
//			boolean skip = solve(index + 1, target, nums);
//
//			return take || skip;
//		}
//	}
//
