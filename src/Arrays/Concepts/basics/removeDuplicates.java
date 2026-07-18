package Arrays.Concepts.basics;


// Using Set
//public class removeDuplicates {
//    // Function to remove duplicate from array
//    public static void remove(int[] a){
//        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
//
//        // adding elements to LinkedHashSet
//        for (int i=0; i<a.length; i++){
//            s.add(a[i]);
//        }
//
//        System.out.println(s);
//    }
//
//    public static void main(String[] args){
//        int a[] = {1,2,2,3,3,4,5};
//
//        // Function Call
//        remove(a);
//    }
//}



//// Using Extra Space
//// From the array using extra space
//import java.util.Arrays;
//public class removeDuplicates{
//    public static int remove(int a[], int n){
//        if(n==0 || n==1){
//            return n;
//        }
//        // Sort the input array
//        Arrays.sort(a);
//
//
//        // Create another array for only storing
//        // the unique elements
//        int[] t = new int[n];
//        int j = 0;
//
//        for (int i=0; i<n; i++){
//            if(a[i]!=n){
//                t[j++]=a[i];
//            }
//        }
//
//        // Adding last element to the array
//        t[j++] = a[n-1];
//
//        // Changing the original array
//        for(int i=0; i<n-1; i++){
//            a[i]=t[i];
//        }
//
//        return j;
//    }
//
//    public static void main(String[] args) {
//        int a[] = {1,2,3,1,4,2,1,5};
//        int n=a.length;
//
//        n=remove(a,n);
//
//        for(int i=0; i<n; i++){
//            System.out.print(a[i] + " ");
//        }
//    }
//}



// Using hashmap
import java.util.*;
class removeDuplicates {
    static void remove(int[] a, int n) {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i<n ; i++){
            //print element if it is not
            // in the hashmap and insert
            // the element in the hash map
            if(hm.get(a[i]) == null)
            {
                hm.put(a[i], true);
                System.out.println(a[i] + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,4,2,1,5};

        int n = arr.length;
        remove(arr, n);
    }
}
