/////  Largest Number - Given array of no negative numbers nums
///// arrange the sum so that they form the largest possible number
//import java.util.*;
//
//class NinetyFifth{
//	public static void main(String[] args){
// 		int nums[] = {2,68,65,9,85241,9697,123,9,79,64569,};
//		 NinetyFifth n = new NinetyFifth();
//		 System.out.println(n.largestNumber(nums));
//	}
//
//	public static String largestNumber(int[] nums) {
//
//		// Convert integers to strings
//		String[] arr = new String[nums.length];
//
//		for (int i = 0; i < nums.length; i++) {
//			arr[i] = String.valueOf(nums[i]);
//		}
//
//		// Custom sorting
//		Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
//
//		// If the largest element is "0", then all elements are 0
//		if (arr[0].equals("0")) {
//			return "0";
//		}
//
//		// Build the answer
//		StringBuilder ans = new StringBuilder();
//
//		for (String s : arr) {
//			ans.append(s);
//		}
//
//		return ans.toString();
//	}
//}