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




//package DynamicProgramming.OneD;
//
//public class Tribonacci {
//
//	public static void main(String[] args){
//		int n = 10;
//		System.out.println("Tribonacci Series "+tribonacciCalc(n));
//	}
//
//	static int tribonacciCalc(int n){
//		// Base Case 1
//		if(n==0 || n < 1)
//			return 0;
//		if(n == 1)
//			return 1;
//		if(n == 2)
//			return 1;
//
//		// Values Assigning
//		int firstNeighbour = 1;
//		int secondNeighbour = 1;
//		int thirdNeighbour = 0;
//		int triboSum = firstNeighbour + secondNeighbour + thirdNeighbour;
//		for(int i=2; i<n; i++){
//			firstNeighbour = firstNeighbour + 1;
//			secondNeighbour = firstNeighbour;
//			thirdNeighbour = secondNeighbour;
//			triboSum = firstNeighbour + secondNeighbour + thirdNeighbour;
//		}
//		return triboSum;
//	}
//}
