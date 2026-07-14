package PracticeProblems;

import static jdk.internal.net.http.common.Utils.stringOf;

public class NthIndex {
	public static void main(String[] args){
		int n = 10;
		int start = 1;
		int count = 9;
		int length = 1;
		while(n>count*length){
			n = n - count*start;
			start *= 10;
			count *= 10;
			length++;
		}
		int number = start + (n-1)/length;
		int index = n-1 % length;
		System.out.println(String.valueOf(number).charAt(index) - '0');
	}
}

