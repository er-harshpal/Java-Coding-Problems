package Arrays.prefixSum;

import java.util.HashMap;

public class countSubarraysSum {

    public class CountSubarraysWithSumK {

        public static void main(String[] args) {

            int arr[] = {1, 2, 3, -2, 5};
            int k = 3;

            HashMap<Integer, Integer> hm = new HashMap<>();

            // Prefix sum 0 occurs once initially
            hm.put(0, 1);

            int sum = 0;
            int count = 0;

            for (int num : arr) {

                // Calculate current prefix sum
                sum += num;

                // Check if (sum - k) exists
                if (hm.containsKey(sum - k)) {
                    count += hm.get(sum - k);
                }

                // Store/update current prefix sum
                hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            }

            System.out.println("Number of subarrays = " + count);
        }
    }
}

