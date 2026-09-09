package Stack.Problems;
import java.util.*;

//public class NextGreaterElement {
//	public static void main(String[] args){
//		int[] arr = {4,5,2,10,8};
//		int[] newArr = new int[5];
//		System.out.println(Arrays.toString(solution(arr, newArr)));
//	}
//	public static int[] solution(int[] arr, int[] newArr){
//		if(arr.length == 1) return new int[] {-1};
////		if(arr.length == 0) return new int[] {0};
//		for(int i=0; i<arr.length; i++){
//			if(i == arr.length - 1){
//				newArr[arr.length -1] = -1;
//			}
//			for(int j=i+1; j<arr.length; j++){
//				if(arr[i]<arr[j]){
//					newArr[i] = arr[j];
//					break;
//				}
//			}
//		}
//		return newArr;
//	}
//}
	public class NextGreaterElement{

		static int[] nextGreater(int[] arr) {

			int n = arr.length;

			int[] result = new int[n];

			Stack<Integer> stack = new Stack<>();

			for (int i = n - 1; i >= 0; i--) {

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

			int[] arr = {4, 5, 2, 10, 8};

			int[] result = nextGreater(arr);

			System.out.println(Arrays.toString(result));
		}
	}