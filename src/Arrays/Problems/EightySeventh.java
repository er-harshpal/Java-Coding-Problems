//package Arrays.Problems;
//import java.util.*;
//
//public class EightySeventh {
//	public static void main(String[] args) {
//		int[][] points = {
//				{2, 4}, {3, 8}, {1, 2}
//		};
//		System.out.println(balloonBurst(points));
//	}
//	public static int balloonBurst(int[][] points){
//				if(points.length == 0)
//					return 0;
//
//				Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
//
//				int arrows = 1;
//				int arrowPos = points[0][1];
//
//				for(int i = 1; i < points.length; i++) {
//
//					if(points[i][0] > arrowPos) {
//						arrows++;
//						arrowPos = points[i][1];
//					}
//				}
//				return arrows;
//			}
//		}
