//package Stack.Problems;
//
//import java.util.*;
//
//public class PrevGreatestElement {
//	public static void main(String[] args){
//		int[] arr = {10,4,2,20,40,12,30};
//		System.out.println(Arrays.toString(solution(arr)));
//	}
//	public static int[] solution(int[] arr){
//		int[] newArr = new int[7];
//		Stack<Integer> stack =new Stack<>();
//		for(int i=0; i<arr.length; i++){
//
//			while(!stack.isEmpty() && stack.peek()<=arr[i]){
//				stack.pop();
//			}
//			if(stack.isEmpty()){
//				newArr[i] = -1;
//			}
//			else{
//				newArr[i] = stack.peek();
//			}
//
//			stack.push(arr[i]);
//		}
//		return newArr;
//	}
//}




import java.util.*;

public class PrevGreatestElement {

	static int[] previousGreater(int[] arr) {

		int n = arr.length;
		int[] result = new int[n];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {

			while (!stack.isEmpty() &&
					stack.peek() <= arr[i]) {

				stack.pop();
			}

			if (stack.isEmpty()) {
				result[i] = -1;
			}
			else {
				result[i] = stack.peek();
			}

			stack.push(arr[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = {10, 4, 2, 20, 40, 12, 30};

		System.out.println(
				Arrays.toString(previousGreater(arr))
		);
	}
}