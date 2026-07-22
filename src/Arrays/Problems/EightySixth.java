////package Arrays.Problems;
////
////import java.util.Stack;
////
/////// This is the brute force approach
////public class EightySixth {
////	public static void main(String[] args){
////		int[] heights = {2,1,5,6,2,3};
////	}
////	public static int movement(int[] heights){
////		// random bar like hegiht[0]
////		// if the bar right from the zeroth is greater
////		// or equal we will take that bar and
////		// width will become that the fromula says
////		// i m not understanding how to use the stack here?
////	}
////}
//
//
//
///// Lets use the monotonic stack approach
//
//import java.util.Stack;
//
//public class EightySixth {
//
//	public static int largestRectangleArea(int[] heights) {
//
//		Stack<Integer> st = new Stack<>();
//		int maxArea = 0;
//		int n = heights.length;
//
//		// Traverse one extra time (i == n)
//		for (int i = 0; i <= n; i++) {
//
//			// Imaginary bar of height 0 at the end
//			int currHeight = (i == n) ? 0 : heights[i];
//
//			// Pop until stack becomes increasing
//			while (!st.isEmpty() && heights[st.peek()] > currHeight) {
//
//				// Height of rectangle
//				int height = heights[st.pop()];
//
//				int width;
//
//				// No smaller element on left
//				if (st.isEmpty()) {
//					width = i;
//				}
//				// Previous smaller element exists
//				else {
//					width = i - st.peek() - 1;
//				}
//
//				int area = height * width;
//				maxArea = Math.max(maxArea, area);
//			}
//
//			// Push current index
//			st.push(i);
//		}
//
//		return maxArea;
//	}
//
//	public static void main(String[] args) {
//
//		int[] heights = {2,1,5,6,2,3};
//
//		System.out.println(largestRectangleArea(heights));
//	}
//}