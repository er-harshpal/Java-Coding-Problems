package Arrays.Concepts.search;
import java.util.HashMap;

public class majorityElement {
        public static void main(String[] args) {
            int arr[] = {2,3,3,3,1,3,5};
            int n = arr.length;
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0; i<n; i++){
                hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            }

            for (int key : hm.keySet()){
                if(hm.get(key)>=n/2){
                    System.out.println("Key: "+key+"Value: "+ hm.get(key));
                }
            }
        }
}
