//package DynamicProgramming.OneD;
//
//public class Tribonacci {
//
//	public static void main(String[] args) {
//		int n = 3;
//		System.out.println("Tribonacci Number: " + tribonacciCalc(n));
//	}
//
//	public static int tribonacciCalc(int n) {
//
//		// Base Cases
//		if (n == 0) return 0;
//		if (n == 1 || n == 2) return 1;
//
//		int thirdLast = 0; // T0
//		int secondLast = 1; // T1
//		int last = 1; // T2
//
//		int current = 0;
//// Harsh Pal
//		for (int i = 3; i <= n; i++) {
//			current = thirdLast + secondLast + last;
//
//			// Shift the values
//			thirdLast = secondLast;
//			secondLast = last;
//			last = current;
//		}
//
//		return current;
//	}
//}