//package Arrays.Problems;
//
//public class SortColors {
//	public static void main(String[] args){
//		int[] arr = {1,2,1,2,1,0,0,1,0,1,2};
//		System.out.println(solution(arr));
//	}
//	public static int[] solution(int[] arr){
//		int i = 0, j = 0, k = arr.length -1;
//		while (j<=k){
//			if(arr[j] == 0){
//				swap(arr, j, i);
//				i++;
//				j++;
//			} else if(arr[j] == 1){
//				j++;
//			} else {
//				swap(arr, j, k);
//				k--;
//			}
//		}
//		return arr;
//	}
//	public static void swap(int[] arr, int l, int r){
//		int temp = arr[l];
//		arr[l] = arr[r];
//		arr[r] = temp;
//	}
//}
