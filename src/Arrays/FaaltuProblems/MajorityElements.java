package Arrays.FaaltuProblems;

import java.util.HashMap;
public int getVal(int[] arr){
	int val = arr[0], count = 1;

	for (int i = 1; i < arr.length; i++){
		if(arr[i] == val){
			count++;
		}
		else {
			count --;
		}
		if(count == 0){
			count = 1;
			val = arr[i];
		}
	} return val;
}
public int majorElement (int [] arr){
	if(arr.length == 0) return 0;
	int temp = getVal(arr);
	int count = 0;
	for(int i=0; i<arr.length; i++){
		if(arr[i] == temp) count ++;
	}
	if(count > arr.length/2) return temp;
	return -1;
}