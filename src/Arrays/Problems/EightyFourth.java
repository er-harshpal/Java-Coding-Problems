//package Arrays.Problems;
//
//import java.util.*;
//
//public class EightyFourth {
//
//	public static void main(String[] args) {
//		int[][] nums = {
//				{1,3},{2,6},{8,10},{15,18}
//		};
//
//		int[][] result = mergeIntervals(nums);
//
//		for (int[] interval : result) {
//			System.out.println(Arrays.toString(interval));
//		}
//	}
//
//	public static int[][] mergeIntervals(int[][] nums) {
//
//		if (nums == null || nums.length == 0) {
//			return new int[0][0];
//		}
//
//		Arrays.sort(nums, (a, b) -> a[0] - b[0]);
//
//		List<int[]> ans = new ArrayList<>();
//
//		int[] current = nums[0];
//
//		for (int i = 1; i < nums.length; i++) {
//
//			if (current[1] >= nums[i][0]) {
//				current[1] = Math.max(current[1], nums[i][1]);
//			} else {
//				ans.add(current);
//				current = nums[i];
//			}
//		}
//
//		ans.add(current);
//
//		return ans.toArray(new int[ans.size()][]);
//	}
//}