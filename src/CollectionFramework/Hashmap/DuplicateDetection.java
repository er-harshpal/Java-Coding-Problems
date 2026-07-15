package CollectionFramework.Hashmap;

import java.util.HashMap;

public class DuplicateDetection {
	public static void main(String[] args){
		DuplicateDetection dd = new DuplicateDetection();
		int arr[] = {2,4,5,6,2,5,4};
		dd.duplicateDetection(arr);
	}
	public void duplicateDetection(int arr[]){
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i=0; i<arr.length; i++){
			if(hm.containsKey(arr[i])){
				int currentCount = hm.get(arr[i]);
				hm.put(arr[i], currentCount + 1);
			}
			else {
				hm.put( arr[i], 1);
			}
		}
		System.out.println(hm);
	}
}
