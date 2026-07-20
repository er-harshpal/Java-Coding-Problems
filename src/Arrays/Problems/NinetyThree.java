//import java.util.*;
//
//public class NinetyThree {
//
//	public static void main(String[] args) {
//
//		int[][] intervals = {
//				{1, 2},
//				{3, 5},
//				{6, 7},
//				{8, 10},
//				{12, 16}
//		};
//
//		int[] newInterval = {4, 8};
//
//		int[][] result = insert(intervals, newInterval);
//
//		for (int[] interval : result) {
//			System.out.println(Arrays.toString(interval));
//		}
//	}
//
//	public static int[][] insert(int[][] intervals, int[] newInterval) {
//
//		List<int[]> ans = new ArrayList<>();
//
//		int i = 0;
//
//		// Step 1: Add all intervals before newInterval
//		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
//			ans.add(intervals[i]);
//			i++;
//		}
//
//		// Step 2: Merge overlapping intervals
//		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
//
//			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
//			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
//
//			i++;
//		}
//
//		// Step 3: Add the merged interval
//		ans.add(newInterval);
//
//		// Step 4: Add the remaining intervals
//		while (i < intervals.length) {
//			ans.add(intervals[i]);
//			i++;
//		}
//
//		return ans.toArray(new int[ans.size()][]);
//	}
//}