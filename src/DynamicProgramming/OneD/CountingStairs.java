//package DynamicProgramming;
//
//public class CountingStairs {
//	int b;
//		public int climbStairs(int n) {
//			if(n<=1) return n;
//			int a = 1;
//			int b = 2;
//			for(int i=3; i<=n; i++){
//				int current = a + b;
//				a = b;
//				b = current;
//			}
//			return b;
//		}
//		public static void main(String[] args){
//		int n = 6;
//		CountingStairs s = new CountingStairs();
//		System.out.println(s.climbStairs(6));
//		}
//	}
//
