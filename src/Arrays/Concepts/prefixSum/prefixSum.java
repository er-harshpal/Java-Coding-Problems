package Arrays.Concepts.prefixSum;

import java.util.Arrays;

public class prefixSum {

    public static void main(String[] args) {

        int arr[] = {2,4,6,8};

        int prefix[] = new int[arr.length];

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum += arr[i];

            prefix[i] = sum;
        }

        System.out.println(Arrays.toString(prefix));
    }
}
