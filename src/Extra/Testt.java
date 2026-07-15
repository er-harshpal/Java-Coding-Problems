package Extra;//public class testt {
//	public static void main(String[] args){
//		int arr[] = {5,2,8,9,7};
//		int target = 9;
//		for(int i=0; i<arr.length; i++){
//			int ele = target - arr[i];
//			for(int j=i+1; j<arr.length; j++){
//				if(ele == arr[j]){
//					System.out.println("This is the second index"+j);
//					System.out.println("This is the first index"+i);
//					break;
//				}
//			}
//		}
//	}
//}
import java.util.*;

public class Testt {
	public static void main(String[] args) {
		int arr[] = {5, 2, 3, 4, 1};
		int target = 5;
		Testt t = new Testt();
		t.test(arr, target);
	}

	public int[] test(int arr[], int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int newEle = target - arr[i];
			if (hm.containsKey(newEle) == true) {
				System.out.print(hm.get(newEle);
     			System.out.println(i);
				return new int[]{hm.get(newEle), i};
			} else {
				hm.put(arr[i], i);
			}
		}
		return new int[]{-1};
	}
}

