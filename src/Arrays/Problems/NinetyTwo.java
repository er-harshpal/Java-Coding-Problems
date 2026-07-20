///// This problem is essentially Insert
///// Interval without a given newInterval.
//import java.util.*;
//
//public class NinetyTwo {
//
//	public static int[][] merge(int[][] intervals) {
//
//		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//
//		List<int[]> ans = new ArrayList<>();
//
//		for (int i = 0; i < intervals.length; i++) {
//
//			int start = intervals[i][0];
//			int end = intervals[i][1];
//
//			for (int j = i + 1; j < intervals.length; j++) {
//
//				if (intervals[j][0] <= end) {
//					end = Math.max(end, intervals[j][1]);
//					i = j;                  // Skip merged intervals
//				} else {
//					break;
//				}
//			}
//
//			ans.add(new int[]{start, end});
//		}
//
//		return ans.toArray(new int[ans.size()][]);
//	}
//
//	public static void main(String[] args) {
//
//		int[][] intervals = {
//				{1,3},
//				{2,6},
//				{8,10},
//				{15,18}
//		};
//
//		int[][] ans = merge(intervals);
//
//		for (int[] interval : ans) {
//			System.out.println(Arrays.toString(interval));
//		}
//	}
//}