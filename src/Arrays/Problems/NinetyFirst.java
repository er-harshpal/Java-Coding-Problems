//import java.util.*;
//
//public class NinetyFirst {
//
//	public static int minMeetingRooms(int[][] intervals) {
//
//		if (intervals.length == 0)
//			return 0;
//
//		// Sort meetings by start time
//		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//
//		// Min Heap stores ending times
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//		// First meeting occupies one room
//		pq.offer(intervals[0][1]);
//
//		for (int i = 1; i < intervals.length; i++) {
//
//			// If the earliest room is free
//			if (intervals[i][0] >= pq.peek()) {
//				pq.poll();
//			}
//
//			// Allocate the current meeting
//			pq.offer(intervals[i][1]);
//		}
//
//		return pq.size();
//	}
//
//	public static void main(String[] args) {
//
//		int[][] intervals = {
//				{0,30},
//				{5,10},
//				{15,20}
//		};
//
//		System.out.println(minMeetingRooms(intervals));
//	}
//}