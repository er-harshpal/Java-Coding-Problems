package Stack.Problems;
import java.util.*;

public class QueueUsingTwoStack {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	void enqueue(int value) {
		s1.push(value);
	}
	int dequeue(){
		if(s1.isEmpty() && s2.isEmpty()){
			return -1;
		}
		if(s2.isEmpty()){
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
}
