//package Arrays.Problems;
//
//public class NinetyEighth {
//
//	public static void main(String[] args) {
//		int[] nums = {1};
//		System.out.println(minMaxSum(nums));
//	}
//
//	public static int minMaxSum(int[] nums) {
//		if(nums.length == 0){
//			return 0;
//		}
//		int maximum = Integer.MIN_VALUE;
//		int minimum = Integer.MAX_VALUE;
//		int sum = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > maximum) {
//				maximum = nums[i];
//			}if (nums[i] < minimum) {
//				minimum = nums[i];
//			}
//			sum = sum + nums[i];
//		}
//		int expectedSum = 0;
//
//		for (int i = minimum; i <= maximum; i++) {
//			expectedSum = expectedSum  + i;
//		}
//		int zer = expectedSum - sum;
//		if(zer == 0){
//			if(minimum - 1 != 0){
//				return 1;
//			} else{
//				zer = maximum + 1;
//			}
//		}
//		return zer;
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
//
//
//
//
//
//
//
//
//
//
//
//
//
//
