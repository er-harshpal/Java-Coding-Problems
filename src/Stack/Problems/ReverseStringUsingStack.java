package Stack.Problems;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args){
		Stack<Character> stk = new Stack<>();

		String str = "Harsh";

		for(char ch: str.toCharArray()){
			stk.push(ch);
		}

		StringBuilder result = new StringBuilder();

		while(!stk.isEmpty()){
			result.append(stk.pop());
		}
		System.out.println(result);

	}




}
