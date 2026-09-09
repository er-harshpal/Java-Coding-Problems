package Stack;

public class StackUsingLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static class MyStack{
		Node top;

		void push(int value){
			Node newNode = new Node(value);
			newNode.next = top;
			top = newNode;
		}

		int pop() {
			if(top == null){
				return -1;
			}
			int value = top.data;

			top = top.next;
			return value;
		}

		int peek() {
			if(top == null){
				return -1;
			}
			return top.data;
		}

		boolean isEmpty(){
			return top == null;
		}
	}

	public static void main(String[] args){

		MyStack  ack  = new MyStack();

		ack.push(10);
		ack.push(20);
		ack.push(30);

		System.out.println("Top: " + ack.peek());

		System.out.println("Popped: " + ack.pop());
		System.out.println("Popped: " + ack.pop());

		System.out.println("Top: " + ack.peek());

		System.out.println("Is empty: " + ack.isEmpty());

		System.out.println("Popped: " + ack.pop());

		System.out.println("Is empty: " + ack.isEmpty());
	}
}
