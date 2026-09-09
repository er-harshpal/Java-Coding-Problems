package Stack;
public class StackUsingArray {

	static class SUA {
		int[] arr;
		int top;

		SUA(int size){
			arr = new int[size];
			top = -1;
		}
		void push(int value){
			if(top == arr.length - 1){
				System.out.println("Stack Overflow");
				return;
			}
			top++;
			arr[top] = value;
		}

		int pop(){
			if(top == -1){
				System.out.println("Stack Underflow");
			}
			int value = arr[top];
			top --;

			return value;
		}

		int peek(){
			if(top == -1){
				System.out.println("Stack is empty");
				return -1;
			}

			return arr[top];
		}

		boolean isEmpty(){
			return top == -1;
		}
	}



	public static void main(String[] args) {

		SUA stack = new SUA(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println(stack.peek()); // 30

		System.out.println(stack.pop());  // 30
		System.out.println(stack.pop());  // 20
	}
}
