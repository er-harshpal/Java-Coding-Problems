///// Missing Ranges
///// Problem Statement
///// You are given a sorted integer array nums,
///// where all elements are unique,
///// and two integers lower and upper representing
///// the inclusive range [lower, upper].
//
//package Arrays.Problems;
//import java.util.*;
//import java.lang.*;
//
//public class NinetyFourth {
//	public static void main(String[] args){
//		int[] nums = {2,4,8,9,11,12};
//		int upper = 4;
//		int lower = 1;
//		String[] arr = new String[nums.length-1];
//		System.out.println(missingRange(nums, upper, lower,arr));
//	}
//	public static int[] missingRange(int[] nums,int upper, int lower, String[] arr){
//		for(int i=lower; i<upper; i++){
//			if(nums[i+1]-nums[i]==1){
//				arr[i] = String.valueOf(nums[i]+1);
//			}
//			if(nums[i+1]-nums[i]>1){
//				arr[i] = String.valueOf(nums[i+1]-nums[i]);
//			}
//		}
//		for(int i=0; i<arr.length; i++){
//			if(arr[i].length() > 1){
//				arr[i] = (arr[i-1]+1) + (arr[i]-1);
//			}
//		}
//		return arr[];
//	}
//
//}
//
//
//
//
//
//
//
//
//////Optimal Approach
//import java.util.*;
//
//class Solution {
//
//	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
//
//		List<String> ans = new ArrayList<>();
//
//		// Before the first element
//		if (nums.length == 0) {
//			ans.add(formatRange(lower, upper));
//			return ans;
//		}
//
//		if (lower < nums[0]) {
//			ans.add(formatRange(lower, nums[0] - 1));
//		}
//
//		// Between consecutive elements
//		for (int i = 0; i < nums.length - 1; i++) {
//
//			if (nums[i + 1] - nums[i] == 2) {
//				ans.add(String.valueOf(nums[i] + 1));
//			}
//			else if (nums[i + 1] - nums[i] > 2) {
//				ans.add(formatRange(nums[i] + 1, nums[i + 1] - 1));
//			}
//		}
//
//		// After the last element
//		if (nums[nums.length - 1] < upper) {
//			ans.add(formatRange(nums[nums.length - 1] + 1, upper));
//		}
//
//		return ans;
//	}
//
//	private String formatRange(int start, int end) {
//
//		if (start == end) {
//			return String.valueOf(start);
//		}
//
//		return start + "->" + end;
//	}
//}