//// Brute Force Recursive
//public class Fibonacci {
//		public int fib(int n) {
//			if(n < 0){
//				return -1;
//			}
//			else if (n == 0){
//				return 0;
//			}
//			else if( n == 1 ){
//				return 1;
//			}
//			else{
//				int x = fib(n-1) + fib(n-2);
//				return x;
//			}
//		}
//		public static void main(){
//			Fibonacci fibb = new Fibonacci();
//			fibb.fib(12);
//	}
//}





//// Using Memoization using Array
//import java.util.Arrays;
//
//public class Fibonacci {
//	static int[] dp;
//
//	static int fib(int n){
//		if(n<=1) return n ;
//		if(dp[n] != -1) return dp[n]; // Return Cached Value
//		dp[n] = fib(n-1) + fib(n-2); // Store Resultt
//		return dp[n];
//	}
//	public static void main(String[] args){
//		int n =10;
//		dp = new int[n+1];
//		Arrays.fill(dp, -1);
//		System.out.println("Fibonacci of" + n + " is:" + fib(n));
//	}
//}



//// Using Tabulation
//import java.util.*;
//public class Fibonacci{
//	static int fib(int n){
//		if(n <= 1) return n;
//		int[] dp = new int[n+1];
//		dp[0] = 0;
//		dp[1] = 1;
//		for (int i=2; i<= n; i++){
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		return dp[n];
//	}
//	public static void main(String[] args){
//		int n = 10;
//		System.out.println("Fibonacci of "+ n + " is: "+ fib(n));
//	}
//}






//// Using Space Optimization
//public class Fibonacci{
//	static int fib(int n){
//		if(n<=1) return n;
//		int prev2 = 0;
//		int prev1 = 1;
//		int current  = 0;
//		for(int i = 2; i<=n; i++){
//			current = prev1 + prev2;
//			prev2 = prev1;
//			prev1 = current;
//		}
//		return current;
//	}
//
//	public static void main(String[] args){
//		int  n= 10;
//		System.out.println("Fibonacci of "+ n + " is: " + fib(n));
//	}
//}