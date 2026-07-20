////// Shortest Unsorted Continuous Subarray
//package Arrays.Problems;
//import java.util.*;
//
//public class NinetySeventh {
//
//     /// This is my approach
//     //	public static void main(String[] args){
////		int nums[] = {2,6,4,8,10,9,15};
////		int n = nums.length;
////		int[] newArray = new int[nums.length];
////		int[] arr = new int[nums.length];
////		System.out.println(shortestUnsorted(nums, newArray, arr));
////	}
////	public static int shortestUnsorted(int[] nums, int[] newArray, int[] arr){
////
////		System.arraycopy(nums, 0, newArray, 0, nums.length);
////		Arrays.sort(newArray);
////		int j = 0;
////		for(int i=0; i<nums.length; i++){
////
////			if(nums[i]!=newArray[i]){
////				arr[j] = i;
////				j++;
////			}
////		}
////		if ( j==0 ){
////			return 0;
////		}
////		return max(arr) - min(arr) +1;
////
////	}
////	public static int min(int[] arr) {
////		int min = Integer.MAX_VALUE;
////		for (int i = 0; i < arr.length; i++) {
////
////			if (arr[i] != 0 && arr[i] < min) {
////				min = arr[i];
////			}
////		} return min;
////	}
////	public static int max(int[] arr){
////		int max = Integer.MIN_VALUE;
////		for(int i=0; i<arr.length; i++){
////			if(arr[i]>max){
////					max = arr[i];
////			}
////		} return max;
////	}
//
//	 ///  This is AI Approach
//     //	public static void main(String[] args) {
////		int[] nums = {2,6,4,8,10,9,15};
////		System.out.println(shortestUnsorted(nums));
////	}
////	public static int shortestUnsorted(int[] nums) {
////
////		int[] newArray = nums.clone();
////		Arrays.sort(newArray);
////		int first = -1;
////		int last = -1;
////		for (int i = 0; i < nums.length; i++) {
////			if (nums[i] != newArray[i]) {
////				if (first == -1) {
////					first = i;
////				}
////				last = i;
////			}
////		}
////
////		if (first == -1) {
////			return 0;
////		}
////
////		return last - first + 1;
////	}
//
//}
//
