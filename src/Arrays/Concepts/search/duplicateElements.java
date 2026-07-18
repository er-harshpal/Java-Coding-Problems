package Arrays.Concepts.search;

import java.util.HashMap;

public class duplicateElements {

        public static void main(String[] args) {
            int arr[] = {2,3,5,6,7,8,7,5,3,2,3,4,6,7,7,6,5,3,32,2,1,1,3,4,5,6};
            int n = arr.length;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0; i<n; i++){
                hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            }

            for (int key : hm.keySet()){
                if(hm.get(key)>=2){
                    System.out.println(key);
                }
            }
        }
}
