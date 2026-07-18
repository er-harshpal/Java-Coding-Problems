package Arrays.Concepts.search;
import java.util.*;

public class frequencyCounter {
    public static void main(String[] args){
        int arr[] = {2,4,5,6,8,4,7,9};
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }System.out.println(hm);
    }
}
