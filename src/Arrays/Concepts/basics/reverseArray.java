package Arrays.Concepts.basics;

public class reverseArray {
    public static class Main {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {

                // XOR Swap
                arr[left] = arr[left] ^ arr[right];
                arr[right] = arr[left] ^ arr[right];
                arr[left] = arr[left] ^ arr[right];

                left++;
                right--;
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}