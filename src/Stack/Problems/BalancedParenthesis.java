package Stack.Problems;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args){
		String str = "{}{}{{{{";
		Stack<Character> stk = new Stack<>();
		for (int i=0; i<str.length(); i++){
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ){
				stk.push(str.charAt(i));
			}
			if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']' ){
				stk.pop();
			}
		}if(str.isEmpty()){
			System.out.println("The parenthesis are correct");
		}
		else{
			System.out.println("The parenthesis are incorrect");
		}
	}
}
