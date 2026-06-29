//package Arrays;
//
//public class rotateLeft {
//    public static void main(String args[]){
//        int arr[] = {2,4,6,8,9};
//        int d = 2;
//        for (int i=0; i<d; i++){
//            int temp = arr[i];
//            arr[i] = arr[d-i];
//            arr[d-i] = temp;
//        }
//        for ( int j=d-1; j>=0; j--){
//            int temp2 = arr[j];
//            arr[j] = arr[j];
//            arr[j] = temp2;
//        }
//
//        for (int i=0; i<arr.length; i++){
//            int temp3 = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp3;
//        }
//        System.out.println(arr);
//    }
//}
//


package Arrays.basics;

//
//public class rotateLeft {
//
//    // Function to reverse a part of the array
//    public static void reverse(int arr[], int left, int right) {
//        while (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {2, 4, 6, 8, 9};
//        int d = 2;
//
//        // Handle cases where d > array length
//        d = d % arr.length;
//
//        // Step 1: Reverse first d elements
//        reverse(arr, 0, d - 1);
//
//        // Step 2: Reverse remaining elements
//        reverse(arr, d, arr.length - 1);
//
//        // Step 3: Reverse the entire array
//        reverse(arr, 0, arr.length - 1);
//
//        System.out.println(Arrays.toString(arr));
//    }
//}



// Java Program to right rotate the array by d positions
// by rotating one element at a time


class rotateRight{

    // Function to right rotate array by d positions
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {

            // Right rotate the array by one position
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

