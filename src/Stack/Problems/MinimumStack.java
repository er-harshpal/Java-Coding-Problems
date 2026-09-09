package Stack.Problems;
import java.util.*;

public class MinimumStack {
	public static void main(String[] args){

	}
	class minStack {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> minStack = new Stack <>();

		void push(int value){
			stack.push(value);
				if(minStack.isEmpty() || value <= minStack.peek()){
				minStack.push(value);
			}
		}

		int pop(){
		int value = stack.pop();

		if(value == minStack.peek()){
			minStack.pop();
		   }
		return value;
		}

		int peek() {
		return stack.peek();
		}

		int getMin(){
			return minStack.peek();
		}
	  }
	}
