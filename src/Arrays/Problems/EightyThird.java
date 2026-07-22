//package Arrays.Problems;
//import java.util.*;
//
//public class EightyThird {
//		public static int[][] insert(int[][] intervals, int[] newInterval) {
//
//			List<int[]> ans = new ArrayList<>();
//			int i = 0;
//			int n = intervals.length;
//
//			// 1. Add all intervals that come before newInterval
//			while (i < n && intervals[i][1] < newInterval[0]) {
//				ans.add(intervals[i]);
//				i++;
//			}
//
//			// 2. Merge all overlapping intervals
//			while (i < n && intervals[i][0] <= newInterval[1]) {
//				newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
//				newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
//				i++;
//			}
//
//			// 3. Add the merged interval
//			ans.add(newInterval);
//
//			// 4. Add the remaining intervals
//			while (i < n) {
//				ans.add(intervals[i]);
//				i++;
//			}
//
//			return ans.toArray(new int[ans.size()][]);
//		}
//
//		public static void main(String[] args) {
//
//			int[][] intervals = {
//					{1,2},{3,5},{6,7},{8,10},{12,16}
//			};
//
//			int[] newInterval = {4,8};
//
//			int[][] result = insert(intervals, newInterval);
//
//			for (int[] interval : result) {
//				System.out.println(Arrays.toString(interval));
//			}
//		}
//	}
