package Basics;
public class FunctionsInJava {
	public static int f(int x){
		int xsq = x * x;
		return xsq;
	}
	public static void main(String[] args){
		int x = 4;
		System.out.println(f(x));
	}
}