//import java.util.*;
//
//public class Ninety {
//
//	public static boolean canAttendMeetings(int[][] intervals) {
//
//		// Sort by start time
//		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//
//		// Compare every meeting with the previous one
//		for (int i = 1; i < intervals.length; i++) {
//
//			if (intervals[i][0] < intervals[i - 1][1]) {
//				return false;
//			}
//		}
//
//		return true;
//	}
//
//	public static void main(String[] args) {
//
//		int[][] intervals = {
//				{0, 30},
//				{5, 10},
//				{15, 20}
//		};
//
//		System.out.println(canAttendMeetings(intervals));
//	}
//}