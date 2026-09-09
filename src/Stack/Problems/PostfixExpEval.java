package Stack.Problems;

import java.util.Stack;

public class PostfixExpEval {
	static int evaluate(String exp){
		Stack<Integer> stack = new Stack<>();
		for(char ch : exp.toCharArray()){
			if(Character.isDigit(ch)){
				stack.push(ch - '0');
			}

			else {
				int b = stack.pop();
				int a = stack.pop();

				int result = 0;

				switch(ch) {
					case '+':
						result = a+b;
						break;

					case '-':
						result = a - b;
						break;

					case '*':
						result = a * b;
						break;

					case '/':
						result = a / b;
						break;

				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
}
