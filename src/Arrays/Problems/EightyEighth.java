//import java.util.HashMap;
//
/////  Mazimum Points on a line
//
//public class EightyEighth{
//	public static void main(String[] args){
//		int[][] nums = {
//				{1,2},{1,1},{2,2},{3,3},{4,4}
//		};
//		System.out.println(geometry(nums));
//	}
//	public static int geometry(int[][] nums){
//		int answer = 1;
//		for(int i = 0; i < nums.length; i++){
//			// Every fixed point gets its own HashMap
//			HashMap<Double, Integer> hm = new HashMap<>();
//			for(int j = 0; j < nums.length; j++){
//				if(i == j)
//					continue;
//				int x1 = nums[i][0];
//				int y1 = nums[i][1];
//				int x2 = nums[j][0];
//				int y2 = nums[j][1];
//				int dy = y2 - y1;
//				int dx = x2 - x1;
//				double slope;
//				if(dx == 0){
//					slope = Double.POSITIVE_INFINITY;
//				}
//				else{
//					slope = (double) dy / dx;
//				}
//				hm.put(slope, hm.getOrDefault(slope, 0) + 1);
//				answer = Math.max(answer, hm.get(slope) + 1);
//			}
//		}
//
//		return answer;
//	}
//}
//
//
