package Arrays.search;//package Arrays.search;
//
//import java.util.HashMap;
//
//public class majorityElement2 {
//        public static void main(String[] args) {
//            int arr[] = {2,3,3,3,1,3,5};
//            int n = arr.length;
//            HashMap<Integer, Integer> hm = new HashMap<>();
//            for(int i=0; i<n; i++){
//                hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
//            }
//
//            for (int key : hm.keySet()){
//                if(hm.get(key)>=n/3){
//                    System.out.println("Key: "+key+"Value: "+ hm.get(key));
//                }
//            }
//        }
//    }


/// MOORE ALGORITHM

public class majorityElement2 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,2,3,2,4,2,5,2,2,2};
        int candidate = 0;
        int count = 0;

        // Phase 1: Find Candidate
        for (int num : arr) {

            if (count == 0)
                candidate = num;

            if (num == candidate)
                count++;
            else
                count--;
        }

        // Phase 2: Verify candidate
        count = 0;

        for (int num : arr) {
            if (num == candidate)
                count++;
        }

        if (count > arr.length / 2) {
            System.out.println(candidate);
        }else{
            System.out.println("no");
        }
    }
}