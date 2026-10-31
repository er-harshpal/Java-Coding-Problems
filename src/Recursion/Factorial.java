package Recursion;

public class Factorial {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(calc(n));
	}

	static int calc(int n) {
		if (n == 0) {
			return 1;
		}
		return n * calc(n - 1);
	}
}